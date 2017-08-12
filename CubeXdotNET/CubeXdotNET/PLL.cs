using System;

namespace CubeXdotNET
{
    public static class PLL
    {
        public static void Solve(FredrichSolver ScrambledCube)
        {
            int i, j, c;
            int[,] YellowPositions = new int[4, 3];

            try
            {
                for (i = j = c = 0; i < 12; i++)     //green
                    if (ScrambledCube.Cube[Constants.YellowEdges[i]] == 103)
                    {
                        YellowPositions[0, j++] = Constants.YellowEdges[i];
                        c++;
                    }

                for (i = j = 0; i < 12; i++)		//orange
                    if (ScrambledCube.Cube[Constants.YellowEdges[i]] == 111)
                    {
                        YellowPositions[1, j++] = Constants.YellowEdges[i];
                        c++;
                    }

                for (i = j = 0; i < 12; i++)		//blue
                    if (ScrambledCube.Cube[Constants.YellowEdges[i]] == 98)
                    {
                        YellowPositions[2, j++] = Constants.YellowEdges[i];
                        c++;
                    }
                for (i = j = 0; i < 12; i++)		//red
                    if (ScrambledCube.Cube[Constants.YellowEdges[i]] == 114)
                    {
                        YellowPositions[3, j++] = Constants.YellowEdges[i];
                        c++;
                    }
            }
            catch (IndexOutOfRangeException)//error @ PLL
            {
                ScrambledCube.ErrorCode = -7;
                return;
            }

            if (c != 12)
            {
                ScrambledCube.ErrorCode = -8;
                return;
            } //error @ PLL


            if (!(ScrambledCube.Cube[0] == 103 && ScrambledCube.Cube[1] == 103 && ScrambledCube.Cube[2] == 103 && ScrambledCube.Cube[9] == 111 && ScrambledCube.Cube[10] == 111 && ScrambledCube.Cube[11] == 111 && ScrambledCube.Cube[18] == 98 && ScrambledCube.Cube[19] == 98 && ScrambledCube.Cube[20] == 98 && ScrambledCube.Cube[27] == 114 && ScrambledCube.Cube[28] == 114 && ScrambledCube.Cube[29] == 4))
                MovePLL(ScrambledCube, YellowPositions);


            switch (ScrambledCube.Cube[1])
            {
                case 'r': ScrambledCube.Solution += " U";
                    Tools.RotateCube(ScrambledCube, 0, 0);
                    break;
                case 'o': ScrambledCube.Solution += " U'";
                    Tools.RotateCube(ScrambledCube, 0, 1);
                    break;
                case 'b': ScrambledCube.Solution += " U2";
                    Tools.RotateCube(ScrambledCube, 0, 2);
                    break;
            }
        }

        private static void MovePLL(FredrichSolver ScrambledCube, int[,] YellowPositions)
        {
            int i, j, k, c, m, n, ac;

            for (i = 0; i < 88; i++)
                for (j = 0, c = 0; j < 4; j++)
                {
                    for (k = 0; k < 4; k++)
                    {
                        for (ac = 0, m = 0; m < 3; m++)
                            for (n = 0; n < 3; n++)
                                if (Constants.PLL_Capsules[i, j, m] == YellowPositions[k, n])
                                    ac++;
                        if (ac == 3)
                            c++;
                    }
                    if (c == 4)
                    {
                        switch ((i + 1) % 4)
                        {
                            case 1: ScrambledCube.Solution += " ";
                                ScrambledCube.Solution += Constants.PLL_Algs[i / 4];
                                Tools.RotateCube(ScrambledCube, 11, i / 4);
                                return;
                            case 2: ScrambledCube.Solution += " U ";
                                ScrambledCube.Solution += Constants.PLL_Algs[i / 4];
                                Tools.RotateCube(ScrambledCube, 12, i / 4);
                                return;
                            case 3: ScrambledCube.Solution += " U2 ";
                                ScrambledCube.Solution += Constants.PLL_Algs[i / 4];
                                Tools.RotateCube(ScrambledCube, 13, i / 4);
                                return;
                            case 0: ScrambledCube.Solution += " U' ";
                                ScrambledCube.Solution += Constants.PLL_Algs[i / 4];
                                Tools.RotateCube(ScrambledCube, 10, i / 4);
                                return;
                        }
                    }
                }
        }
    }
}
