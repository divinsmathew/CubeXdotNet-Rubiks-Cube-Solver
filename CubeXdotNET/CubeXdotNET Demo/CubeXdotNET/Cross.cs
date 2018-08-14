namespace CubeXdotNET
{
    public static class Cross
    {
        public static void Solve(FridrichSolver ScrambledCube)
        {
            int i, c;

            for (i = 0, c = 0; i < 24; i++)
                if (ScrambledCube.Cube[Constants.EdgePositions[i]] == 119) //Counts White Edges
                    c++;

            if (c != 4)
            {
                ScrambledCube.ErrorCode = -1;
                return;
            }///////problem @crss


            for (c = 0, i = 0; i < 24; i++)  //green
            {
                if (ScrambledCube.Cube[50] == 119 && ScrambledCube.Cube[7] == 103)
                {
                    c++; break;
                }
                if (ScrambledCube.Cube[Constants.EdgePositions[i]] == 119 && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.EdgePositions[i])] == 103)
                {
                    MoveCross(ScrambledCube, 2, Constants.EdgePositions[i]);
                    break;
                }
            }
            for (i = 0; i < 24; i++)  //orange
            {
                if (ScrambledCube.Cube[52] == 119 && ScrambledCube.Cube[16] == 111)
                {
                    c++; break;
                }
                if (ScrambledCube.Cube[Constants.EdgePositions[i]] == 119 && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.EdgePositions[i])] == 111)
                {
                    MoveCross(ScrambledCube, 12, Constants.EdgePositions[i]);
                    break;
                }
            }
            for (i = 0; i < 24; i++)  //blue
            {
                if (ScrambledCube.Cube[48] == 119 && ScrambledCube.Cube[25] == 98)
                {
                    c++; break;
                }
                if (ScrambledCube.Cube[Constants.EdgePositions[i]] == 119 && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.EdgePositions[i])] == 98)
                {
                    MoveCross(ScrambledCube, 1, Constants.EdgePositions[i]);
                    break;
                }
            }
            for (i = 0; i < 24; i++)  //red
            {
                if (ScrambledCube.Cube[46] == 119 && ScrambledCube.Cube[34] == 114)
                {
                    c++; break;
                }
                if (ScrambledCube.Cube[Constants.EdgePositions[i]] == 119 && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.EdgePositions[i])] == 114)
                {
                    MoveCross(ScrambledCube, 4, Constants.EdgePositions[i]);
                    break;
                }
            }
        }

        private static void MoveCross(FridrichSolver ScrambledCube, int Face, int WhiteEdge)
        {
            switch (Face)
            {
                case 2:
                    switch (WhiteEdge)
                    {
                        case 1:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[23];
                            Tools.RotateCube(ScrambledCube, 1, 23);
                            return;

                        case 41:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[24];
                            Tools.RotateCube(ScrambledCube, 1, 24);
                            return;

                        case 10:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[25];
                            Tools.RotateCube(ScrambledCube, 1, 25);
                            return;

                        case 37:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[26];
                            Tools.RotateCube(ScrambledCube, 1, 26);
                            return;

                        case 19:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[27];
                            Tools.RotateCube(ScrambledCube, 1, 27);
                            return;

                        case 39:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[28];
                            Tools.RotateCube(ScrambledCube, 1, 28);
                            return;

                        case 28:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[29];
                            Tools.RotateCube(ScrambledCube, 1, 29);
                            return;

                        case 43:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[30];
                            Tools.RotateCube(ScrambledCube, 1, 30);
                            return;

                        case 5:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[31];
                            Tools.RotateCube(ScrambledCube, 1, 31);
                            return;

                        case 12:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[32];
                            Tools.RotateCube(ScrambledCube, 1, 32);
                            return;

                        case 14:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[33];
                            Tools.RotateCube(ScrambledCube, 1, 33);
                            return;

                        case 21:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[34];
                            Tools.RotateCube(ScrambledCube, 1, 34);
                            return;

                        case 23:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[35];
                            Tools.RotateCube(ScrambledCube, 1, 35);
                            return;

                        case 30:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[36];
                            Tools.RotateCube(ScrambledCube, 1, 36);
                            return;

                        case 32:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[37];
                            Tools.RotateCube(ScrambledCube, 1, 37);
                            return;

                        case 3:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[38];
                            Tools.RotateCube(ScrambledCube, 1, 38);
                            return;

                        case 7:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[39];
                            Tools.RotateCube(ScrambledCube, 1, 39);
                            return;

                        case 16:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[40];
                            Tools.RotateCube(ScrambledCube, 1, 40);
                            return;

                        case 52:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[41];
                            Tools.RotateCube(ScrambledCube, 1, 41);
                            return;

                        case 25:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[42];
                            Tools.RotateCube(ScrambledCube, 1, 42);
                            return;

                        case 48:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[43];
                            Tools.RotateCube(ScrambledCube, 1, 43);
                            return;

                        case 34:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[44];
                            Tools.RotateCube(ScrambledCube, 1, 44);
                            return;

                        case 46:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[45];
                            Tools.RotateCube(ScrambledCube, 1, 45);
                            return;
                    }
                    break;
                case 12:
                    switch (WhiteEdge)
                    {
                        case 1:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[0];
                            Tools.RotateCube(ScrambledCube, 1, 0);
                            return;

                        case 41:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[1];
                            Tools.RotateCube(ScrambledCube, 1, 1);
                            return;

                        case 10:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[2];
                            Tools.RotateCube(ScrambledCube, 1, 2);
                            return;

                        case 37:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[3];
                            Tools.RotateCube(ScrambledCube, 1, 3);
                            return;

                        case 19:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[4];
                            Tools.RotateCube(ScrambledCube, 1, 4);
                            return;

                        case 39:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[5];
                            Tools.RotateCube(ScrambledCube, 1, 5);
                            return;

                        case 28:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[6];
                            Tools.RotateCube(ScrambledCube, 1, 6);
                            return;

                        case 43:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[7];
                            Tools.RotateCube(ScrambledCube, 1, 7);
                            return;

                        case 5:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[8];
                            Tools.RotateCube(ScrambledCube, 1, 8);
                            return;

                        case 12:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[9];
                            Tools.RotateCube(ScrambledCube, 1, 9);
                            return;

                        case 14:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[10];
                            Tools.RotateCube(ScrambledCube, 1, 10);
                            return;

                        case 21:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[11];
                            Tools.RotateCube(ScrambledCube, 1, 11);
                            return;

                        case 23:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[12];
                            Tools.RotateCube(ScrambledCube, 1, 12);
                            return;

                        case 30:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[13];
                            Tools.RotateCube(ScrambledCube, 1, 13);
                            return;

                        case 32:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[14];
                            Tools.RotateCube(ScrambledCube, 1, 14);
                            return;

                        case 3:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[15];
                            Tools.RotateCube(ScrambledCube, 1, 15);
                            return;

                        case 7:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[16];
                            Tools.RotateCube(ScrambledCube, 1, 16);
                            return;

                        case 50:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[17];
                            Tools.RotateCube(ScrambledCube, 1, 17);
                            return;

                        case 16:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[18];
                            Tools.RotateCube(ScrambledCube, 1, 18);
                            return;

                        case 25:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[19];
                            Tools.RotateCube(ScrambledCube, 1, 19);
                            return;

                        case 48:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[20];
                            Tools.RotateCube(ScrambledCube, 1, 20);
                            return;

                        case 34:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[21];
                            Tools.RotateCube(ScrambledCube, 1, 21);
                            return;

                        case 46:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[22];
                            Tools.RotateCube(ScrambledCube, 1, 22);
                            return;
                    }
                    break;
                case 1:
                    switch (WhiteEdge)
                    {
                        case 1:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[46];
                            Tools.RotateCube(ScrambledCube, 1, 46);
                            return;

                        case 41:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[47];
                            Tools.RotateCube(ScrambledCube, 1, 47);
                            return;

                        case 10:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[48];
                            Tools.RotateCube(ScrambledCube, 1, 48);
                            return;

                        case 37:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[49];
                            Tools.RotateCube(ScrambledCube, 1, 49);
                            return;

                        case 19:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[50];
                            Tools.RotateCube(ScrambledCube, 1, 50);
                            return;

                        case 39:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[51];
                            Tools.RotateCube(ScrambledCube, 1, 51);
                            return;

                        case 28:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[52];
                            Tools.RotateCube(ScrambledCube, 1, 52);
                            return;

                        case 43:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[53];
                            Tools.RotateCube(ScrambledCube, 1, 53);
                            return;

                        case 5:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[54];
                            Tools.RotateCube(ScrambledCube, 1, 54);
                            return;

                        case 12:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[55];
                            Tools.RotateCube(ScrambledCube, 1, 55);
                            return;

                        case 14:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[56];
                            Tools.RotateCube(ScrambledCube, 1, 56);
                            return;

                        case 21:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[57];
                            Tools.RotateCube(ScrambledCube, 1, 57);
                            return;

                        case 23:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[58];
                            Tools.RotateCube(ScrambledCube, 1, 58);
                            return;

                        case 30:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[59];
                            Tools.RotateCube(ScrambledCube, 1, 59);
                            return;

                        case 32:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[60];
                            Tools.RotateCube(ScrambledCube, 1, 60);
                            return;

                        case 3:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[61];
                            Tools.RotateCube(ScrambledCube, 1, 61);
                            return;

                        case 7:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[62];
                            Tools.RotateCube(ScrambledCube, 1, 62);
                            return;

                        case 50:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[63];
                            Tools.RotateCube(ScrambledCube, 1, 63);
                            return;

                        case 16:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[64];
                            Tools.RotateCube(ScrambledCube, 1, 64);
                            return;

                        case 52:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[65];
                            Tools.RotateCube(ScrambledCube, 1, 65);
                            return;

                        case 25:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[66];
                            Tools.RotateCube(ScrambledCube, 1, 66);
                            return;

                        case 34:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[67];
                            Tools.RotateCube(ScrambledCube, 1, 67);
                            return;

                        case 46:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[68];
                            Tools.RotateCube(ScrambledCube, 1, 68);
                            return;
                    }
                    break;
                case 4:
                    switch (WhiteEdge)
                    {
                        case 1:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[69];
                            Tools.RotateCube(ScrambledCube, 1, 69);
                            return;

                        case 41:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[70];
                            Tools.RotateCube(ScrambledCube, 1, 70);
                            return;

                        case 10:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[71];
                            Tools.RotateCube(ScrambledCube, 1, 71);
                            return;

                        case 37:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[72];
                            Tools.RotateCube(ScrambledCube, 1, 72);
                            return;

                        case 19:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[73];
                            Tools.RotateCube(ScrambledCube, 1, 73);
                            return;

                        case 39:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[74];
                            Tools.RotateCube(ScrambledCube, 1, 74);
                            return;

                        case 28:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[75];
                            Tools.RotateCube(ScrambledCube, 1, 75);
                            return;

                        case 43:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[76];
                            Tools.RotateCube(ScrambledCube, 1, 76);
                            return;

                        case 5:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[77];
                            Tools.RotateCube(ScrambledCube, 1, 77);
                            return;

                        case 12:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[78];
                            Tools.RotateCube(ScrambledCube, 1, 78);
                            return;

                        case 14:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[79];
                            Tools.RotateCube(ScrambledCube, 1, 79);
                            return;

                        case 21:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[80];
                            Tools.RotateCube(ScrambledCube, 1, 80);
                            return;

                        case 23:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[81];
                            Tools.RotateCube(ScrambledCube, 1, 81);
                            return;

                        case 30:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[82];
                            Tools.RotateCube(ScrambledCube, 1, 82);
                            return;

                        case 32:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[83];
                            Tools.RotateCube(ScrambledCube, 1, 83);
                            return;

                        case 3:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[84];
                            Tools.RotateCube(ScrambledCube, 1, 84);
                            return;

                        case 7:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[85];
                            Tools.RotateCube(ScrambledCube, 1, 85);
                            return;

                        case 50:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[86];
                            Tools.RotateCube(ScrambledCube, 1, 86);
                            return;

                        case 16:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[87];
                            Tools.RotateCube(ScrambledCube, 1, 87);
                            return;

                        case 52:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[88];
                            Tools.RotateCube(ScrambledCube, 1, 88);
                            return;

                        case 25:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[89];
                            Tools.RotateCube(ScrambledCube, 1, 89);
                            return;

                        case 48:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[90];
                            Tools.RotateCube(ScrambledCube, 1, 90);
                            return;

                        case 34:
                            ScrambledCube.Solution += " ";
                            ScrambledCube.Solution += Constants.CrossAlgs[91];
                            Tools.RotateCube(ScrambledCube, 1, 91);
                            return;
                    }
                    break;
            }
            return;
        }
    }
}