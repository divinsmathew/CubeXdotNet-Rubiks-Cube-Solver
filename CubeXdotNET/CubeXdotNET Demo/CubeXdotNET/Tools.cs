using System;
using System.Linq;
using System.Collections.Generic;

namespace CubeXdotNET
{
    public static class Tools
    {
        public static int AscConv(int i)
        {
            switch (i)
            {
                case 103: return 2;
                case 111: return 12;
                case 98: return 1;
                case 114: return 4;
                case 121: return 14;
                case 119: return 15;
            }
            return 999;
        }

        public static void OptimizeSolution(FridrichSolver Cube)
        {
            int fa = 0, tim, dir, ie = 0, d = 0;
            List<char[]> sala = new List<char[]>();
            ts:

            if (ie >= Cube.Solution.Length)
                goto away;

            if (Cube.Solution[ie] == ' ')
            {
                ie++;
                goto ts;
            }
            else if (Cube.Solution[ie] == 'R' || Cube.Solution[ie] == 'U' || Cube.Solution[ie] == 'F' || Cube.Solution[ie] == 'D' || Cube.Solution[ie] == 'B' || Cube.Solution[ie] == 'L')
            {
                switch (Char.ToLower(Cube.Solution[ie]))
                {
                    case 'r': fa = 1; break;
                    case 'u': fa = 2; break;
                    case 'f': fa = 3; break;
                    case 'l': fa = 4; break;
                    case 'b': fa = 5; break;
                    case 'd': fa = 6; break;
                }
            }
            try
            {
                if (Cube.Solution[ie + 1] == 39)
                {
                    dir = -1;
                    tim = 1;
                    ie++;
                }
                else if (Cube.Solution[ie + 1] == '2')
                {
                    dir = 1;
                    tim = 2;
                    ie++;
                }
                else if (Cube.Solution[ie] != 'R' && Cube.Solution[ie] != 'U' && Cube.Solution[ie] != 'F' && Cube.Solution[ie] != 'D' && Cube.Solution[ie] != 'B' && Cube.Solution[ie] != 'L')
                {
                    ie++;
                    goto ts;
                }
                else
                {
                    dir = 1;
                    tim = 1;
                }
            }
            catch (IndexOutOfRangeException)
            {
                dir = 1;
                tim = 1;
            }

            switch (fa)
            {
                case 1:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)        //R
                            {
                                sala.Add("R ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //R'
                            {
                                sala.Add("R'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                      //R2	
                            sala.Add("R2".ToCharArray()); ie++; goto ts;
                    }
                    break;
                case 2:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)        //U
                            {
                                sala.Add("U ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //U'
                            {
                                sala.Add("U'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                 //U2
                            sala.Add("U2".ToCharArray()); ie++; goto ts;
                    }
                    break;
                case 3:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)        //F
                            {
                                sala.Add("F ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //F'
                            {
                                sala.Add("F'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                 //F2
                            sala.Add("F2".ToCharArray()); ie++; goto ts;
                    }
                    break;
                case 4:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)        //L
                            {
                                sala.Add("L ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //L'
                            {
                                sala.Add("L'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                 //L2
                            sala.Add("L2".ToCharArray()); ie++; goto ts;
                    }
                    break;
                case 5:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)        //B
                            {
                                sala.Add("B ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //B'
                            {
                                sala.Add("B'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                 //B2
                            sala.Add("B2".ToCharArray()); ie++; goto ts;
                    }
                    break;
                case 6:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)       //D
                            {
                                sala.Add("D ".ToCharArray()); ie++; goto ts;
                            }
                            else if (dir == -1)  //D'
                            {
                                sala.Add("D'".ToCharArray()); ie++; goto ts;
                            }
                            break;
                        case 2:                 //D2
                            sala.Add("D2".ToCharArray()); ie++; goto ts;
                    }
                    break;
            }

            away:

            d = sala.Count();
            for (int i = 0; i < d - 1; i++)
            {
                if (sala[i][0] == sala[i + 1][0])
                {
                    switch (sala[i][1])
                    {
                        default:
                            switch (sala[i + 1][1])// R
                            {
                                default:
                                    sala[i][1] = '2'; //sala[i][2] = ' '; // R
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '\'':
                                    sala[i] = null;
                                    sala[i + 1] = null;
                                    for (int t = i + 2; t < d; t++)
                                        sala[t - 2] = sala[t];
                                    sala[--d] = null;
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '2':
                                    sala[i][1] = '\''; //sala[i][2] = ' ';
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;
                            }
                            break;

                        case '\'':
                            switch (sala[i + 1][1])
                            {
                                default:
                                    sala[i] = null;
                                    sala[i + 1] = null;
                                    for (int t = i + 2; t < d; t++)
                                        sala[t - 2] = sala[t];
                                    sala[--d] = null;
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '\'':
                                    sala[i][1] = '2'; //sala[i][2] = ' ';
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '2':
                                    sala[i][1] = ' ';
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;
                            }
                            break;

                        case '2':
                            switch (sala[i + 1][1])
                            {
                                case '\0':
                                    sala[i][1] = '\''; //sala[i][2] = ' ';
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '\'':
                                    sala[i][1] = ' ';
                                    for (int t = i + 1; t < d - 1; t++)
                                        sala[t] = sala[t + 1];
                                    sala[--d] = null;
                                    i = -1;
                                    break;

                                case '2':
                                    sala[i] = null;
                                    sala[i + 1] = null;
                                    for (int t = i + 2; t < d; t++)
                                        sala[t - 2] = sala[t];
                                    sala[--d] = null;
                                    sala[--d] = null;
                                    i = -1;
                                    break;
                            }
                            break;
                    }
                }
            }

            Cube.Length = d;
            Cube.Solution = "";

            for (int i = 0; i < d; i++)
                Cube.Solution += (new String(sala[i])).Trim() + " ";

            Cube.Solution = Cube.Solution.Trim();
        }

        public static int ConjugateEdge(int Edge)
        {
            switch (Edge)
            {
                case 1: return (41);
                case 10: return (37);
                case 19: return (39);
                case 28: return (43);
                case 5: return (12);
                case 14: return (21);
                case 23: return (30);
                case 32: return (3);
                case 7: return (50);
                case 16: return (52);
                case 25: return (48);
                case 34: return (46);
                case 41: return (1);
                case 37: return (10);
                case 39: return (19);
                case 43: return (28);
                case 12: return (5);
                case 21: return (14);
                case 30: return (23);
                case 3: return (32);
                case 50: return (7);
                case 52: return (16);
                case 48: return (25);
                case 46: return (34);
            }
            return 999;
        }

        public static string ydPerm(string algo)
        {
            var alg = algo.ToCharArray();
            for (int i = 0; i < alg.Length; i++)
            {
                switch (alg[i])
                {
                    case 'R': alg[i] = 'F'; break;
                    case 'B': alg[i] = 'R'; break;
                    case 'L': alg[i] = 'B'; break;
                    case 'F': alg[i] = 'L'; break;
                }
            }
            return new String(alg);
        }

        public static string y2Perm(string algo)
        {
            var alg = algo.ToCharArray();
            for (int i = 0; i < alg.Length; i++)
            {
                switch (alg[i])
                {
                    case 'R': alg[i] = 'L'; break;
                    case 'B': alg[i] = 'F'; break;
                    case 'L': alg[i] = 'R'; break;
                    case 'F': alg[i] = 'B'; break;
                }
            }
            return new String(alg);
        }

        public static string yPerm(string algo)
        {
            var alg = algo.ToCharArray();
            for (int i = 0; i < alg.Length; i++)
            {
                switch (alg[i])
                {
                    case 'R': alg[i] = 'B'; break;
                    case 'B': alg[i] = 'L'; break;
                    case 'L': alg[i] = 'F'; break;
                    case 'F': alg[i] = 'R'; break;
                }
            }
            return new String(alg);
        }

        public static void RotateCube(FridrichSolver Cube, int st = 123, int cn = 123, string tag = "")
        {
            int i, fa = 0, dir, tim;
            char a, b, c;
            char[] talg = new char[100];

            if (st == 123 && cn == 123)
                talg = tag.ToCharArray();
            else
                switch (st)
                {
                    case 0:
                        switch (cn)
                        {
                            case 0: talg = " U".ToCharArray(); break;
                            case 1: talg = " U'".ToCharArray(); break;
                            case 2: talg = " U2".ToCharArray(); break;
                        }
                        break;

                    case 1: talg = Constants.CrossAlgs[cn].ToCharArray(); break;
                    case 2: talg = yPerm(Constants.F2L_Algs[cn]).ToCharArray(); break;
                    case 3: talg = y2Perm(Constants.F2L_Algs[cn]).ToCharArray(); break;
                    case 4: talg = ydPerm(Constants.F2L_Algs[cn]).ToCharArray(); break;
                    case 5: talg = Constants.F2L_Algs[cn].ToCharArray(); break;

                    case 6: talg = ydPerm(Constants.OLL_Algs[cn]).ToCharArray(); break;
                    case 7: talg = Constants.OLL_Algs[cn].ToCharArray(); break;
                    case 8: talg = yPerm(Constants.OLL_Algs[cn]).ToCharArray(); break;
                    case 9: talg = y2Perm(Constants.OLL_Algs[cn]).ToCharArray(); break;

                    case 10:
                        talg = "U' ".ToCharArray();
                        talg = talg.Concat(Constants.PLL_Algs[cn]).ToArray();
                        break;
                    case 11:
                        talg = Constants.PLL_Algs[cn].ToCharArray();
                        break;
                    case 12:
                        talg = "U ".ToCharArray();
                        talg = talg.Concat(Constants.PLL_Algs[cn]).ToArray();
                        break;
                    case 13:
                        talg = "U2 ".ToCharArray();
                        talg = talg.Concat(Constants.PLL_Algs[cn]).ToArray();
                        break;

                    case 14:
                        switch (cn)
                        {
                            case 1: talg = "R".ToCharArray(); break;
                            case 2: talg = "R'".ToCharArray(); break;
                            case 3: talg = "R2".ToCharArray(); break;
                        }
                        break;
                    case 15:
                        switch (cn)
                        {
                            case 1: talg = "U".ToCharArray(); break;
                            case 2: talg = "U'".ToCharArray(); break;
                            case 3: talg = "U2".ToCharArray(); break;
                        }
                        break;
                    case 16:
                        switch (cn)
                        {
                            case 1: talg = "F".ToCharArray(); break;
                            case 2: talg = "F'".ToCharArray(); break;
                            case 3: talg = "F2".ToCharArray(); break;
                        }
                        break;
                    case 17:
                        switch (cn)
                        {
                            case 1: talg = "B".ToCharArray(); break;
                            case 2: talg = "B'".ToCharArray(); break;
                            case 3: talg = "B2".ToCharArray(); break;
                        }
                        break;
                    case 18:
                        switch (cn)
                        {
                            case 1: talg = "L".ToCharArray(); break;
                            case 2: talg = "L'".ToCharArray(); break;
                            case 3: talg = "L2".ToCharArray(); break;
                        }
                        break;
                    case 19:
                        switch (cn)
                        {
                            case 1: talg = "D".ToCharArray(); break;
                            case 2: talg = "D'".ToCharArray(); break;
                            case 3: talg = "D2".ToCharArray(); break;
                        }
                        break;
                }

            i = 0;
            ts:

            if (i >= talg.Length)
                return;

            if (talg[i] == ' ')
            {
                i++;
                goto ts;
            }
            else
                if (talg[i] == 'R' || talg[i] == 'U' || talg[i] == 'F' || talg[i] == 'D' || talg[i] == 'B' || talg[i] == 'L')
            {
                switch (Char.ToLower(talg[i]))
                {
                    case 'r': fa = 1; break;
                    case 'u': fa = 2; break;
                    case 'f': fa = 3; break;
                    case 'l': fa = 4; break;
                    case 'b': fa = 5; break;
                    case 'd': fa = 6; break;
                }
            }

            try
            {
                if (talg[i + 1] == 39)
                {
                    dir = -1;
                    tim = 1;
                    i++;
                }
                else if (talg[i + 1] == '2')
                {
                    dir = 1;
                    tim = 2;
                    i++;
                }
                else if (talg[i] != 'R' && talg[i] != 'U' && talg[i] != 'F' && talg[i] != 'D' && talg[i] != 'B' && talg[i] != 'L')
                {
                    i++;
                    goto ts;
                }
                else
                {
                    dir = 1;
                    tim = 1;
                }
            }
            catch (IndexOutOfRangeException)
            {
                dir = 1;
                tim = 1;
            }
            //////////////////////////////////////


            //loaded fa,tim and dir;

            switch (fa)
            {
                case 1:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[8]; b = Cube.Cube[5]; c = Cube.Cube[2];
                                Cube.Cube[8] = Cube.Cube[51]; Cube.Cube[5] = Cube.Cube[52]; Cube.Cube[2] = Cube.Cube[53];
                                Cube.Cube[51] = Cube.Cube[18]; Cube.Cube[52] = Cube.Cube[21]; Cube.Cube[53] = Cube.Cube[24];
                                Cube.Cube[18] = Cube.Cube[38]; Cube.Cube[21] = Cube.Cube[37]; Cube.Cube[24] = Cube.Cube[36];
                                Cube.Cube[38] = a; Cube.Cube[37] = b; Cube.Cube[36] = c;

                                a = Cube.Cube[9]; b = Cube.Cube[10];
                                Cube.Cube[9] = Cube.Cube[15]; Cube.Cube[10] = Cube.Cube[12];
                                Cube.Cube[15] = Cube.Cube[17]; Cube.Cube[12] = Cube.Cube[16];
                                Cube.Cube[17] = Cube.Cube[11]; Cube.Cube[16] = Cube.Cube[14];
                                Cube.Cube[11] = a; Cube.Cube[14] = b;

                                i++; goto ts;
                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[2]; b = Cube.Cube[5]; c = Cube.Cube[8];
                                Cube.Cube[2] = Cube.Cube[36]; Cube.Cube[5] = Cube.Cube[37]; Cube.Cube[8] = Cube.Cube[38];
                                Cube.Cube[36] = Cube.Cube[24]; Cube.Cube[37] = Cube.Cube[21]; Cube.Cube[38] = Cube.Cube[18];
                                Cube.Cube[24] = Cube.Cube[53]; Cube.Cube[21] = Cube.Cube[52]; Cube.Cube[18] = Cube.Cube[51];
                                Cube.Cube[53] = a; Cube.Cube[52] = b; Cube.Cube[51] = c;

                                b = Cube.Cube[10]; a = Cube.Cube[9];
                                Cube.Cube[10] = Cube.Cube[14]; Cube.Cube[9] = Cube.Cube[11];
                                Cube.Cube[14] = Cube.Cube[16]; Cube.Cube[11] = Cube.Cube[17];
                                Cube.Cube[16] = Cube.Cube[12]; Cube.Cube[17] = Cube.Cube[15];
                                Cube.Cube[12] = b; Cube.Cube[15] = a;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[8]; b = Cube.Cube[5]; c = Cube.Cube[2];
                            Cube.Cube[8] = Cube.Cube[51]; Cube.Cube[5] = Cube.Cube[52]; Cube.Cube[2] = Cube.Cube[53];
                            Cube.Cube[51] = Cube.Cube[18]; Cube.Cube[52] = Cube.Cube[21]; Cube.Cube[53] = Cube.Cube[24];
                            Cube.Cube[18] = Cube.Cube[38]; Cube.Cube[21] = Cube.Cube[37]; Cube.Cube[24] = Cube.Cube[36];
                            Cube.Cube[38] = a; Cube.Cube[37] = b; Cube.Cube[36] = c;

                            a = Cube.Cube[9]; b = Cube.Cube[10];
                            Cube.Cube[9] = Cube.Cube[15]; Cube.Cube[10] = Cube.Cube[12];
                            Cube.Cube[15] = Cube.Cube[17]; Cube.Cube[12] = Cube.Cube[16];
                            Cube.Cube[17] = Cube.Cube[11]; Cube.Cube[16] = Cube.Cube[14];
                            Cube.Cube[11] = a; Cube.Cube[14] = b;

                            a = Cube.Cube[8]; b = Cube.Cube[5]; c = Cube.Cube[2];
                            Cube.Cube[8] = Cube.Cube[51]; Cube.Cube[5] = Cube.Cube[52]; Cube.Cube[2] = Cube.Cube[53];
                            Cube.Cube[51] = Cube.Cube[18]; Cube.Cube[52] = Cube.Cube[21]; Cube.Cube[53] = Cube.Cube[24];
                            Cube.Cube[18] = Cube.Cube[38]; Cube.Cube[21] = Cube.Cube[37]; Cube.Cube[24] = Cube.Cube[36];
                            Cube.Cube[38] = a; Cube.Cube[37] = b; Cube.Cube[36] = c;

                            a = Cube.Cube[9]; b = Cube.Cube[10];
                            Cube.Cube[9] = Cube.Cube[15]; Cube.Cube[10] = Cube.Cube[12];
                            Cube.Cube[15] = Cube.Cube[17]; Cube.Cube[12] = Cube.Cube[16];
                            Cube.Cube[17] = Cube.Cube[11]; Cube.Cube[16] = Cube.Cube[14];
                            Cube.Cube[11] = a; Cube.Cube[14] = b;

                            i++; goto ts;
                    }
                    break;

                case 2:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[2]; b = Cube.Cube[1]; c = Cube.Cube[0];
                                Cube.Cube[2] = Cube.Cube[11]; Cube.Cube[1] = Cube.Cube[10]; Cube.Cube[0] = Cube.Cube[9];
                                Cube.Cube[11] = Cube.Cube[20]; Cube.Cube[10] = Cube.Cube[19]; Cube.Cube[9] = Cube.Cube[18];
                                Cube.Cube[20] = Cube.Cube[29]; Cube.Cube[19] = Cube.Cube[28]; Cube.Cube[18] = Cube.Cube[27];
                                Cube.Cube[29] = a; Cube.Cube[28] = b; Cube.Cube[27] = c;

                                a = Cube.Cube[42]; b = Cube.Cube[39];
                                Cube.Cube[42] = Cube.Cube[44]; Cube.Cube[39] = Cube.Cube[43];
                                Cube.Cube[44] = Cube.Cube[38]; Cube.Cube[43] = Cube.Cube[41];
                                Cube.Cube[38] = Cube.Cube[36]; Cube.Cube[41] = Cube.Cube[37];
                                Cube.Cube[36] = a; Cube.Cube[37] = b;

                                i++; goto ts;
                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[0]; b = Cube.Cube[1]; c = Cube.Cube[2];
                                Cube.Cube[0] = Cube.Cube[27]; Cube.Cube[1] = Cube.Cube[28]; Cube.Cube[2] = Cube.Cube[29];
                                Cube.Cube[27] = Cube.Cube[18]; Cube.Cube[28] = Cube.Cube[19]; Cube.Cube[29] = Cube.Cube[20];
                                Cube.Cube[18] = Cube.Cube[9]; Cube.Cube[19] = Cube.Cube[10]; Cube.Cube[20] = Cube.Cube[11];
                                Cube.Cube[9] = a; Cube.Cube[10] = b; Cube.Cube[11] = c;

                                a = Cube.Cube[42]; b = Cube.Cube[39];
                                Cube.Cube[42] = Cube.Cube[36]; Cube.Cube[39] = Cube.Cube[37];
                                Cube.Cube[36] = Cube.Cube[38]; Cube.Cube[37] = Cube.Cube[41];
                                Cube.Cube[38] = Cube.Cube[44]; Cube.Cube[41] = Cube.Cube[43];
                                Cube.Cube[44] = a; Cube.Cube[43] = b;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[2]; b = Cube.Cube[1]; c = Cube.Cube[0];
                            Cube.Cube[2] = Cube.Cube[11]; Cube.Cube[1] = Cube.Cube[10]; Cube.Cube[0] = Cube.Cube[9];
                            Cube.Cube[11] = Cube.Cube[20]; Cube.Cube[10] = Cube.Cube[19]; Cube.Cube[9] = Cube.Cube[18];
                            Cube.Cube[20] = Cube.Cube[29]; Cube.Cube[19] = Cube.Cube[28]; Cube.Cube[18] = Cube.Cube[27];
                            Cube.Cube[29] = a; Cube.Cube[28] = b; Cube.Cube[27] = c;

                            a = Cube.Cube[42]; b = Cube.Cube[39];
                            Cube.Cube[42] = Cube.Cube[44]; Cube.Cube[39] = Cube.Cube[43];
                            Cube.Cube[44] = Cube.Cube[38]; Cube.Cube[43] = Cube.Cube[41];
                            Cube.Cube[38] = Cube.Cube[36]; Cube.Cube[41] = Cube.Cube[37];
                            Cube.Cube[36] = a; Cube.Cube[37] = b;

                            a = Cube.Cube[2]; b = Cube.Cube[1]; c = Cube.Cube[0];
                            Cube.Cube[2] = Cube.Cube[11]; Cube.Cube[1] = Cube.Cube[10]; Cube.Cube[0] = Cube.Cube[9];
                            Cube.Cube[11] = Cube.Cube[20]; Cube.Cube[10] = Cube.Cube[19]; Cube.Cube[9] = Cube.Cube[18];
                            Cube.Cube[20] = Cube.Cube[29]; Cube.Cube[19] = Cube.Cube[28]; Cube.Cube[18] = Cube.Cube[27];
                            Cube.Cube[29] = a; Cube.Cube[28] = b; Cube.Cube[27] = c;

                            a = Cube.Cube[42]; b = Cube.Cube[39];
                            Cube.Cube[42] = Cube.Cube[44]; Cube.Cube[39] = Cube.Cube[43];
                            Cube.Cube[44] = Cube.Cube[38]; Cube.Cube[43] = Cube.Cube[41];
                            Cube.Cube[38] = Cube.Cube[36]; Cube.Cube[41] = Cube.Cube[37];
                            Cube.Cube[36] = a; Cube.Cube[37] = b;

                            i++; goto ts;
                    }
                    break;

                case 3:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[38]; b = Cube.Cube[41]; c = Cube.Cube[44];
                                Cube.Cube[38] = Cube.Cube[29]; Cube.Cube[41] = Cube.Cube[32]; Cube.Cube[44] = Cube.Cube[35];
                                Cube.Cube[29] = Cube.Cube[47]; Cube.Cube[32] = Cube.Cube[50]; Cube.Cube[35] = Cube.Cube[53];
                                Cube.Cube[47] = Cube.Cube[15]; Cube.Cube[50] = Cube.Cube[12]; Cube.Cube[53] = Cube.Cube[9];
                                Cube.Cube[15] = a; Cube.Cube[12] = b; Cube.Cube[9] = c;

                                a = Cube.Cube[0]; b = Cube.Cube[1];
                                Cube.Cube[0] = Cube.Cube[6]; Cube.Cube[1] = Cube.Cube[3];
                                Cube.Cube[6] = Cube.Cube[8]; Cube.Cube[3] = Cube.Cube[7];
                                Cube.Cube[8] = Cube.Cube[2]; Cube.Cube[7] = Cube.Cube[5];
                                Cube.Cube[2] = a; Cube.Cube[5] = b;

                                i++; goto ts;
                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[38]; b = Cube.Cube[41]; c = Cube.Cube[44];
                                Cube.Cube[38] = Cube.Cube[15]; Cube.Cube[41] = Cube.Cube[12]; Cube.Cube[44] = Cube.Cube[9];
                                Cube.Cube[15] = Cube.Cube[47]; Cube.Cube[12] = Cube.Cube[50]; Cube.Cube[9] = Cube.Cube[53];
                                Cube.Cube[47] = Cube.Cube[29]; Cube.Cube[50] = Cube.Cube[32]; Cube.Cube[53] = Cube.Cube[35];
                                Cube.Cube[29] = a; Cube.Cube[32] = b; Cube.Cube[35] = c;

                                a = Cube.Cube[0]; b = Cube.Cube[1];
                                Cube.Cube[0] = Cube.Cube[2]; Cube.Cube[1] = Cube.Cube[5];
                                Cube.Cube[2] = Cube.Cube[8]; Cube.Cube[5] = Cube.Cube[7];
                                Cube.Cube[8] = Cube.Cube[6]; Cube.Cube[7] = Cube.Cube[3];
                                Cube.Cube[6] = a; Cube.Cube[3] = b;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[38]; b = Cube.Cube[41]; c = Cube.Cube[44];
                            Cube.Cube[38] = Cube.Cube[29]; Cube.Cube[41] = Cube.Cube[32]; Cube.Cube[44] = Cube.Cube[35];
                            Cube.Cube[29] = Cube.Cube[47]; Cube.Cube[32] = Cube.Cube[50]; Cube.Cube[35] = Cube.Cube[53];
                            Cube.Cube[47] = Cube.Cube[15]; Cube.Cube[50] = Cube.Cube[12]; Cube.Cube[53] = Cube.Cube[9];
                            Cube.Cube[15] = a; Cube.Cube[12] = b; Cube.Cube[9] = c;

                            a = Cube.Cube[0]; b = Cube.Cube[1];
                            Cube.Cube[0] = Cube.Cube[6]; Cube.Cube[1] = Cube.Cube[3];
                            Cube.Cube[6] = Cube.Cube[8]; Cube.Cube[3] = Cube.Cube[7];
                            Cube.Cube[8] = Cube.Cube[2]; Cube.Cube[7] = Cube.Cube[5];
                            Cube.Cube[2] = a; Cube.Cube[5] = b;

                            a = Cube.Cube[38]; b = Cube.Cube[41]; c = Cube.Cube[44];
                            Cube.Cube[38] = Cube.Cube[29]; Cube.Cube[41] = Cube.Cube[32]; Cube.Cube[44] = Cube.Cube[35];
                            Cube.Cube[29] = Cube.Cube[47]; Cube.Cube[32] = Cube.Cube[50]; Cube.Cube[35] = Cube.Cube[53];
                            Cube.Cube[47] = Cube.Cube[15]; Cube.Cube[50] = Cube.Cube[12]; Cube.Cube[53] = Cube.Cube[9];
                            Cube.Cube[15] = a; Cube.Cube[12] = b; Cube.Cube[9] = c;

                            a = Cube.Cube[0]; b = Cube.Cube[1];
                            Cube.Cube[0] = Cube.Cube[6]; Cube.Cube[1] = Cube.Cube[3];
                            Cube.Cube[6] = Cube.Cube[8]; Cube.Cube[3] = Cube.Cube[7];
                            Cube.Cube[8] = Cube.Cube[2]; Cube.Cube[7] = Cube.Cube[5];
                            Cube.Cube[2] = a; Cube.Cube[5] = b;

                            i++; goto ts;
                    }
                    break;

                case 4:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[0]; b = Cube.Cube[3]; c = Cube.Cube[6];
                                Cube.Cube[0] = Cube.Cube[42]; Cube.Cube[3] = Cube.Cube[43]; Cube.Cube[6] = Cube.Cube[44];
                                Cube.Cube[42] = Cube.Cube[26]; Cube.Cube[43] = Cube.Cube[23]; Cube.Cube[44] = Cube.Cube[20];
                                Cube.Cube[26] = Cube.Cube[47]; Cube.Cube[23] = Cube.Cube[46]; Cube.Cube[20] = Cube.Cube[45];
                                Cube.Cube[47] = a; Cube.Cube[46] = b; Cube.Cube[45] = c;

                                a = Cube.Cube[27]; b = Cube.Cube[28];
                                Cube.Cube[27] = Cube.Cube[33]; Cube.Cube[28] = Cube.Cube[30];
                                Cube.Cube[33] = Cube.Cube[35]; Cube.Cube[30] = Cube.Cube[34];
                                Cube.Cube[35] = Cube.Cube[29]; Cube.Cube[34] = Cube.Cube[32];
                                Cube.Cube[29] = a; Cube.Cube[32] = b;

                                i++; goto ts;
                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[6]; b = Cube.Cube[3]; c = Cube.Cube[0];
                                Cube.Cube[6] = Cube.Cube[45]; Cube.Cube[3] = Cube.Cube[46]; Cube.Cube[0] = Cube.Cube[47];
                                Cube.Cube[45] = Cube.Cube[20]; Cube.Cube[46] = Cube.Cube[23]; Cube.Cube[47] = Cube.Cube[26];
                                Cube.Cube[20] = Cube.Cube[44]; Cube.Cube[23] = Cube.Cube[43]; Cube.Cube[26] = Cube.Cube[42];
                                Cube.Cube[44] = a; Cube.Cube[43] = b; Cube.Cube[42] = c;

                                a = Cube.Cube[27]; b = Cube.Cube[28];
                                Cube.Cube[27] = Cube.Cube[29]; Cube.Cube[28] = Cube.Cube[32];
                                Cube.Cube[29] = Cube.Cube[35]; Cube.Cube[32] = Cube.Cube[34];
                                Cube.Cube[35] = Cube.Cube[33]; Cube.Cube[34] = Cube.Cube[30];
                                Cube.Cube[33] = a; Cube.Cube[30] = b;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[0]; b = Cube.Cube[3]; c = Cube.Cube[6];
                            Cube.Cube[0] = Cube.Cube[42]; Cube.Cube[3] = Cube.Cube[43]; Cube.Cube[6] = Cube.Cube[44];
                            Cube.Cube[42] = Cube.Cube[26]; Cube.Cube[43] = Cube.Cube[23]; Cube.Cube[44] = Cube.Cube[20];
                            Cube.Cube[26] = Cube.Cube[47]; Cube.Cube[23] = Cube.Cube[46]; Cube.Cube[20] = Cube.Cube[45];
                            Cube.Cube[47] = a; Cube.Cube[46] = b; Cube.Cube[45] = c;

                            a = Cube.Cube[27]; b = Cube.Cube[28];
                            Cube.Cube[27] = Cube.Cube[33]; Cube.Cube[28] = Cube.Cube[30];
                            Cube.Cube[33] = Cube.Cube[35]; Cube.Cube[30] = Cube.Cube[34];
                            Cube.Cube[35] = Cube.Cube[29]; Cube.Cube[34] = Cube.Cube[32];
                            Cube.Cube[29] = a; Cube.Cube[32] = b;

                            a = Cube.Cube[0]; b = Cube.Cube[3]; c = Cube.Cube[6];
                            Cube.Cube[0] = Cube.Cube[42]; Cube.Cube[3] = Cube.Cube[43]; Cube.Cube[6] = Cube.Cube[44];
                            Cube.Cube[42] = Cube.Cube[26]; Cube.Cube[43] = Cube.Cube[23]; Cube.Cube[44] = Cube.Cube[20];
                            Cube.Cube[26] = Cube.Cube[47]; Cube.Cube[23] = Cube.Cube[46]; Cube.Cube[20] = Cube.Cube[45];
                            Cube.Cube[47] = a; Cube.Cube[46] = b; Cube.Cube[45] = c;

                            a = Cube.Cube[27]; b = Cube.Cube[28];
                            Cube.Cube[27] = Cube.Cube[33]; Cube.Cube[28] = Cube.Cube[30];
                            Cube.Cube[33] = Cube.Cube[35]; Cube.Cube[30] = Cube.Cube[34];
                            Cube.Cube[35] = Cube.Cube[29]; Cube.Cube[34] = Cube.Cube[32];
                            Cube.Cube[29] = a; Cube.Cube[32] = b;

                            i++; goto ts;
                    }
                    break;

                case 5:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[36]; b = Cube.Cube[39]; c = Cube.Cube[42];
                                Cube.Cube[36] = Cube.Cube[17]; Cube.Cube[39] = Cube.Cube[14]; Cube.Cube[42] = Cube.Cube[11];
                                Cube.Cube[17] = Cube.Cube[45]; Cube.Cube[14] = Cube.Cube[48]; Cube.Cube[11] = Cube.Cube[51];
                                Cube.Cube[45] = Cube.Cube[27]; Cube.Cube[48] = Cube.Cube[30]; Cube.Cube[51] = Cube.Cube[33];
                                Cube.Cube[27] = a; Cube.Cube[30] = b; Cube.Cube[33] = c;

                                a = Cube.Cube[18]; b = Cube.Cube[19];
                                Cube.Cube[18] = Cube.Cube[24]; Cube.Cube[19] = Cube.Cube[21];
                                Cube.Cube[24] = Cube.Cube[26]; Cube.Cube[21] = Cube.Cube[25];
                                Cube.Cube[26] = Cube.Cube[20]; Cube.Cube[25] = Cube.Cube[23];
                                Cube.Cube[20] = a; Cube.Cube[23] = b;

                                i++; goto ts;
                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[42]; b = Cube.Cube[39]; c = Cube.Cube[36];
                                Cube.Cube[42] = Cube.Cube[33]; Cube.Cube[39] = Cube.Cube[30]; Cube.Cube[36] = Cube.Cube[27];
                                Cube.Cube[33] = Cube.Cube[51]; Cube.Cube[30] = Cube.Cube[48]; Cube.Cube[27] = Cube.Cube[45];
                                Cube.Cube[51] = Cube.Cube[11]; Cube.Cube[48] = Cube.Cube[14]; Cube.Cube[45] = Cube.Cube[17];
                                Cube.Cube[11] = a; Cube.Cube[14] = b; Cube.Cube[17] = c;

                                b = Cube.Cube[19]; a = Cube.Cube[18];
                                Cube.Cube[19] = Cube.Cube[23]; Cube.Cube[18] = Cube.Cube[20];
                                Cube.Cube[23] = Cube.Cube[25]; Cube.Cube[20] = Cube.Cube[26];
                                Cube.Cube[25] = Cube.Cube[21]; Cube.Cube[26] = Cube.Cube[24];
                                Cube.Cube[21] = b; Cube.Cube[24] = a;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[36]; b = Cube.Cube[39]; c = Cube.Cube[42];
                            Cube.Cube[36] = Cube.Cube[17]; Cube.Cube[39] = Cube.Cube[14]; Cube.Cube[42] = Cube.Cube[11];
                            Cube.Cube[17] = Cube.Cube[45]; Cube.Cube[14] = Cube.Cube[48]; Cube.Cube[11] = Cube.Cube[51];
                            Cube.Cube[45] = Cube.Cube[27]; Cube.Cube[48] = Cube.Cube[30]; Cube.Cube[51] = Cube.Cube[33];
                            Cube.Cube[27] = a; Cube.Cube[30] = b; Cube.Cube[33] = c;

                            a = Cube.Cube[18]; b = Cube.Cube[19];
                            Cube.Cube[18] = Cube.Cube[24]; Cube.Cube[19] = Cube.Cube[21];
                            Cube.Cube[24] = Cube.Cube[26]; Cube.Cube[21] = Cube.Cube[25];
                            Cube.Cube[26] = Cube.Cube[20]; Cube.Cube[25] = Cube.Cube[23];
                            Cube.Cube[20] = a; Cube.Cube[23] = b;

                            a = Cube.Cube[36]; b = Cube.Cube[39]; c = Cube.Cube[42];
                            Cube.Cube[36] = Cube.Cube[17]; Cube.Cube[39] = Cube.Cube[14]; Cube.Cube[42] = Cube.Cube[11];
                            Cube.Cube[17] = Cube.Cube[45]; Cube.Cube[14] = Cube.Cube[48]; Cube.Cube[11] = Cube.Cube[51];
                            Cube.Cube[45] = Cube.Cube[27]; Cube.Cube[48] = Cube.Cube[30]; Cube.Cube[51] = Cube.Cube[33];
                            Cube.Cube[27] = a; Cube.Cube[30] = b; Cube.Cube[33] = c;

                            a = Cube.Cube[18]; b = Cube.Cube[19];
                            Cube.Cube[18] = Cube.Cube[24]; Cube.Cube[19] = Cube.Cube[21];
                            Cube.Cube[24] = Cube.Cube[26]; Cube.Cube[21] = Cube.Cube[25];
                            Cube.Cube[26] = Cube.Cube[20]; Cube.Cube[25] = Cube.Cube[23];
                            Cube.Cube[20] = a; Cube.Cube[23] = b;

                            i++; goto ts;
                    }
                    break;

                case 6:
                    switch (tim)
                    {
                        case 1:
                            if (dir == 1)
                            {
                                a = Cube.Cube[6]; b = Cube.Cube[7]; c = Cube.Cube[8];
                                Cube.Cube[6] = Cube.Cube[33]; Cube.Cube[7] = Cube.Cube[34]; Cube.Cube[8] = Cube.Cube[35];
                                Cube.Cube[33] = Cube.Cube[24]; Cube.Cube[34] = Cube.Cube[25]; Cube.Cube[35] = Cube.Cube[26];
                                Cube.Cube[24] = Cube.Cube[15]; Cube.Cube[25] = Cube.Cube[16]; Cube.Cube[26] = Cube.Cube[17];
                                Cube.Cube[15] = a; Cube.Cube[16] = b; Cube.Cube[17] = c;

                                a = Cube.Cube[47]; b = Cube.Cube[50];
                                Cube.Cube[47] = Cube.Cube[45]; Cube.Cube[50] = Cube.Cube[46];
                                Cube.Cube[45] = Cube.Cube[51]; Cube.Cube[46] = Cube.Cube[48];
                                Cube.Cube[51] = Cube.Cube[53]; Cube.Cube[48] = Cube.Cube[52];
                                Cube.Cube[53] = a; Cube.Cube[52] = b;

                                i++; goto ts;

                            }
                            else if (dir == -1)
                            {
                                a = Cube.Cube[8]; b = Cube.Cube[7]; c = Cube.Cube[6];
                                Cube.Cube[8] = Cube.Cube[17]; Cube.Cube[7] = Cube.Cube[16]; Cube.Cube[6] = Cube.Cube[15];
                                Cube.Cube[17] = Cube.Cube[26]; Cube.Cube[16] = Cube.Cube[25]; Cube.Cube[15] = Cube.Cube[24];
                                Cube.Cube[26] = Cube.Cube[35]; Cube.Cube[25] = Cube.Cube[34]; Cube.Cube[24] = Cube.Cube[33];
                                Cube.Cube[35] = a; Cube.Cube[34] = b; Cube.Cube[33] = c;

                                b = Cube.Cube[50]; a = Cube.Cube[47];
                                Cube.Cube[50] = Cube.Cube[52]; Cube.Cube[47] = Cube.Cube[53];
                                Cube.Cube[52] = Cube.Cube[48]; Cube.Cube[53] = Cube.Cube[51];
                                Cube.Cube[48] = Cube.Cube[46]; Cube.Cube[51] = Cube.Cube[45];
                                Cube.Cube[46] = b; Cube.Cube[45] = a;

                                i++; goto ts;
                            }
                            break;

                        case 2:
                            a = Cube.Cube[6]; b = Cube.Cube[7]; c = Cube.Cube[8];
                            Cube.Cube[6] = Cube.Cube[33]; Cube.Cube[7] = Cube.Cube[34]; Cube.Cube[8] = Cube.Cube[35];
                            Cube.Cube[33] = Cube.Cube[24]; Cube.Cube[34] = Cube.Cube[25]; Cube.Cube[35] = Cube.Cube[26];
                            Cube.Cube[24] = Cube.Cube[15]; Cube.Cube[25] = Cube.Cube[16]; Cube.Cube[26] = Cube.Cube[17];
                            Cube.Cube[15] = a; Cube.Cube[16] = b; Cube.Cube[17] = c;

                            a = Cube.Cube[47]; b = Cube.Cube[50];
                            Cube.Cube[47] = Cube.Cube[45]; Cube.Cube[50] = Cube.Cube[46];
                            Cube.Cube[45] = Cube.Cube[51]; Cube.Cube[46] = Cube.Cube[48];
                            Cube.Cube[51] = Cube.Cube[53]; Cube.Cube[48] = Cube.Cube[52];
                            Cube.Cube[53] = a; Cube.Cube[52] = b;

                            a = Cube.Cube[6]; b = Cube.Cube[7]; c = Cube.Cube[8];
                            Cube.Cube[6] = Cube.Cube[33]; Cube.Cube[7] = Cube.Cube[34]; Cube.Cube[8] = Cube.Cube[35];
                            Cube.Cube[33] = Cube.Cube[24]; Cube.Cube[34] = Cube.Cube[25]; Cube.Cube[35] = Cube.Cube[26];
                            Cube.Cube[24] = Cube.Cube[15]; Cube.Cube[25] = Cube.Cube[16]; Cube.Cube[26] = Cube.Cube[17];
                            Cube.Cube[15] = a; Cube.Cube[16] = b; Cube.Cube[17] = c;

                            a = Cube.Cube[47]; b = Cube.Cube[50];
                            Cube.Cube[47] = Cube.Cube[45]; Cube.Cube[50] = Cube.Cube[46];
                            Cube.Cube[45] = Cube.Cube[51]; Cube.Cube[46] = Cube.Cube[48];
                            Cube.Cube[51] = Cube.Cube[53]; Cube.Cube[48] = Cube.Cube[52];
                            Cube.Cube[53] = a; Cube.Cube[52] = b;

                            i++; goto ts;
                    }
                    break;
            }
        }
    }
}