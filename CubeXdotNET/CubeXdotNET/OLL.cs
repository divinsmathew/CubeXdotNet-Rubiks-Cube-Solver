namespace CubeXdotNET
{
    public static class OLL
    {
        public static void Solve(FredrichSolver ScrambledCube)
        {
            int i, c;
            int[] YellowPostionsAtOLL = new int[20];
            
            for (c = 0, i = 0; i < 20; i++)
                if (ScrambledCube.Cube[Constants.YellowEdges[i]] == 121)
                    YellowPostionsAtOLL[c++] = Constants.YellowEdges[i];

            if (c != 8)
            {
                ScrambledCube.ErrorCode = -6;
                return;
            } //error @ OLL
            
            if (!(ScrambledCube.Cube[36] == 121 && ScrambledCube.Cube[37] == 121 && ScrambledCube.Cube[38] == 121 && ScrambledCube.Cube[39] == 121 && ScrambledCube.Cube[41] == 121 && ScrambledCube.Cube[42] == 121 && ScrambledCube.Cube[43] == 121 && ScrambledCube.Cube[44] == 121))
                MoveOLL(ScrambledCube, YellowPostionsAtOLL);
        }

        private static void MoveOLL(FredrichSolver ScrambledCube, int[] YellowPositions)
        {
            int i, j, k, c;
            ScrambledCube.Solution += " ";

            for (i = 0; i < 232; i++)
            {
                if ((i + 1) == 29 || (i + 1) == 30 || (i + 1) == 31 || (i + 1) == 32)
                    continue;
                for (c = 0, j = 0; j < 8; j++)
                    for (k = 0; k < 8; k++)
                        if (Constants.OLL_Capsules[i, j] == YellowPositions[k])
                            c++;

                if (c == 8)
                    switch ((i + 1) % 4)
                    {
                        case 1: ScrambledCube.Solution += Constants.OLL_Algs[i / 4];
                                Tools.RotateCube(ScrambledCube, 7, i / 4);
                                return;
                        case 2: ScrambledCube.Solution += Tools.yPerm(Constants.OLL_Algs[i / 4]);
                                Tools.RotateCube(ScrambledCube, 8, i / 4);
                                return;
                        case 3: ScrambledCube.Solution += Tools.y2Perm(Constants.OLL_Algs[i / 4]);
                                Tools.RotateCube(ScrambledCube, 9, i / 4);
                                return;
                        case 0: ScrambledCube.Solution += Tools.ydPerm(Constants.OLL_Algs[i / 4]);
                                Tools.RotateCube(ScrambledCube, 6, i / 4);
                                return;
                    }
            }
        }
    }
}
