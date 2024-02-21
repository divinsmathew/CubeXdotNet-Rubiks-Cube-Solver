public class F2L {
  public static int cc1, cc2, ecc1, ecc2;

  public static void Solve(FridrichSolver ScrambledCube) {
    Boolean flag;
    int i;

    for (flag = false, i = 0; i < 24; i++) {
      if (ScrambledCube.Cube[Constants.CornorPositions[i]] == 119) {
        AssignCornor(Constants.CornorPositions[i]); // loads cc1 & cc2 (unordered)
        if (ScrambledCube.Cube[cc1] == 111 && ScrambledCube.Cube[cc2] == 98) {
          flag = true;
          break;
        } else if (ScrambledCube.Cube[cc1] == 98 && ScrambledCube.Cube[cc2] == 111) {
          flag = true;
          cc1 += cc2;
          cc2 = cc1 - cc2;
          cc1 -= cc2;
          break;
        }
      }
    }

    for (flag = false, i = 0; i < 16; i++) {
      if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc1]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc2]) {
        flag = true;
        ecc1 = Constants.WhiteLessEdges[i];
        ecc2 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        break;
      } else if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc2]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc1]) {
        flag = true;
        ecc1 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        ecc2 = Constants.WhiteLessEdges[i];
        break;
      }
    }

    if (!flag) {
      ScrambledCube.ErrorCode = -2;
      return;
    } // error @ OB

    // loaded ordered ecc1 & ecc2

    if (ecc1 != 14 || cc1 != 17)
      F2L_OB(ScrambledCube);

    ///////////////////////////////////////////////////////////////////

    for (flag = false, i = 0; i < 24; i++) {
      if (ScrambledCube.Cube[Constants.CornorPositions[i]] == 119) {
        AssignCornor(Constants.CornorPositions[i]); // loads cc1 & cc2 (un ordered)
        if (ScrambledCube.Cube[cc1] == 98 && ScrambledCube.Cube[cc2] == 114) {
          flag = true;
          break;
        } else if (ScrambledCube.Cube[cc1] == 114 && ScrambledCube.Cube[cc2] == 98) {
          flag = true;
          cc1 += cc2;
          cc2 = cc1 - cc2;
          cc1 -= cc2;
          break;
        }
      }
    }

    for (flag = false, i = 0; i < 16; i++) {
      if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc1]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc2]) {
        flag = true;
        ecc1 = Constants.WhiteLessEdges[i];
        ecc2 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        break;
      } else if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc2]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc1]) {
        flag = true;
        ecc1 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        ecc2 = Constants.WhiteLessEdges[i];
        break;
      }
    }

    if (!flag) {
      ScrambledCube.ErrorCode = -3;
      return;
    } // error @ BR

    if (ecc1 != 23 || cc1 != 26)
      F2L_BR(ScrambledCube);

    //////////////////////////////////////////////////////////////

    for (flag = false, i = 0; i < 24; i++) {
      if (ScrambledCube.Cube[Constants.CornorPositions[i]] == 119) {
        AssignCornor(Constants.CornorPositions[i]); // loads cc1 & cc2 (un ordered)
        if (ScrambledCube.Cube[cc1] == 114 && ScrambledCube.Cube[cc2] == 103) {
          flag = true;
          break;
        } else if (ScrambledCube.Cube[cc1] == 103 && ScrambledCube.Cube[cc2] == 114) {
          flag = true;
          cc1 += cc2;
          cc2 = cc1 - cc2;
          cc1 -= cc2;
          break;
        }
      }
    }

    for (flag = false, i = 0; i < 16; i++) {
      if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc1]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc2]) {
        flag = true;
        ecc1 = Constants.WhiteLessEdges[i];
        ecc2 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        break;
      } else if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc2]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc1]) {
        flag = true;
        ecc1 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        ecc2 = Constants.WhiteLessEdges[i];
        break;
      }
    }
    if (!flag) {
      ScrambledCube.ErrorCode = -4;
      return;
    } // error @ RG

    // loaded ordered ecc1 & ecc2

    if (ecc1 != 32 || cc1 != 35)
      F2L_RG(ScrambledCube);

    ////////////////////////////////////////////////////////////////////////////////////////////

    for (flag = false, i = 0; i < 24; i++) {
      if (ScrambledCube.Cube[Constants.CornorPositions[i]] == 119) {
        AssignCornor(Constants.CornorPositions[i]); // loads cc1 & cc2 (un ordered)
        if (ScrambledCube.Cube[cc1] == 103 && ScrambledCube.Cube[cc2] == 111) {
          flag = true;
          break;
        } else if (ScrambledCube.Cube[cc1] == 111 && ScrambledCube.Cube[cc2] == 103) {
          flag = true;
          cc1 += cc2;
          cc2 = cc1 - cc2;
          cc1 -= cc2;
          break;
        }
      }
    }

    for (flag = false, i = 0; i < 16; i++) {
      if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc1]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc2]) {
        flag = true;
        ecc1 = Constants.WhiteLessEdges[i];
        ecc2 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        break;
      } else if (ScrambledCube.Cube[Constants.WhiteLessEdges[i]] == ScrambledCube.Cube[cc2]
          && ScrambledCube.Cube[Tools.ConjugateEdge(Constants.WhiteLessEdges[i])] == ScrambledCube.Cube[cc1]) {
        flag = true;
        ecc1 = Tools.ConjugateEdge(Constants.WhiteLessEdges[i]);
        ecc2 = Constants.WhiteLessEdges[i];
        break;
      }
    }
    if (!flag) {
      ScrambledCube.ErrorCode = -5;
      return;
    } // error @ GO

    // loaded ordered ecc1 & ecc2

    if (ecc1 != 5 || cc1 != 8)
      F2L_GO(ScrambledCube);

    //////////////////////////////////////////////////////////////////

  }

  public static void F2L_GO(FridrichSolver Cube) {
    Cube.Solution += " ";

    switch (ecc1) {
      case 5:
        switch (cc1) {
          case 8: // null point;
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[0];
            Tools.rotateCube(Cube, 5, 0, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[1];
            Tools.rotateCube(Cube, 5, 1, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[2];
            Tools.rotateCube(Cube, 5, 2, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[3];
            Tools.rotateCube(Cube, 5, 3, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[4];
            Tools.rotateCube(Cube, 5, 4, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[5];
            Tools.rotateCube(Cube, 5, 5, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[6];
            Tools.rotateCube(Cube, 5, 6, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[7];
            Tools.rotateCube(Cube, 5, 7, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[8];
            Tools.rotateCube(Cube, 5, 8, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[9];
            Tools.rotateCube(Cube, 5, 9, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[10];
            Tools.rotateCube(Cube, 5, 10, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[11];
            Tools.rotateCube(Cube, 5, 11, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[12];
            Tools.rotateCube(Cube, 5, 12, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[13];
            Tools.rotateCube(Cube, 5, 13, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[14];
            Tools.rotateCube(Cube, 5, 14, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[15];
            Tools.rotateCube(Cube, 5, 15, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[16];
            Tools.rotateCube(Cube, 5, 16, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[17];
            Tools.rotateCube(Cube, 5, 17, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[18];
            Tools.rotateCube(Cube, 5, 18, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[19];
            Tools.rotateCube(Cube, 5, 19, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[20];
            Tools.rotateCube(Cube, 5, 20, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[21];
            Tools.rotateCube(Cube, 5, 21, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[22];
            Tools.rotateCube(Cube, 5, 22, "");
            return;
        }
        break;
      case 12:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[23];
            Tools.rotateCube(Cube, 5, 23, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[24];
            Tools.rotateCube(Cube, 5, 24, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[25];
            Tools.rotateCube(Cube, 5, 25, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[26];
            Tools.rotateCube(Cube, 5, 26, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[27];
            Tools.rotateCube(Cube, 5, 27, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[28];
            Tools.rotateCube(Cube, 5, 28, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[29];
            Tools.rotateCube(Cube, 5, 29, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[30];
            Tools.rotateCube(Cube, 5, 30, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[31];
            Tools.rotateCube(Cube, 5, 31, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[32];
            Tools.rotateCube(Cube, 5, 32, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[33];
            Tools.rotateCube(Cube, 5, 33, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[34];
            Tools.rotateCube(Cube, 5, 34, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[35];
            Tools.rotateCube(Cube, 5, 35, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[36];
            Tools.rotateCube(Cube, 5, 36, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[37];
            Tools.rotateCube(Cube, 5, 37, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[38];
            Tools.rotateCube(Cube, 5, 38, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[39];
            Tools.rotateCube(Cube, 5, 39, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[40];
            Tools.rotateCube(Cube, 5, 40, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[41];
            Tools.rotateCube(Cube, 5, 41, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[42];
            Tools.rotateCube(Cube, 5, 42, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[43];
            Tools.rotateCube(Cube, 5, 43, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[44];
            Tools.rotateCube(Cube, 5, 44, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[45];
            Tools.rotateCube(Cube, 5, 45, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[46];
            Tools.rotateCube(Cube, 5, 46, "");
            return;
        }
        break;
      case 14:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[47];
            Tools.rotateCube(Cube, 5, 47, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[48];
            Tools.rotateCube(Cube, 5, 48, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[49];
            Tools.rotateCube(Cube, 5, 49, "");
            return;
          case 17:// strcat(Cube.Solution,Constants.F2L_Algs[50];
            // Tools.rotateCube(Cube, 5,50, "");
            return; // null point
          case 24:
            Cube.Solution += Constants.F2L_Algs[51];
            Tools.rotateCube(Cube, 5, 51, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[52];
            Tools.rotateCube(Cube, 5, 52, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[53];
            Tools.rotateCube(Cube, 5, 53, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[54];
            Tools.rotateCube(Cube, 5, 54, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[55];
            Tools.rotateCube(Cube, 5, 55, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[56];
            Tools.rotateCube(Cube, 5, 56, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[57];
            Tools.rotateCube(Cube, 5, 57, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[58];
            Tools.rotateCube(Cube, 5, 58, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[59];
            Tools.rotateCube(Cube, 5, 59, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[60];
            Tools.rotateCube(Cube, 5, 60, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[61];
            Tools.rotateCube(Cube, 5, 61, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[62];
            Tools.rotateCube(Cube, 5, 62, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[63];
            Tools.rotateCube(Cube, 5, 63, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[64];
            Tools.rotateCube(Cube, 5, 64, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[65];
            Tools.rotateCube(Cube, 5, 65, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[66];
            Tools.rotateCube(Cube, 5, 66, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[67];
            Tools.rotateCube(Cube, 5, 67, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[68];
            Tools.rotateCube(Cube, 5, 68, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[69];
            Tools.rotateCube(Cube, 5, 69, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[70];
            Tools.rotateCube(Cube, 5, 70, "");
            return;
        }
        break;
      case 21:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[71];
            Tools.rotateCube(Cube, 5, 71, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[72];
            Tools.rotateCube(Cube, 5, 72, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[73];
            Tools.rotateCube(Cube, 5, 73, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[74];
            Tools.rotateCube(Cube, 5, 74, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[75];
            Tools.rotateCube(Cube, 5, 75, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[76];
            Tools.rotateCube(Cube, 5, 76, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[77];
            Tools.rotateCube(Cube, 5, 77, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[78];
            Tools.rotateCube(Cube, 5, 78, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[79];
            Tools.rotateCube(Cube, 5, 79, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[80];
            Tools.rotateCube(Cube, 5, 80, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[81];
            Tools.rotateCube(Cube, 5, 81, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[82];
            Tools.rotateCube(Cube, 5, 82, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[83];
            Tools.rotateCube(Cube, 5, 83, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[84];
            Tools.rotateCube(Cube, 5, 84, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[85];
            Tools.rotateCube(Cube, 5, 85, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[86];
            Tools.rotateCube(Cube, 5, 86, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[87];
            Tools.rotateCube(Cube, 5, 87, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[88];
            Tools.rotateCube(Cube, 5, 88, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[89];
            Tools.rotateCube(Cube, 5, 89, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[90];
            Tools.rotateCube(Cube, 5, 90, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[91];
            Tools.rotateCube(Cube, 5, 91, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[92];
            Tools.rotateCube(Cube, 5, 92, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[93];
            Tools.rotateCube(Cube, 5, 93, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[94];
            Tools.rotateCube(Cube, 5, 94, "");
            return;
        }
        break;
      case 23:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[95];
            Tools.rotateCube(Cube, 5, 95, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[96];
            Tools.rotateCube(Cube, 5, 96, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[97];
            Tools.rotateCube(Cube, 5, 97, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[98];
            Tools.rotateCube(Cube, 5, 98, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[99];
            Tools.rotateCube(Cube, 5, 99, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[100];
            Tools.rotateCube(Cube, 5, 100, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[101];
            Tools.rotateCube(Cube, 5, 101, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[102];
            Tools.rotateCube(Cube, 5, 102, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[103];
            Tools.rotateCube(Cube, 5, 103, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[104];
            Tools.rotateCube(Cube, 5, 104, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[105];
            Tools.rotateCube(Cube, 5, 105, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[106];
            Tools.rotateCube(Cube, 5, 106, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[107];
            Tools.rotateCube(Cube, 5, 107, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[108];
            Tools.rotateCube(Cube, 5, 108, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[109];
            Tools.rotateCube(Cube, 5, 109, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[110];
            Tools.rotateCube(Cube, 5, 110, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[111];
            Tools.rotateCube(Cube, 5, 111, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[112];
            Tools.rotateCube(Cube, 5, 112, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[113];
            Tools.rotateCube(Cube, 5, 113, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[114];
            Tools.rotateCube(Cube, 5, 114, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[115];
            Tools.rotateCube(Cube, 5, 115, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[116];
            Tools.rotateCube(Cube, 5, 116, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[117];
            Tools.rotateCube(Cube, 5, 117, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[118];
            Tools.rotateCube(Cube, 5, 118, "");
            return;
        }
        break;
      case 30:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[119];
            Tools.rotateCube(Cube, 5, 119, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[120];
            Tools.rotateCube(Cube, 5, 120, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[121];
            Tools.rotateCube(Cube, 5, 121, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[122];
            Tools.rotateCube(Cube, 5, 122, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[123];
            Tools.rotateCube(Cube, 5, 123, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[124];
            Tools.rotateCube(Cube, 5, 124, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[125];
            Tools.rotateCube(Cube, 5, 125, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[126];
            Tools.rotateCube(Cube, 5, 126, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[127];
            Tools.rotateCube(Cube, 5, 127, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[128];
            Tools.rotateCube(Cube, 5, 128, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[129];
            Tools.rotateCube(Cube, 5, 129, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[130];
            Tools.rotateCube(Cube, 5, 130, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[131];
            Tools.rotateCube(Cube, 5, 131, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[132];
            Tools.rotateCube(Cube, 5, 132, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[133];
            Tools.rotateCube(Cube, 5, 133, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[134];
            Tools.rotateCube(Cube, 5, 134, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[135];
            Tools.rotateCube(Cube, 5, 135, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[136];
            Tools.rotateCube(Cube, 5, 136, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[137];
            Tools.rotateCube(Cube, 5, 137, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[138];
            Tools.rotateCube(Cube, 5, 138, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[139];
            Tools.rotateCube(Cube, 5, 139, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[140];
            Tools.rotateCube(Cube, 5, 140, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[141];
            Tools.rotateCube(Cube, 5, 141, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[142];
            Tools.rotateCube(Cube, 5, 142, "");
            return;
        }
        break;
      case 32:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[143];
            Tools.rotateCube(Cube, 5, 143, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[144];
            Tools.rotateCube(Cube, 5, 144, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[145];
            Tools.rotateCube(Cube, 5, 145, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[146];
            Tools.rotateCube(Cube, 5, 146, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[147];
            Tools.rotateCube(Cube, 5, 147, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[148];
            Tools.rotateCube(Cube, 5, 148, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[149];
            Tools.rotateCube(Cube, 5, 149, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[150];
            Tools.rotateCube(Cube, 5, 150, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[151];
            Tools.rotateCube(Cube, 5, 151, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[152];
            Tools.rotateCube(Cube, 5, 152, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[153];
            Tools.rotateCube(Cube, 5, 153, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[154];
            Tools.rotateCube(Cube, 5, 154, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[155];
            Tools.rotateCube(Cube, 5, 155, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[156];
            Tools.rotateCube(Cube, 5, 156, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[157];
            Tools.rotateCube(Cube, 5, 157, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[158];
            Tools.rotateCube(Cube, 5, 158, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[159];
            Tools.rotateCube(Cube, 5, 159, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[160];
            Tools.rotateCube(Cube, 5, 160, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[161];
            Tools.rotateCube(Cube, 5, 161, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[162];
            Tools.rotateCube(Cube, 5, 162, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[163];
            Tools.rotateCube(Cube, 5, 163, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[164];
            Tools.rotateCube(Cube, 5, 164, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[165];
            Tools.rotateCube(Cube, 5, 165, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[166];
            Tools.rotateCube(Cube, 5, 166, "");
            return;
        }
        break;
      case 3:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[167];
            Tools.rotateCube(Cube, 5, 167, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[168];
            Tools.rotateCube(Cube, 5, 168, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[169];
            Tools.rotateCube(Cube, 5, 169, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[170];
            Tools.rotateCube(Cube, 5, 170, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[171];
            Tools.rotateCube(Cube, 5, 171, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[172];
            Tools.rotateCube(Cube, 5, 172, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[173];
            Tools.rotateCube(Cube, 5, 173, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[174];
            Tools.rotateCube(Cube, 5, 174, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[175];
            Tools.rotateCube(Cube, 5, 175, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[176];
            Tools.rotateCube(Cube, 5, 176, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[177];
            Tools.rotateCube(Cube, 5, 177, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[178];
            Tools.rotateCube(Cube, 5, 178, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[179];
            Tools.rotateCube(Cube, 5, 179, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[180];
            Tools.rotateCube(Cube, 5, 180, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[181];
            Tools.rotateCube(Cube, 5, 181, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[182];
            Tools.rotateCube(Cube, 5, 182, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[183];
            Tools.rotateCube(Cube, 5, 183, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[184];
            Tools.rotateCube(Cube, 5, 184, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[185];
            Tools.rotateCube(Cube, 5, 185, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[186];
            Tools.rotateCube(Cube, 5, 186, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[187];
            Tools.rotateCube(Cube, 5, 187, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[188];
            Tools.rotateCube(Cube, 5, 188, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[189];
            Tools.rotateCube(Cube, 5, 189, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[190];
            Tools.rotateCube(Cube, 5, 190, "");
            return;
        }
        break;
      case 1:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[191];
            Tools.rotateCube(Cube, 5, 191, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[192];
            Tools.rotateCube(Cube, 5, 192, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[193];
            Tools.rotateCube(Cube, 5, 193, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[194];
            Tools.rotateCube(Cube, 5, 194, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[195];
            Tools.rotateCube(Cube, 5, 195, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[196];
            Tools.rotateCube(Cube, 5, 196, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[197];
            Tools.rotateCube(Cube, 5, 197, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[198];
            Tools.rotateCube(Cube, 5, 198, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[199];
            Tools.rotateCube(Cube, 5, 199, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[200];
            Tools.rotateCube(Cube, 5, 200, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[201];
            Tools.rotateCube(Cube, 5, 201, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[202];
            Tools.rotateCube(Cube, 5, 202, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[203];
            Tools.rotateCube(Cube, 5, 203, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[204];
            Tools.rotateCube(Cube, 5, 204, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[205];
            Tools.rotateCube(Cube, 5, 205, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[206];
            Tools.rotateCube(Cube, 5, 206, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[207];
            Tools.rotateCube(Cube, 5, 207, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[208];
            Tools.rotateCube(Cube, 5, 208, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[209];
            Tools.rotateCube(Cube, 5, 209, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[210];
            Tools.rotateCube(Cube, 5, 210, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[211];
            Tools.rotateCube(Cube, 5, 211, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[212];
            Tools.rotateCube(Cube, 5, 212, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[213];
            Tools.rotateCube(Cube, 5, 213, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[214];
            Tools.rotateCube(Cube, 5, 214, "");
            return;
        }
        break;
      case 41:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[215];
            Tools.rotateCube(Cube, 5, 215, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[216];
            Tools.rotateCube(Cube, 5, 216, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[217];
            Tools.rotateCube(Cube, 5, 217, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[218];
            Tools.rotateCube(Cube, 5, 218, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[219];
            Tools.rotateCube(Cube, 5, 219, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[220];
            Tools.rotateCube(Cube, 5, 220, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[221];
            Tools.rotateCube(Cube, 5, 221, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[222];
            Tools.rotateCube(Cube, 5, 222, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[223];
            Tools.rotateCube(Cube, 5, 223, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[224];
            Tools.rotateCube(Cube, 5, 224, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[225];
            Tools.rotateCube(Cube, 5, 225, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[226];
            Tools.rotateCube(Cube, 5, 226, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[227];
            Tools.rotateCube(Cube, 5, 227, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[228];
            Tools.rotateCube(Cube, 5, 228, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[229];/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Tools.rotateCube(Cube, 5, 229, "");

            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[230];
            Tools.rotateCube(Cube, 5, 230, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[231];
            Tools.rotateCube(Cube, 5, 231, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[232];
            Tools.rotateCube(Cube, 5, 232, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[233];
            Tools.rotateCube(Cube, 5, 233, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[234];
            Tools.rotateCube(Cube, 5, 234, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[235];
            Tools.rotateCube(Cube, 5, 235, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[236];
            Tools.rotateCube(Cube, 5, 236, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[237];
            Tools.rotateCube(Cube, 5, 237, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[238];
            Tools.rotateCube(Cube, 5, 238, "");
            return;
        }
        break;
      case 10:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[239];
            Tools.rotateCube(Cube, 5, 239, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[240];
            Tools.rotateCube(Cube, 5, 240, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[241];
            Tools.rotateCube(Cube, 5, 241, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[242];
            Tools.rotateCube(Cube, 5, 242, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[243];
            Tools.rotateCube(Cube, 5, 243, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[244];
            Tools.rotateCube(Cube, 5, 244, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[245];
            Tools.rotateCube(Cube, 5, 245, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[246];
            Tools.rotateCube(Cube, 5, 246, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[247];
            Tools.rotateCube(Cube, 5, 247, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[248];
            Tools.rotateCube(Cube, 5, 248, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[249];
            Tools.rotateCube(Cube, 5, 249, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[250];
            Tools.rotateCube(Cube, 5, 250, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[251];
            Tools.rotateCube(Cube, 5, 251, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[252];
            Tools.rotateCube(Cube, 5, 252, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[253];
            Tools.rotateCube(Cube, 5, 253, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[254];
            Tools.rotateCube(Cube, 5, 254, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[255];
            Tools.rotateCube(Cube, 5, 255, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[256];
            Tools.rotateCube(Cube, 5, 256, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[257];
            Tools.rotateCube(Cube, 5, 257, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[258];
            Tools.rotateCube(Cube, 5, 258, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[259];
            Tools.rotateCube(Cube, 5, 259, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[260];
            Tools.rotateCube(Cube, 5, 260, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[261];
            Tools.rotateCube(Cube, 5, 261, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[262];
            Tools.rotateCube(Cube, 5, 262, "");
            return;
        }
        break;
      case 37:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[263];
            Tools.rotateCube(Cube, 5, 263, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[264];
            Tools.rotateCube(Cube, 5, 264, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[265];
            Tools.rotateCube(Cube, 5, 265, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[266];
            Tools.rotateCube(Cube, 5, 266, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[267];
            Tools.rotateCube(Cube, 5, 267, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[268];
            Tools.rotateCube(Cube, 5, 268, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[269];
            Tools.rotateCube(Cube, 5, 269, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[270];
            Tools.rotateCube(Cube, 5, 270, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[271];
            Tools.rotateCube(Cube, 5, 271, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[272];
            Tools.rotateCube(Cube, 5, 272, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[273];
            Tools.rotateCube(Cube, 5, 273, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[274];
            Tools.rotateCube(Cube, 5, 274, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[275];
            Tools.rotateCube(Cube, 5, 275, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[276];
            Tools.rotateCube(Cube, 5, 276, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[277];
            Tools.rotateCube(Cube, 5, 277, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[278];
            Tools.rotateCube(Cube, 5, 278, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[279];
            Tools.rotateCube(Cube, 5, 279, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[280];
            Tools.rotateCube(Cube, 5, 280, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[281];
            Tools.rotateCube(Cube, 5, 281, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[282];
            Tools.rotateCube(Cube, 5, 282, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[283];
            Tools.rotateCube(Cube, 5, 283, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[284];
            Tools.rotateCube(Cube, 5, 284, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[285];
            Tools.rotateCube(Cube, 5, 285, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[286];
            Tools.rotateCube(Cube, 5, 286, "");
            return;
        }
        break;
      case 19:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[287];
            Tools.rotateCube(Cube, 5, 287, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[288];
            Tools.rotateCube(Cube, 5, 288, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[289];
            Tools.rotateCube(Cube, 5, 289, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[290];
            Tools.rotateCube(Cube, 5, 290, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[291];
            Tools.rotateCube(Cube, 5, 291, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[292];
            Tools.rotateCube(Cube, 5, 292, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[293];
            Tools.rotateCube(Cube, 5, 293, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[294];
            Tools.rotateCube(Cube, 5, 294, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[295];
            Tools.rotateCube(Cube, 5, 295, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[296];
            Tools.rotateCube(Cube, 5, 296, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[297];
            Tools.rotateCube(Cube, 5, 297, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[298];
            Tools.rotateCube(Cube, 5, 298, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[299];
            Tools.rotateCube(Cube, 5, 299, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[300];
            Tools.rotateCube(Cube, 5, 300, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[301];
            Tools.rotateCube(Cube, 5, 301, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[302];
            Tools.rotateCube(Cube, 5, 302, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[303];
            Tools.rotateCube(Cube, 5, 303, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[304];
            Tools.rotateCube(Cube, 5, 304, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[305];
            Tools.rotateCube(Cube, 5, 305, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[306];
            Tools.rotateCube(Cube, 5, 306, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[307];
            Tools.rotateCube(Cube, 5, 307, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[308];
            Tools.rotateCube(Cube, 5, 308, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[309];
            Tools.rotateCube(Cube, 5, 309, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[310];
            Tools.rotateCube(Cube, 5, 310, "");
            return;
        }
        break;
      case 39:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[311];
            Tools.rotateCube(Cube, 5, 311, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[312];
            Tools.rotateCube(Cube, 5, 312, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[313];
            Tools.rotateCube(Cube, 5, 313, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[314];
            Tools.rotateCube(Cube, 5, 314, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[315];
            Tools.rotateCube(Cube, 5, 315, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[316];
            Tools.rotateCube(Cube, 5, 316, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[317];
            Tools.rotateCube(Cube, 5, 317, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[318];
            Tools.rotateCube(Cube, 5, 318, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[319];
            Tools.rotateCube(Cube, 5, 319, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[320];
            Tools.rotateCube(Cube, 5, 320, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[321];
            Tools.rotateCube(Cube, 5, 321, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[322];
            Tools.rotateCube(Cube, 5, 322, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[323];
            Tools.rotateCube(Cube, 5, 323, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[324];
            Tools.rotateCube(Cube, 5, 324, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[325];
            Tools.rotateCube(Cube, 5, 325, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[326];
            Tools.rotateCube(Cube, 5, 326, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[327];
            Tools.rotateCube(Cube, 5, 327, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[328];
            Tools.rotateCube(Cube, 5, 328, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[329];
            Tools.rotateCube(Cube, 5, 329, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[330];
            Tools.rotateCube(Cube, 5, 330, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[331];
            Tools.rotateCube(Cube, 5, 331, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[332];
            Tools.rotateCube(Cube, 5, 332, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[333];
            Tools.rotateCube(Cube, 5, 333, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[334];
            Tools.rotateCube(Cube, 5, 334, "");
            return;
        }
        break;
      case 28:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[335];
            Tools.rotateCube(Cube, 5, 335, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[336];
            Tools.rotateCube(Cube, 5, 336, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[337];
            Tools.rotateCube(Cube, 5, 337, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[338];
            Tools.rotateCube(Cube, 5, 338, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[339];
            Tools.rotateCube(Cube, 5, 339, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[340];
            Tools.rotateCube(Cube, 5, 340, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[341];
            Tools.rotateCube(Cube, 5, 341, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[342];
            Tools.rotateCube(Cube, 5, 342, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[343];
            Tools.rotateCube(Cube, 5, 343, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[344];
            Tools.rotateCube(Cube, 5, 344, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[345];
            Tools.rotateCube(Cube, 5, 345, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[346];
            Tools.rotateCube(Cube, 5, 346, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[347];
            Tools.rotateCube(Cube, 5, 347, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[348];
            Tools.rotateCube(Cube, 5, 348, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[349];
            Tools.rotateCube(Cube, 5, 349, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[350];
            Tools.rotateCube(Cube, 5, 350, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[351];
            Tools.rotateCube(Cube, 5, 351, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[352];
            Tools.rotateCube(Cube, 5, 352, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[353];
            Tools.rotateCube(Cube, 5, 353, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[354];
            Tools.rotateCube(Cube, 5, 354, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[355];
            Tools.rotateCube(Cube, 5, 355, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[356];
            Tools.rotateCube(Cube, 5, 356, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[357];
            Tools.rotateCube(Cube, 5, 357, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[358];
            Tools.rotateCube(Cube, 5, 358, "");
            return;
        }
        break;
      case 43:
        switch (cc1) {
          case 8:
            Cube.Solution += Constants.F2L_Algs[359];
            Tools.rotateCube(Cube, 5, 359, "");
            return;
          case 15:
            Cube.Solution += Constants.F2L_Algs[360];
            Tools.rotateCube(Cube, 5, 360, "");
            return;
          case 53:
            Cube.Solution += Constants.F2L_Algs[361];
            Tools.rotateCube(Cube, 5, 361, "");
            return;
          case 17:
            Cube.Solution += Constants.F2L_Algs[362];
            Tools.rotateCube(Cube, 5, 362, "");
            return;
          case 24:
            Cube.Solution += Constants.F2L_Algs[363];
            Tools.rotateCube(Cube, 5, 363, "");
            return;
          case 51:
            Cube.Solution += Constants.F2L_Algs[364];
            Tools.rotateCube(Cube, 5, 364, "");
            return;
          case 26:
            Cube.Solution += Constants.F2L_Algs[365];
            Tools.rotateCube(Cube, 5, 365, "");
            return;
          case 33:
            Cube.Solution += Constants.F2L_Algs[366];
            Tools.rotateCube(Cube, 5, 366, "");
            return;
          case 45:
            Cube.Solution += Constants.F2L_Algs[367];
            Tools.rotateCube(Cube, 5, 367, "");
            return;
          case 35:
            Cube.Solution += Constants.F2L_Algs[368];
            Tools.rotateCube(Cube, 5, 368, "");
            return;
          case 6:
            Cube.Solution += Constants.F2L_Algs[369];
            Tools.rotateCube(Cube, 5, 369, "");
            return;
          case 47:
            Cube.Solution += Constants.F2L_Algs[370];
            Tools.rotateCube(Cube, 5, 370, "");
            return;
          case 2:
            Cube.Solution += Constants.F2L_Algs[371];
            Tools.rotateCube(Cube, 5, 371, "");
            return;
          case 38:
            Cube.Solution += Constants.F2L_Algs[372];
            Tools.rotateCube(Cube, 5, 372, "");
            return;
          case 9:
            Cube.Solution += Constants.F2L_Algs[373];
            Tools.rotateCube(Cube, 5, 373, "");
            return;
          case 11:
            Cube.Solution += Constants.F2L_Algs[374];
            Tools.rotateCube(Cube, 5, 374, "");
            return;
          case 36:
            Cube.Solution += Constants.F2L_Algs[375];
            Tools.rotateCube(Cube, 5, 375, "");
            return;
          case 18:
            Cube.Solution += Constants.F2L_Algs[376];
            Tools.rotateCube(Cube, 5, 376, "");
            return;
          case 20:
            Cube.Solution += Constants.F2L_Algs[377];
            Tools.rotateCube(Cube, 5, 377, "");
            return;
          case 42:
            Cube.Solution += Constants.F2L_Algs[378];
            Tools.rotateCube(Cube, 5, 378, "");
            return;
          case 27:
            Cube.Solution += Constants.F2L_Algs[379];
            Tools.rotateCube(Cube, 5, 379, "");
            return;
          case 29:
            Cube.Solution += Constants.F2L_Algs[380];
            Tools.rotateCube(Cube, 5, 380, "");
            return;
          case 44:
            Cube.Solution += Constants.F2L_Algs[381];
            Tools.rotateCube(Cube, 5, 381, "");
            return;
          case 0:
            Cube.Solution += Constants.F2L_Algs[382];
            Tools.rotateCube(Cube, 5, 382, "");
            return;
        }
        break;
    }
  }

  public static void F2L_RG(FridrichSolver Cube) {

    Cube.Solution += " ";

    switch (ecc1) {
      case 5:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[52 - 2]);
            Tools.rotateCube(Cube, 4, 52 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[53 - 2]);
            Tools.rotateCube(Cube, 4, 53 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[54 - 2]);
            Tools.rotateCube(Cube, 4, 54 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[55 - 2]);
            Tools.rotateCube(Cube, 4, 55 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[56 - 2]);
            Tools.rotateCube(Cube, 4, 56 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[57 - 2]);
            Tools.rotateCube(Cube, 4, 57 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[58 - 2]);
            Tools.rotateCube(Cube, 4, 58 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[59 - 2]);
            Tools.rotateCube(Cube, 4, 59 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[60 - 2]);
            Tools.rotateCube(Cube, 4, 60 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[49 - 2]);
            Tools.rotateCube(Cube, 4, 49 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[50 - 2]);
            Tools.rotateCube(Cube, 4, 50 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[51 - 2]);
            Tools.rotateCube(Cube, 4, 51 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[64 - 2]);
            Tools.rotateCube(Cube, 4, 64 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[65 - 2]);
            Tools.rotateCube(Cube, 4, 65 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[66 - 2]);
            Tools.rotateCube(Cube, 4, 66 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[67 - 2]);
            Tools.rotateCube(Cube, 4, 67 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[68 - 2]);
            Tools.rotateCube(Cube, 4, 68 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[69 - 2]);
            Tools.rotateCube(Cube, 4, 69 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[70 - 2]);
            Tools.rotateCube(Cube, 4, 70 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[71 - 2]);
            Tools.rotateCube(Cube, 4, 71 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[72 - 2]);
            Tools.rotateCube(Cube, 4, 72 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[61 - 2]);
            Tools.rotateCube(Cube, 4, 61 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[62 - 2]);
            Tools.rotateCube(Cube, 4, 62 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[63 - 2]);
            Tools.rotateCube(Cube, 4, 63 - 2, "");
            return;
        }
        break;
      case 12:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[76 - 2]);
            Tools.rotateCube(Cube, 4, 76 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[77 - 2]);
            Tools.rotateCube(Cube, 4, 77 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[78 - 2]);
            Tools.rotateCube(Cube, 4, 78 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[79 - 2]);
            Tools.rotateCube(Cube, 4, 79 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[80 - 2]);
            Tools.rotateCube(Cube, 4, 80 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[81 - 2]);
            Tools.rotateCube(Cube, 4, 81 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[82 - 2]);
            Tools.rotateCube(Cube, 4, 82 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[83 - 2]);
            Tools.rotateCube(Cube, 4, 83 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[84 - 2]);
            Tools.rotateCube(Cube, 4, 84 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[73 - 2]);
            Tools.rotateCube(Cube, 4, 73 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[74 - 2]);
            Tools.rotateCube(Cube, 4, 74 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[75 - 2]);
            Tools.rotateCube(Cube, 4, 75 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[88 - 2]);
            Tools.rotateCube(Cube, 4, 88 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[89 - 2]);
            Tools.rotateCube(Cube, 4, 89 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[90 - 2]);
            Tools.rotateCube(Cube, 4, 90 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[91 - 2]);
            Tools.rotateCube(Cube, 4, 91 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[92 - 2]);
            Tools.rotateCube(Cube, 4, 92 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[93 - 2]);
            Tools.rotateCube(Cube, 4, 93 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[94 - 2]);
            Tools.rotateCube(Cube, 4, 94 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[95 - 2]);
            Tools.rotateCube(Cube, 4, 95 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[96 - 2]);
            Tools.rotateCube(Cube, 4, 96 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[85 - 2]);
            Tools.rotateCube(Cube, 4, 85 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[86 - 2]);
            Tools.rotateCube(Cube, 4, 86 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[87 - 2]);
            Tools.rotateCube(Cube, 4, 87 - 2, "");
            return;
        }
        break;
      case 14:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[100 - 2]);
            Tools.rotateCube(Cube, 4, 100 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[101 - 2]);
            Tools.rotateCube(Cube, 4, 101 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[102 - 2]);
            Tools.rotateCube(Cube, 4, 102 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[103 - 2]);
            Tools.rotateCube(Cube, 4, 103 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[104 - 2]);
            Tools.rotateCube(Cube, 4, 104 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[105 - 2]);
            Tools.rotateCube(Cube, 4, 105 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[106 - 2]);
            Tools.rotateCube(Cube, 4, 106 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[107 - 2]);
            Tools.rotateCube(Cube, 4, 107 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[108 - 2]);
            Tools.rotateCube(Cube, 4, 108 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[97 - 2]);
            Tools.rotateCube(Cube, 4, 97 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[98 - 2]);
            Tools.rotateCube(Cube, 4, 98 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[99 - 2]);
            Tools.rotateCube(Cube, 4, 99 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[112 - 2]);
            Tools.rotateCube(Cube, 4, 112 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[113 - 2]);
            Tools.rotateCube(Cube, 4, 113 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[114 - 2]);
            Tools.rotateCube(Cube, 4, 114 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[115 - 2]);
            Tools.rotateCube(Cube, 4, 115 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[116 - 2]);
            Tools.rotateCube(Cube, 4, 116 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[117 - 2]);
            Tools.rotateCube(Cube, 4, 117 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[118 - 2]);
            Tools.rotateCube(Cube, 4, 118 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[119 - 2]);
            Tools.rotateCube(Cube, 4, 119 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[120 - 2]);
            Tools.rotateCube(Cube, 4, 120 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[109 - 2]);
            Tools.rotateCube(Cube, 4, 109 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[110 - 2]);
            Tools.rotateCube(Cube, 4, 110 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[111 - 2]);
            Tools.rotateCube(Cube, 4, 111 - 2, "");
            return;
        }
        break;
      case 21:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[124 - 2]);
            Tools.rotateCube(Cube, 4, 124 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[125 - 2]);
            Tools.rotateCube(Cube, 4, 125 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[126 - 2]);
            Tools.rotateCube(Cube, 4, 126 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[127 - 2]);
            Tools.rotateCube(Cube, 4, 127 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[128 - 2]);
            Tools.rotateCube(Cube, 4, 128 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[129 - 2]);
            Tools.rotateCube(Cube, 4, 129 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[130 - 2]);
            Tools.rotateCube(Cube, 4, 130 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[131 - 2]);
            Tools.rotateCube(Cube, 4, 131 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[132 - 2]);
            Tools.rotateCube(Cube, 4, 132 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[121 - 2]);
            Tools.rotateCube(Cube, 4, 121 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[122 - 2]);
            Tools.rotateCube(Cube, 4, 122 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[123 - 2]);
            Tools.rotateCube(Cube, 4, 123 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[136 - 2]);
            Tools.rotateCube(Cube, 4, 136 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[137 - 2]);
            Tools.rotateCube(Cube, 4, 137 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[138 - 2]);
            Tools.rotateCube(Cube, 4, 138 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[139 - 2]);
            Tools.rotateCube(Cube, 4, 139 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[140 - 2]);
            Tools.rotateCube(Cube, 4, 140 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[141 - 2]);
            Tools.rotateCube(Cube, 4, 141 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[142 - 2]);
            Tools.rotateCube(Cube, 4, 142 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[143 - 2]);
            Tools.rotateCube(Cube, 4, 143 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[144 - 2]);
            Tools.rotateCube(Cube, 4, 144 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[133 - 2]);
            Tools.rotateCube(Cube, 4, 133 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[134 - 2]);
            Tools.rotateCube(Cube, 4, 134 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[135 - 2]);
            Tools.rotateCube(Cube, 4, 135 - 2, "");
            return;
        }
        break;
      case 23:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[148 - 2]);
            Tools.rotateCube(Cube, 4, 148 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[149 - 2]);
            Tools.rotateCube(Cube, 4, 149 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[150 - 2]);
            Tools.rotateCube(Cube, 4, 150 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[151 - 2]);
            Tools.rotateCube(Cube, 4, 151 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[152 - 2]);
            Tools.rotateCube(Cube, 4, 152 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[153 - 2]);
            Tools.rotateCube(Cube, 4, 153 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[154 - 2]);
            Tools.rotateCube(Cube, 4, 154 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[155 - 2]);
            Tools.rotateCube(Cube, 4, 155 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[156 - 2]);
            Tools.rotateCube(Cube, 4, 156 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[145 - 2]);
            Tools.rotateCube(Cube, 4, 145 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[146 - 2]);
            Tools.rotateCube(Cube, 4, 146 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[147 - 2]);
            Tools.rotateCube(Cube, 4, 147 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[160 - 2]);
            Tools.rotateCube(Cube, 4, 160 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[161 - 2]);
            Tools.rotateCube(Cube, 4, 161 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[162 - 2]);
            Tools.rotateCube(Cube, 4, 162 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[163 - 2]);
            Tools.rotateCube(Cube, 4, 163 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[164 - 2]);
            Tools.rotateCube(Cube, 4, 164 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[165 - 2]);
            Tools.rotateCube(Cube, 4, 165 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[166 - 2]);
            Tools.rotateCube(Cube, 4, 166 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[167 - 2]);
            Tools.rotateCube(Cube, 4, 167 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[168 - 2]);
            Tools.rotateCube(Cube, 4, 168 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[157 - 2]);
            Tools.rotateCube(Cube, 4, 157 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[158 - 2]);
            Tools.rotateCube(Cube, 4, 158 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[159 - 2]);
            Tools.rotateCube(Cube, 4, 159 - 2, "");
            return;
        }
        break;
      case 30:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[172 - 2]);
            Tools.rotateCube(Cube, 4, 172 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[173 - 2]);
            Tools.rotateCube(Cube, 4, 173 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[174 - 2]);
            Tools.rotateCube(Cube, 4, 174 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[175 - 2]);
            Tools.rotateCube(Cube, 4, 175 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[176 - 2]);
            Tools.rotateCube(Cube, 4, 176 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[177 - 2]);
            Tools.rotateCube(Cube, 4, 177 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[178 - 2]);
            Tools.rotateCube(Cube, 4, 178 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[179 - 2]);
            Tools.rotateCube(Cube, 4, 179 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[180 - 2]);
            Tools.rotateCube(Cube, 4, 180 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[169 - 2]);
            Tools.rotateCube(Cube, 4, 169 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[170 - 2]);
            Tools.rotateCube(Cube, 4, 170 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[171 - 2]);
            Tools.rotateCube(Cube, 4, 171 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[184 - 2]);
            Tools.rotateCube(Cube, 4, 184 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[185 - 2]);
            Tools.rotateCube(Cube, 4, 185 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[186 - 2]);
            Tools.rotateCube(Cube, 4, 186 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[187 - 2]);
            Tools.rotateCube(Cube, 4, 187 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[188 - 2]);
            Tools.rotateCube(Cube, 4, 188 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[189 - 2]);
            Tools.rotateCube(Cube, 4, 189 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[190 - 2]);
            Tools.rotateCube(Cube, 4, 190 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[191 - 2]);
            Tools.rotateCube(Cube, 4, 191 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[192 - 2]);
            Tools.rotateCube(Cube, 4, 192 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[181 - 2]);
            Tools.rotateCube(Cube, 4, 181 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[182 - 2]);
            Tools.rotateCube(Cube, 4, 182 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[183 - 2]);
            Tools.rotateCube(Cube, 4, 183 - 2, "");
            return;
        }
        break;
      case 32:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[4 - 2]);
            Tools.rotateCube(Cube, 4, 4 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[5 - 2]);
            Tools.rotateCube(Cube, 4, 5 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[6 - 2]);
            Tools.rotateCube(Cube, 4, 6 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[7 - 2]);
            Tools.rotateCube(Cube, 4, 7 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[8 - 2]);
            Tools.rotateCube(Cube, 4, 8 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[9 - 2]);
            Tools.rotateCube(Cube, 4, 9 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[10 - 2]);
            Tools.rotateCube(Cube, 4, 10 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[11 - 2]);
            Tools.rotateCube(Cube, 4, 11 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[12 - 2]);
            Tools.rotateCube(Cube, 4, 12 - 2, "");
            return;
          case 35:// null point
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[2 - 2]);
            Tools.rotateCube(Cube, 4, 2 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[3 - 2]);
            Tools.rotateCube(Cube, 4, 3 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[16 - 2]);
            Tools.rotateCube(Cube, 4, 16 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[17 - 2]);
            Tools.rotateCube(Cube, 4, 17 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[18 - 2]);
            Tools.rotateCube(Cube, 4, 18 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[19 - 2]);
            Tools.rotateCube(Cube, 4, 19 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[20 - 2]);
            Tools.rotateCube(Cube, 4, 20 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[21 - 2]);
            Tools.rotateCube(Cube, 4, 21 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[22 - 2]);
            Tools.rotateCube(Cube, 4, 22 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[23 - 2]);
            Tools.rotateCube(Cube, 4, 23 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[24 - 2]);
            Tools.rotateCube(Cube, 4, 24 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[13 - 2]);
            Tools.rotateCube(Cube, 4, 13 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[14 - 2]);
            Tools.rotateCube(Cube, 4, 14 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[15 - 2]);
            Tools.rotateCube(Cube, 4, 15 - 2, "");
            return;
        }
        break;
      case 3:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[28 - 2]);
            Tools.rotateCube(Cube, 4, 28 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[29 - 2]);
            Tools.rotateCube(Cube, 4, 29 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[30 - 2]);
            Tools.rotateCube(Cube, 4, 30 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[31 - 2]);
            Tools.rotateCube(Cube, 4, 31 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[32 - 2]);
            Tools.rotateCube(Cube, 4, 32 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[33 - 2]);
            Tools.rotateCube(Cube, 4, 33 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[34 - 2]);
            Tools.rotateCube(Cube, 4, 34 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[35 - 2]);
            Tools.rotateCube(Cube, 4, 35 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[36 - 2]);
            Tools.rotateCube(Cube, 4, 36 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[25 - 2]);
            Tools.rotateCube(Cube, 4, 25 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[26 - 2]);
            Tools.rotateCube(Cube, 4, 26 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[27 - 2]);
            Tools.rotateCube(Cube, 4, 27 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[40 - 2]);
            Tools.rotateCube(Cube, 4, 40 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[41 - 2]);
            Tools.rotateCube(Cube, 4, 41 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[42 - 2]);
            Tools.rotateCube(Cube, 4, 42 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[43 - 2]);
            Tools.rotateCube(Cube, 4, 43 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[44 - 2]);
            Tools.rotateCube(Cube, 4, 44 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[45 - 2]);
            Tools.rotateCube(Cube, 4, 45 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[46 - 2]);
            Tools.rotateCube(Cube, 4, 46 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[47 - 2]);
            Tools.rotateCube(Cube, 4, 47 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[48 - 2]);
            Tools.rotateCube(Cube, 4, 48 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[37 - 2]);
            Tools.rotateCube(Cube, 4, 37 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[38 - 2]);
            Tools.rotateCube(Cube, 4, 38 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[39 - 2]);
            Tools.rotateCube(Cube, 4, 39 - 2, "");
            return;
        }
        break;
      case 1:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[244 - 2]);
            Tools.rotateCube(Cube, 4, 244 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[245 - 2]);
            Tools.rotateCube(Cube, 4, 245 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[246 - 2]);
            Tools.rotateCube(Cube, 4, 246 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[247 - 2]);
            Tools.rotateCube(Cube, 4, 247 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[248 - 2]);
            Tools.rotateCube(Cube, 4, 248 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[249 - 2]);
            Tools.rotateCube(Cube, 4, 249 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[250 - 2]);
            Tools.rotateCube(Cube, 4, 250 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[251 - 2]);
            Tools.rotateCube(Cube, 4, 251 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[252 - 2]);
            Tools.rotateCube(Cube, 4, 252 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[241 - 2]);
            Tools.rotateCube(Cube, 4, 241 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[242 - 2]);
            Tools.rotateCube(Cube, 4, 242 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[243 - 2]);
            Tools.rotateCube(Cube, 4, 243 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[256 - 2]);
            Tools.rotateCube(Cube, 4, 256 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[257 - 2]);
            Tools.rotateCube(Cube, 4, 257 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[258 - 2]);
            Tools.rotateCube(Cube, 4, 258 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[259 - 2]);
            Tools.rotateCube(Cube, 4, 259 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[260 - 2]);
            Tools.rotateCube(Cube, 4, 260 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[261 - 2]);
            Tools.rotateCube(Cube, 4, 261 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[262 - 2]);
            Tools.rotateCube(Cube, 4, 262 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[263 - 2]);
            Tools.rotateCube(Cube, 4, 263 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[264 - 2]);
            Tools.rotateCube(Cube, 4, 264 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[253 - 2]);
            Tools.rotateCube(Cube, 4, 253 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[254 - 2]);
            Tools.rotateCube(Cube, 4, 254 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[255 - 2]);
            Tools.rotateCube(Cube, 4, 255 - 2, "");
            return;
        }
        break;
      case 41:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[268 - 2]);
            Tools.rotateCube(Cube, 4, 268 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[269 - 2]);
            Tools.rotateCube(Cube, 4, 269 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[270 - 2]);
            Tools.rotateCube(Cube, 4, 270 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[271 - 2]);
            Tools.rotateCube(Cube, 4, 271 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[272 - 2]);
            Tools.rotateCube(Cube, 4, 272 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[273 - 2]);
            Tools.rotateCube(Cube, 4, 273 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[274 - 2]);
            Tools.rotateCube(Cube, 4, 274 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[275 - 2]);
            Tools.rotateCube(Cube, 4, 275 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[276 - 2]);
            Tools.rotateCube(Cube, 4, 276 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[265 - 2]);
            Tools.rotateCube(Cube, 4, 265 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[266 - 2]);
            Tools.rotateCube(Cube, 4, 266 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[267 - 2]);
            Tools.rotateCube(Cube, 4, 267 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[280 - 2]);
            Tools.rotateCube(Cube, 4, 280 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[281 - 2]);
            Tools.rotateCube(Cube, 4, 281 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[282 - 2]);
            Tools.rotateCube(Cube, 4, 282 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[283 - 2]);
            Tools.rotateCube(Cube, 4, 283 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[284 - 2]);
            Tools.rotateCube(Cube, 4, 284 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[285 - 2]);
            Tools.rotateCube(Cube, 4, 285 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[286 - 2]);
            Tools.rotateCube(Cube, 4, 286 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[287 - 2]);
            Tools.rotateCube(Cube, 4, 287 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[288 - 2]);
            Tools.rotateCube(Cube, 4, 288 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[277 - 2]);
            Tools.rotateCube(Cube, 4, 277 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[278 - 2]);
            Tools.rotateCube(Cube, 4, 278 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[279 - 2]);
            Tools.rotateCube(Cube, 4, 279 - 2, "");
            return;
        }
        break;
      case 10:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[292 - 2]);
            Tools.rotateCube(Cube, 4, 292 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[293 - 2]);
            Tools.rotateCube(Cube, 4, 293 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[294 - 2]);
            Tools.rotateCube(Cube, 4, 294 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[295 - 2]);
            Tools.rotateCube(Cube, 4, 295 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[296 - 2]);
            Tools.rotateCube(Cube, 4, 296 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[297 - 2]);
            Tools.rotateCube(Cube, 4, 297 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[298 - 2]);
            Tools.rotateCube(Cube, 4, 298 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[299 - 2]);
            Tools.rotateCube(Cube, 4, 299 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[300 - 2]);
            Tools.rotateCube(Cube, 4, 300 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[289 - 2]);
            Tools.rotateCube(Cube, 4, 289 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[290 - 2]);
            Tools.rotateCube(Cube, 4, 290 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[291 - 2]);
            Tools.rotateCube(Cube, 4, 291 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[304 - 2]);
            Tools.rotateCube(Cube, 4, 304 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[305 - 2]);
            Tools.rotateCube(Cube, 4, 305 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[306 - 2]);
            Tools.rotateCube(Cube, 4, 306 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[307 - 2]);
            Tools.rotateCube(Cube, 4, 307 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[308 - 2]);
            Tools.rotateCube(Cube, 4, 308 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[309 - 2]);
            Tools.rotateCube(Cube, 4, 309 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[310 - 2]);
            Tools.rotateCube(Cube, 4, 310 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[311 - 2]);
            Tools.rotateCube(Cube, 4, 311 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[312 - 2]);
            Tools.rotateCube(Cube, 4, 312 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[301 - 2]);
            Tools.rotateCube(Cube, 4, 301 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[302 - 2]);
            Tools.rotateCube(Cube, 4, 302 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[303 - 2]);
            Tools.rotateCube(Cube, 4, 303 - 2, "");
            return;
        }
        break;
      case 37:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[316 - 2]);
            Tools.rotateCube(Cube, 4, 316 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[317 - 2]);
            Tools.rotateCube(Cube, 4, 317 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[318 - 2]);
            Tools.rotateCube(Cube, 4, 318 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[319 - 2]);
            Tools.rotateCube(Cube, 4, 319 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[320 - 2]);
            Tools.rotateCube(Cube, 4, 320 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[321 - 2]);
            Tools.rotateCube(Cube, 4, 321 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[322 - 2]);
            Tools.rotateCube(Cube, 4, 322 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[323 - 2]);
            Tools.rotateCube(Cube, 4, 323 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[324 - 2]);
            Tools.rotateCube(Cube, 4, 324 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[313 - 2]);
            Tools.rotateCube(Cube, 4, 313 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[314 - 2]);
            Tools.rotateCube(Cube, 4, 314 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[315 - 2]);
            Tools.rotateCube(Cube, 4, 315 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[328 - 2]);
            Tools.rotateCube(Cube, 4, 328 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[329 - 2]);
            Tools.rotateCube(Cube, 4, 329 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[330 - 2]);
            Tools.rotateCube(Cube, 4, 330 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[331 - 2]);
            Tools.rotateCube(Cube, 4, 331 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[332 - 2]);
            Tools.rotateCube(Cube, 4, 332 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[333 - 2]);
            Tools.rotateCube(Cube, 4, 333 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[334 - 2]);
            Tools.rotateCube(Cube, 4, 334 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[335 - 2]);
            Tools.rotateCube(Cube, 4, 335 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[336 - 2]);
            Tools.rotateCube(Cube, 4, 336 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[325 - 2]);
            Tools.rotateCube(Cube, 4, 325 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[326 - 2]);
            Tools.rotateCube(Cube, 4, 326 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[327 - 2]);
            Tools.rotateCube(Cube, 4, 327 - 2, "");
            return;
        }
        break;
      case 19:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[340 - 2]);
            Tools.rotateCube(Cube, 4, 340 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[341 - 2]);
            Tools.rotateCube(Cube, 4, 341 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[342 - 2]);
            Tools.rotateCube(Cube, 4, 342 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[343 - 2]);
            Tools.rotateCube(Cube, 4, 343 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[344 - 2]);
            Tools.rotateCube(Cube, 4, 344 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[345 - 2]);
            Tools.rotateCube(Cube, 4, 345 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[346 - 2]);
            Tools.rotateCube(Cube, 4, 346 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[347 - 2]);
            Tools.rotateCube(Cube, 4, 347 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[348 - 2]);
            Tools.rotateCube(Cube, 4, 348 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[337 - 2]);
            Tools.rotateCube(Cube, 4, 337 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[338 - 2]);
            Tools.rotateCube(Cube, 4, 338 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[339 - 2]);
            Tools.rotateCube(Cube, 4, 339 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[352 - 2]);
            Tools.rotateCube(Cube, 4, 352 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[353 - 2]);
            Tools.rotateCube(Cube, 4, 353 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[354 - 2]);
            Tools.rotateCube(Cube, 4, 354 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[355 - 2]);
            Tools.rotateCube(Cube, 4, 355 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[356 - 2]);
            Tools.rotateCube(Cube, 4, 356 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[357 - 2]);
            Tools.rotateCube(Cube, 4, 357 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[358 - 2]);
            Tools.rotateCube(Cube, 4, 358 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[359 - 2]);
            Tools.rotateCube(Cube, 4, 359 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[360 - 2]);
            Tools.rotateCube(Cube, 4, 360 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[349 - 2]);
            Tools.rotateCube(Cube, 4, 349 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[350 - 2]);
            Tools.rotateCube(Cube, 4, 350 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[351 - 2]);
            Tools.rotateCube(Cube, 4, 351 - 2, "");
            return;
        }
        break;
      case 39:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[364 - 2]);
            Tools.rotateCube(Cube, 4, 364 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[365 - 2]);
            Tools.rotateCube(Cube, 4, 365 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[366 - 2]);
            Tools.rotateCube(Cube, 4, 366 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[367 - 2]);
            Tools.rotateCube(Cube, 4, 367 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[368 - 2]);
            Tools.rotateCube(Cube, 4, 368 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[369 - 2]);
            Tools.rotateCube(Cube, 4, 369 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[370 - 2]);
            Tools.rotateCube(Cube, 4, 370 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[371 - 2]);
            Tools.rotateCube(Cube, 4, 371 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[372 - 2]);
            Tools.rotateCube(Cube, 4, 372 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[361 - 2]);
            Tools.rotateCube(Cube, 4, 361 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[362 - 2]);
            Tools.rotateCube(Cube, 4, 362 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[363 - 2]);
            Tools.rotateCube(Cube, 4, 363 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[376 - 2]);
            Tools.rotateCube(Cube, 4, 376 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[377 - 2]);
            Tools.rotateCube(Cube, 4, 377 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[378 - 2]);
            Tools.rotateCube(Cube, 4, 378 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[379 - 2]);
            Tools.rotateCube(Cube, 4, 379 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[380 - 2]);
            Tools.rotateCube(Cube, 4, 380 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[381 - 2]);
            Tools.rotateCube(Cube, 4, 381 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[382 - 2]);
            Tools.rotateCube(Cube, 4, 382 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[383 - 2]);
            Tools.rotateCube(Cube, 4, 383 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[384 - 2]);
            Tools.rotateCube(Cube, 4, 384 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[373 - 2]);
            Tools.rotateCube(Cube, 4, 373 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[374 - 2]);
            Tools.rotateCube(Cube, 4, 374 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[375 - 2]);
            Tools.rotateCube(Cube, 4, 375 - 2, "");
            return;
        }
        break;
      case 28:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[196 - 2]);
            Tools.rotateCube(Cube, 4, 196 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[197 - 2]);
            Tools.rotateCube(Cube, 4, 197 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[198 - 2]);
            Tools.rotateCube(Cube, 4, 198 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[199 - 2]);
            Tools.rotateCube(Cube, 4, 199 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[200 - 2]);
            Tools.rotateCube(Cube, 4, 200 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[201 - 2]);
            Tools.rotateCube(Cube, 4, 201 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[202 - 2]);
            Tools.rotateCube(Cube, 4, 202 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[203 - 2]);
            Tools.rotateCube(Cube, 4, 203 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[204 - 2]);
            Tools.rotateCube(Cube, 4, 204 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[193 - 2]);
            Tools.rotateCube(Cube, 4, 193 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[194 - 2]);
            Tools.rotateCube(Cube, 4, 194 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[195 - 2]);
            Tools.rotateCube(Cube, 4, 195 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[208 - 2]);
            Tools.rotateCube(Cube, 4, 208 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[209 - 2]);
            Tools.rotateCube(Cube, 4, 209 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[210 - 2]);
            Tools.rotateCube(Cube, 4, 210 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[211 - 2]);
            Tools.rotateCube(Cube, 4, 211 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[212 - 2]);
            Tools.rotateCube(Cube, 4, 212 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[213 - 2]);
            Tools.rotateCube(Cube, 4, 213 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[214 - 2]);
            Tools.rotateCube(Cube, 4, 214 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[215 - 2]);
            Tools.rotateCube(Cube, 4, 215 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[216 - 2]);
            Tools.rotateCube(Cube, 4, 216 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[205 - 2]);
            Tools.rotateCube(Cube, 4, 205 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[206 - 2]);
            Tools.rotateCube(Cube, 4, 206 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[207 - 2]);
            Tools.rotateCube(Cube, 4, 207 - 2, "");
            return;
        }
        break;
      case 43:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[220 - 2]);
            Tools.rotateCube(Cube, 4, 220 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[221 - 2]);
            Tools.rotateCube(Cube, 4, 221 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[222 - 2]);
            Tools.rotateCube(Cube, 4, 222 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[223 - 2]);
            Tools.rotateCube(Cube, 4, 223 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[224 - 2]);
            Tools.rotateCube(Cube, 4, 224 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[225 - 2]);
            Tools.rotateCube(Cube, 4, 225 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[226 - 2]);
            Tools.rotateCube(Cube, 4, 226 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[227 - 2]);
            Tools.rotateCube(Cube, 4, 227 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[228 - 2]);
            Tools.rotateCube(Cube, 4, 228 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[217 - 2]);
            Tools.rotateCube(Cube, 4, 217 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[218 - 2]);
            Tools.rotateCube(Cube, 4, 218 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[219 - 2]);
            Tools.rotateCube(Cube, 4, 219 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[232 - 2]);
            Tools.rotateCube(Cube, 4, 232 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[233 - 2]);
            Tools.rotateCube(Cube, 4, 233 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[234 - 2]);
            Tools.rotateCube(Cube, 4, 234 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[235 - 2]);
            Tools.rotateCube(Cube, 4, 235 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[236 - 2]);
            Tools.rotateCube(Cube, 4, 236 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[237 - 2]);
            Tools.rotateCube(Cube, 4, 237 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[238 - 2]);
            Tools.rotateCube(Cube, 4, 238 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[239 - 2]);
            Tools.rotateCube(Cube, 4, 239 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[240 - 2]);
            Tools.rotateCube(Cube, 4, 240 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[229 - 2]);
            Tools.rotateCube(Cube, 4, 229 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[230 - 2]);
            Tools.rotateCube(Cube, 4, 230 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.ydPerm(Constants.F2L_Algs[231 - 2]);
            Tools.rotateCube(Cube, 4, 231 - 2, "");
            return;
        }
        break;
    }
  }

  public static void F2L_BR(FridrichSolver Cube) {

    Cube.Solution += " ";

    switch (ecc1) {
      case 5:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[103 - 2]);
            Tools.rotateCube(Cube, 3, 103 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[104 - 2]);
            Tools.rotateCube(Cube, 3, 104 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[105 - 2]);
            Tools.rotateCube(Cube, 3, 105 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[106 - 2]);
            Tools.rotateCube(Cube, 3, 106 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[107 - 2]);
            Tools.rotateCube(Cube, 3, 107 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[108 - 2]);
            Tools.rotateCube(Cube, 3, 108 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[97 - 2]);
            Tools.rotateCube(Cube, 3, 97 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[98 - 2]);
            Tools.rotateCube(Cube, 3, 98 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[99 - 2]);
            Tools.rotateCube(Cube, 3, 99 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[100 - 2]);
            Tools.rotateCube(Cube, 3, 100 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[101 - 2]);
            Tools.rotateCube(Cube, 3, 101 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[102 - 2]);
            Tools.rotateCube(Cube, 3, 102 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[115 - 2]);
            Tools.rotateCube(Cube, 3, 115 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[116 - 2]);
            Tools.rotateCube(Cube, 3, 116 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[117 - 2]);
            Tools.rotateCube(Cube, 3, 117 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[118 - 2]);
            Tools.rotateCube(Cube, 3, 118 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[119 - 2]);
            Tools.rotateCube(Cube, 3, 119 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[120 - 2]);
            Tools.rotateCube(Cube, 3, 120 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[109 - 2]);
            Tools.rotateCube(Cube, 3, 109 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[110 - 2]);
            Tools.rotateCube(Cube, 3, 110 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[111 - 2]);
            Tools.rotateCube(Cube, 3, 111 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[112 - 2]);
            Tools.rotateCube(Cube, 3, 112 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[113 - 2]);
            Tools.rotateCube(Cube, 3, 113 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[114 - 2]);
            Tools.rotateCube(Cube, 3, 114 - 2, "");
            return;
        }
        break;
      case 12:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[127 - 2]);
            Tools.rotateCube(Cube, 3, 127 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[128 - 2]);
            Tools.rotateCube(Cube, 3, 128 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[129 - 2]);
            Tools.rotateCube(Cube, 3, 129 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[130 - 2]);
            Tools.rotateCube(Cube, 3, 130 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[131 - 2]);
            Tools.rotateCube(Cube, 3, 131 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[132 - 2]);
            Tools.rotateCube(Cube, 3, 132 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[121 - 2]);
            Tools.rotateCube(Cube, 3, 121 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[122 - 2]);
            Tools.rotateCube(Cube, 3, 122 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[123 - 2]);
            Tools.rotateCube(Cube, 3, 123 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[124 - 2]);
            Tools.rotateCube(Cube, 3, 124 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[125 - 2]);
            Tools.rotateCube(Cube, 3, 125 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[126 - 2]);
            Tools.rotateCube(Cube, 3, 126 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[139 - 2]);
            Tools.rotateCube(Cube, 3, 139 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[140 - 2]);
            Tools.rotateCube(Cube, 3, 140 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[141 - 2]);
            Tools.rotateCube(Cube, 3, 141 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[142 - 2]);
            Tools.rotateCube(Cube, 3, 142 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[143 - 2]);
            Tools.rotateCube(Cube, 3, 143 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[144 - 2]);
            Tools.rotateCube(Cube, 3, 144 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[133 - 2]);
            Tools.rotateCube(Cube, 3, 133 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[134 - 2]);
            Tools.rotateCube(Cube, 3, 134 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[135 - 2]);
            Tools.rotateCube(Cube, 3, 135 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[136 - 2]);
            Tools.rotateCube(Cube, 3, 136 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[137 - 2]);
            Tools.rotateCube(Cube, 3, 137 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[138 - 2]);
            Tools.rotateCube(Cube, 3, 138 - 2, "");
            return;
        }
        break;
      case 14:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[151 - 2]);
            Tools.rotateCube(Cube, 3, 151 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[152 - 2]);
            Tools.rotateCube(Cube, 3, 152 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[153 - 2]);
            Tools.rotateCube(Cube, 3, 153 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[154 - 2]);
            Tools.rotateCube(Cube, 3, 154 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[155 - 2]);
            Tools.rotateCube(Cube, 3, 155 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[156 - 2]);
            Tools.rotateCube(Cube, 3, 156 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[145 - 2]);
            Tools.rotateCube(Cube, 3, 145 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[146 - 2]);
            Tools.rotateCube(Cube, 3, 146 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[147 - 2]);
            Tools.rotateCube(Cube, 3, 147 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[148 - 2]);
            Tools.rotateCube(Cube, 3, 148 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[149 - 2]);
            Tools.rotateCube(Cube, 3, 149 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[150 - 2]);
            Tools.rotateCube(Cube, 3, 150 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[163 - 2]);
            Tools.rotateCube(Cube, 3, 163 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[164 - 2]);
            Tools.rotateCube(Cube, 3, 164 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[165 - 2]);
            Tools.rotateCube(Cube, 3, 165 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[166 - 2]);
            Tools.rotateCube(Cube, 3, 166 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[167 - 2]);
            Tools.rotateCube(Cube, 3, 167 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[168 - 2]);
            Tools.rotateCube(Cube, 3, 168 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[157 - 2]);
            Tools.rotateCube(Cube, 3, 157 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[158 - 2]);
            Tools.rotateCube(Cube, 3, 158 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[159 - 2]);
            Tools.rotateCube(Cube, 3, 159 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[160 - 2]);
            Tools.rotateCube(Cube, 3, 160 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[161 - 2]);
            Tools.rotateCube(Cube, 3, 161 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[162 - 2]);
            Tools.rotateCube(Cube, 3, 162 - 2, "");
            return;
        }
        break;
      case 21:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[175 - 2]);
            Tools.rotateCube(Cube, 3, 175 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[176 - 2]);
            Tools.rotateCube(Cube, 3, 176 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[177 - 2]);
            Tools.rotateCube(Cube, 3, 177 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[178 - 2]);
            Tools.rotateCube(Cube, 3, 178 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[179 - 2]);
            Tools.rotateCube(Cube, 3, 179 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[180 - 2]);
            Tools.rotateCube(Cube, 3, 180 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[169 - 2]);
            Tools.rotateCube(Cube, 3, 169 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[170 - 2]);
            Tools.rotateCube(Cube, 3, 170 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[171 - 2]);
            Tools.rotateCube(Cube, 3, 171 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[172 - 2]);
            Tools.rotateCube(Cube, 3, 172 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[173 - 2]);
            Tools.rotateCube(Cube, 3, 173 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[174 - 2]);
            Tools.rotateCube(Cube, 3, 174 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[187 - 2]);
            Tools.rotateCube(Cube, 3, 187 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[188 - 2]);
            Tools.rotateCube(Cube, 3, 188 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[189 - 2]);
            Tools.rotateCube(Cube, 3, 189 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[190 - 2]);
            Tools.rotateCube(Cube, 3, 190 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[191 - 2]);
            Tools.rotateCube(Cube, 3, 191 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[192 - 2]);
            Tools.rotateCube(Cube, 3, 192 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[181 - 2]);
            Tools.rotateCube(Cube, 3, 181 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[182 - 2]);
            Tools.rotateCube(Cube, 3, 182 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[183 - 2]);
            Tools.rotateCube(Cube, 3, 183 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[184 - 2]);
            Tools.rotateCube(Cube, 3, 184 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[185 - 2]);
            Tools.rotateCube(Cube, 3, 185 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[186 - 2]);
            Tools.rotateCube(Cube, 3, 186 - 2, "");
            return;
        }
        break;
      case 23:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[7 - 2]);
            Tools.rotateCube(Cube, 3, 7 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[8 - 2]);
            Tools.rotateCube(Cube, 3, 8 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[9 - 2]);
            Tools.rotateCube(Cube, 3, 9 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[10 - 2]);
            Tools.rotateCube(Cube, 3, 10 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[11 - 2]);
            Tools.rotateCube(Cube, 3, 11 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[12 - 2]);
            Tools.rotateCube(Cube, 3, 12 - 2, "");
            return;
          case 26:// null point
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[2 - 2]);
            Tools.rotateCube(Cube, 3, 2 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[3 - 2]);
            Tools.rotateCube(Cube, 3, 3 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[4 - 2]);
            Tools.rotateCube(Cube, 3, 4 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[5 - 2]);
            Tools.rotateCube(Cube, 3, 5 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[6 - 2]);
            Tools.rotateCube(Cube, 3, 6 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[19 - 2]);
            Tools.rotateCube(Cube, 3, 19 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[20 - 2]);
            Tools.rotateCube(Cube, 3, 20 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[21 - 2]);
            Tools.rotateCube(Cube, 3, 21 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[22 - 2]);
            Tools.rotateCube(Cube, 3, 22 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[23 - 2]);
            Tools.rotateCube(Cube, 3, 23 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[24 - 2]);
            Tools.rotateCube(Cube, 3, 24 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[13 - 2]);
            Tools.rotateCube(Cube, 3, 13 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[14 - 2]);
            Tools.rotateCube(Cube, 3, 14 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[15 - 2]);
            Tools.rotateCube(Cube, 3, 15 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[16 - 2]);
            Tools.rotateCube(Cube, 3, 16 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[17 - 2]);
            Tools.rotateCube(Cube, 3, 17 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[18 - 2]);
            Tools.rotateCube(Cube, 3, 18 - 2, "");
            return;
        }
        break;
      case 30:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[31 - 2]);
            Tools.rotateCube(Cube, 3, 31 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[32 - 2]);
            Tools.rotateCube(Cube, 3, 32 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[33 - 2]);
            Tools.rotateCube(Cube, 3, 33 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[34 - 2]);
            Tools.rotateCube(Cube, 3, 34 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[35 - 2]);
            Tools.rotateCube(Cube, 3, 35 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[36 - 2]);
            Tools.rotateCube(Cube, 3, 36 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[25 - 2]);
            Tools.rotateCube(Cube, 3, 25 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[26 - 2]);
            Tools.rotateCube(Cube, 3, 26 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[27 - 2]);
            Tools.rotateCube(Cube, 3, 27 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[28 - 2]);
            Tools.rotateCube(Cube, 3, 28 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[29 - 2]);
            Tools.rotateCube(Cube, 3, 29 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[30 - 2]);
            Tools.rotateCube(Cube, 3, 30 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[43 - 2]);
            Tools.rotateCube(Cube, 3, 43 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[44 - 2]);
            Tools.rotateCube(Cube, 3, 44 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[45 - 2]);
            Tools.rotateCube(Cube, 3, 45 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[46 - 2]);
            Tools.rotateCube(Cube, 3, 46 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[47 - 2]);
            Tools.rotateCube(Cube, 3, 47 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[48 - 2]);
            Tools.rotateCube(Cube, 3, 48 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[37 - 2]);
            Tools.rotateCube(Cube, 3, 37 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[38 - 2]);
            Tools.rotateCube(Cube, 3, 38 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[39 - 2]);
            Tools.rotateCube(Cube, 3, 39 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[40 - 2]);
            Tools.rotateCube(Cube, 3, 40 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[41 - 2]);
            Tools.rotateCube(Cube, 3, 41 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[42 - 2]);
            Tools.rotateCube(Cube, 3, 42 - 2, "");
            return;
        }
        break;
      case 32:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[55 - 2]);
            Tools.rotateCube(Cube, 3, 55 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[56 - 2]);
            Tools.rotateCube(Cube, 3, 56 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[57 - 2]);
            Tools.rotateCube(Cube, 3, 57 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[58 - 2]);
            Tools.rotateCube(Cube, 3, 58 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[59 - 2]);
            Tools.rotateCube(Cube, 3, 59 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[60 - 2]);
            Tools.rotateCube(Cube, 3, 60 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[49 - 2]);
            Tools.rotateCube(Cube, 3, 49 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[50 - 2]);
            Tools.rotateCube(Cube, 3, 50 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[51 - 2]);
            Tools.rotateCube(Cube, 3, 51 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[52 - 2]);
            Tools.rotateCube(Cube, 3, 52 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[53 - 2]);
            Tools.rotateCube(Cube, 3, 53 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[54 - 2]);
            Tools.rotateCube(Cube, 3, 54 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[67 - 2]);
            Tools.rotateCube(Cube, 3, 67 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[68 - 2]);
            Tools.rotateCube(Cube, 3, 68 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[69 - 2]);
            Tools.rotateCube(Cube, 3, 69 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[70 - 2]);
            Tools.rotateCube(Cube, 3, 70 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[71 - 2]);
            Tools.rotateCube(Cube, 3, 71 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[72 - 2]);
            Tools.rotateCube(Cube, 3, 72 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[61 - 2]);
            Tools.rotateCube(Cube, 3, 61 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[62 - 2]);
            Tools.rotateCube(Cube, 3, 62 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[63 - 2]);
            Tools.rotateCube(Cube, 3, 63 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[64 - 2]);
            Tools.rotateCube(Cube, 3, 64 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[65 - 2]);
            Tools.rotateCube(Cube, 3, 65 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[66 - 2]);
            Tools.rotateCube(Cube, 3, 66 - 2, "");
            return;
        }
        break;
      case 3:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[79 - 2]);
            Tools.rotateCube(Cube, 3, 79 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[80 - 2]);
            Tools.rotateCube(Cube, 3, 80 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[81 - 2]);
            Tools.rotateCube(Cube, 3, 81 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[82 - 2]);
            Tools.rotateCube(Cube, 3, 82 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[83 - 2]);
            Tools.rotateCube(Cube, 3, 83 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[84 - 2]);
            Tools.rotateCube(Cube, 3, 84 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[73 - 2]);
            Tools.rotateCube(Cube, 3, 73 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[74 - 2]);
            Tools.rotateCube(Cube, 3, 74 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[75 - 2]);
            Tools.rotateCube(Cube, 3, 75 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[76 - 2]);
            Tools.rotateCube(Cube, 3, 76 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[77 - 2]);
            Tools.rotateCube(Cube, 3, 77 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[78 - 2]);
            Tools.rotateCube(Cube, 3, 78 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[91 - 2]);
            Tools.rotateCube(Cube, 3, 91 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[92 - 2]);
            Tools.rotateCube(Cube, 3, 92 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[93 - 2]);
            Tools.rotateCube(Cube, 3, 93 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[94 - 2]);
            Tools.rotateCube(Cube, 3, 94 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[95 - 2]);
            Tools.rotateCube(Cube, 3, 95 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[96 - 2]);
            Tools.rotateCube(Cube, 3, 96 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[85 - 2]);
            Tools.rotateCube(Cube, 3, 85 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[86 - 2]);
            Tools.rotateCube(Cube, 3, 86 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[87 - 2]);
            Tools.rotateCube(Cube, 3, 87 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[88 - 2]);
            Tools.rotateCube(Cube, 3, 88 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[89 - 2]);
            Tools.rotateCube(Cube, 3, 89 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[90 - 2]);
            Tools.rotateCube(Cube, 3, 90 - 2, "");
            return;
        }
        break;
      case 1:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[295 - 2]);
            Tools.rotateCube(Cube, 3, 295 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[296 - 2]);
            Tools.rotateCube(Cube, 3, 296 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[297 - 2]);
            Tools.rotateCube(Cube, 3, 297 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[298 - 2]);
            Tools.rotateCube(Cube, 3, 298 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[299 - 2]);
            Tools.rotateCube(Cube, 3, 299 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[300 - 2]);
            Tools.rotateCube(Cube, 3, 300 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[289 - 2]);
            Tools.rotateCube(Cube, 3, 289 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[290 - 2]);
            Tools.rotateCube(Cube, 3, 290 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[291 - 2]);
            Tools.rotateCube(Cube, 3, 291 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[292 - 2]);
            Tools.rotateCube(Cube, 3, 292 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[293 - 2]);
            Tools.rotateCube(Cube, 3, 293 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[294 - 2]);
            Tools.rotateCube(Cube, 3, 294 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[307 - 2]);
            Tools.rotateCube(Cube, 3, 307 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[308 - 2]);
            Tools.rotateCube(Cube, 3, 308 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[309 - 2]);
            Tools.rotateCube(Cube, 3, 309 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[310 - 2]);
            Tools.rotateCube(Cube, 3, 310 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[311 - 2]);
            Tools.rotateCube(Cube, 3, 311 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[312 - 2]);
            Tools.rotateCube(Cube, 3, 312 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[301 - 2]);
            Tools.rotateCube(Cube, 3, 301 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[302 - 2]);
            Tools.rotateCube(Cube, 3, 302 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[303 - 2]);
            Tools.rotateCube(Cube, 3, 303 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[304 - 2]);
            Tools.rotateCube(Cube, 3, 304 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[305 - 2]);
            Tools.rotateCube(Cube, 3, 305 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[306 - 2]);
            Tools.rotateCube(Cube, 3, 306 - 2, "");
            return;
        }
        break;
      case 41:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[319 - 2]);
            Tools.rotateCube(Cube, 3, 319 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[320 - 2]);
            Tools.rotateCube(Cube, 3, 320 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[321 - 2]);
            Tools.rotateCube(Cube, 3, 321 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[322 - 2]);
            Tools.rotateCube(Cube, 3, 322 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[323 - 2]);
            Tools.rotateCube(Cube, 3, 323 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[324 - 2]);
            Tools.rotateCube(Cube, 3, 324 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[313 - 2]);
            Tools.rotateCube(Cube, 3, 313 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[314 - 2]);
            Tools.rotateCube(Cube, 3, 314 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[315 - 2]);
            Tools.rotateCube(Cube, 3, 315 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[316 - 2]);
            Tools.rotateCube(Cube, 3, 316 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[317 - 2]);
            Tools.rotateCube(Cube, 3, 317 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[318 - 2]);
            Tools.rotateCube(Cube, 3, 318 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[331 - 2]);
            Tools.rotateCube(Cube, 3, 331 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[332 - 2]);
            Tools.rotateCube(Cube, 3, 332 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[333 - 2]);
            Tools.rotateCube(Cube, 3, 333 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[334 - 2]);
            Tools.rotateCube(Cube, 3, 334 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[335 - 2]);
            Tools.rotateCube(Cube, 3, 335 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[336 - 2]);
            Tools.rotateCube(Cube, 3, 336 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[325 - 2]);
            Tools.rotateCube(Cube, 3, 325 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[326 - 2]);
            Tools.rotateCube(Cube, 3, 326 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[327 - 2]);
            Tools.rotateCube(Cube, 3, 327 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[328 - 2]);
            Tools.rotateCube(Cube, 3, 328 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[329 - 2]);
            Tools.rotateCube(Cube, 3, 329 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[330 - 2]);
            Tools.rotateCube(Cube, 3, 330 - 2, "");
            return;
        }
        break;
      case 10:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[343 - 2]);
            Tools.rotateCube(Cube, 3, 343 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[344 - 2]);
            Tools.rotateCube(Cube, 3, 344 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[345 - 2]);
            Tools.rotateCube(Cube, 3, 345 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[346 - 2]);
            Tools.rotateCube(Cube, 3, 346 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[347 - 2]);
            Tools.rotateCube(Cube, 3, 347 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[348 - 2]);
            Tools.rotateCube(Cube, 3, 348 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[337 - 2]);
            Tools.rotateCube(Cube, 3, 337 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[338 - 2]);
            Tools.rotateCube(Cube, 3, 338 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[339 - 2]);
            Tools.rotateCube(Cube, 3, 339 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[340 - 2]);
            Tools.rotateCube(Cube, 3, 340 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[341 - 2]);
            Tools.rotateCube(Cube, 3, 341 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[342 - 2]);
            Tools.rotateCube(Cube, 3, 342 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[355 - 2]);
            Tools.rotateCube(Cube, 3, 355 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[356 - 2]);
            Tools.rotateCube(Cube, 3, 356 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[357 - 2]);
            Tools.rotateCube(Cube, 3, 357 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[358 - 2]);
            Tools.rotateCube(Cube, 3, 358 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[359 - 2]);
            Tools.rotateCube(Cube, 3, 359 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[360 - 2]);
            Tools.rotateCube(Cube, 3, 360 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[349 - 2]);
            Tools.rotateCube(Cube, 3, 349 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[350 - 2]);
            Tools.rotateCube(Cube, 3, 350 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[351 - 2]);
            Tools.rotateCube(Cube, 3, 351 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[352 - 2]);
            Tools.rotateCube(Cube, 3, 352 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[353 - 2]);
            Tools.rotateCube(Cube, 3, 353 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[354 - 2]);
            Tools.rotateCube(Cube, 3, 354 - 2, "");
            return;
        }
        break;
      case 37:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[367 - 2]);
            Tools.rotateCube(Cube, 3, 367 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[368 - 2]);
            Tools.rotateCube(Cube, 3, 368 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[369 - 2]);
            Tools.rotateCube(Cube, 3, 369 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[370 - 2]);
            Tools.rotateCube(Cube, 3, 370 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[371 - 2]);
            Tools.rotateCube(Cube, 3, 371 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[372 - 2]);
            Tools.rotateCube(Cube, 3, 372 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[361 - 2]);
            Tools.rotateCube(Cube, 3, 361 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[362 - 2]);
            Tools.rotateCube(Cube, 3, 362 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[363 - 2]);
            Tools.rotateCube(Cube, 3, 363 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[364 - 2]);
            Tools.rotateCube(Cube, 3, 364 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[365 - 2]);
            Tools.rotateCube(Cube, 3, 365 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[366 - 2]);
            Tools.rotateCube(Cube, 3, 366 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[379 - 2]);
            Tools.rotateCube(Cube, 3, 379 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[380 - 2]);
            Tools.rotateCube(Cube, 3, 380 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[381 - 2]);
            Tools.rotateCube(Cube, 3, 381 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[382 - 2]);
            Tools.rotateCube(Cube, 3, 382 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[383 - 2]);
            Tools.rotateCube(Cube, 3, 383 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[384 - 2]);
            Tools.rotateCube(Cube, 3, 384 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[373 - 2]);
            Tools.rotateCube(Cube, 3, 373 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[374 - 2]);
            Tools.rotateCube(Cube, 3, 374 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[375 - 2]);
            Tools.rotateCube(Cube, 3, 375 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[376 - 2]);
            Tools.rotateCube(Cube, 3, 376 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[377 - 2]);
            Tools.rotateCube(Cube, 3, 377 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[378 - 2]);
            Tools.rotateCube(Cube, 3, 378 - 2, "");
            return;
        }
        break;
      case 19:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[199 - 2]);
            Tools.rotateCube(Cube, 3, 199 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[200 - 2]);
            Tools.rotateCube(Cube, 3, 200 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[201 - 2]);
            Tools.rotateCube(Cube, 3, 201 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[202 - 2]);
            Tools.rotateCube(Cube, 3, 202 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[203 - 2]);
            Tools.rotateCube(Cube, 3, 203 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[204 - 2]);
            Tools.rotateCube(Cube, 3, 204 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[193 - 2]);
            Tools.rotateCube(Cube, 3, 193 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[194 - 2]);
            Tools.rotateCube(Cube, 3, 194 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[195 - 2]);
            Tools.rotateCube(Cube, 3, 195 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[196 - 2]);
            Tools.rotateCube(Cube, 3, 196 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[197 - 2]);
            Tools.rotateCube(Cube, 3, 197 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[198 - 2]);
            Tools.rotateCube(Cube, 3, 198 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[211 - 2]);
            Tools.rotateCube(Cube, 3, 211 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[212 - 2]);
            Tools.rotateCube(Cube, 3, 212 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[213 - 2]);
            Tools.rotateCube(Cube, 3, 213 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[214 - 2]);
            Tools.rotateCube(Cube, 3, 214 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[215 - 2]);
            Tools.rotateCube(Cube, 3, 215 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[216 - 2]);
            Tools.rotateCube(Cube, 3, 216 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[205 - 2]);
            Tools.rotateCube(Cube, 3, 205 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[206 - 2]);
            Tools.rotateCube(Cube, 3, 206 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[207 - 2]);
            Tools.rotateCube(Cube, 3, 207 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[208 - 2]);
            Tools.rotateCube(Cube, 3, 208 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[209 - 2]);
            Tools.rotateCube(Cube, 3, 209 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[210 - 2]);
            Tools.rotateCube(Cube, 3, 210 - 2, "");
            return;
        }
        break;
      case 39:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[223 - 2]);
            Tools.rotateCube(Cube, 3, 223 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[224 - 2]);
            Tools.rotateCube(Cube, 3, 224 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[225 - 2]);
            Tools.rotateCube(Cube, 3, 225 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[226 - 2]);
            Tools.rotateCube(Cube, 3, 226 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[227 - 2]);
            Tools.rotateCube(Cube, 3, 227 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[228 - 2]);
            Tools.rotateCube(Cube, 3, 228 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[217 - 2]);
            Tools.rotateCube(Cube, 3, 217 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[218 - 2]);
            Tools.rotateCube(Cube, 3, 218 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[219 - 2]);
            Tools.rotateCube(Cube, 3, 219 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[220 - 2]);
            Tools.rotateCube(Cube, 3, 220 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[221 - 2]);
            Tools.rotateCube(Cube, 3, 221 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[222 - 2]);
            Tools.rotateCube(Cube, 3, 222 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[235 - 2]);
            Tools.rotateCube(Cube, 3, 235 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[236 - 2]);
            Tools.rotateCube(Cube, 3, 236 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[237 - 2]);
            Tools.rotateCube(Cube, 3, 237 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[238 - 2]);
            Tools.rotateCube(Cube, 3, 238 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[239 - 2]);
            Tools.rotateCube(Cube, 3, 239 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[240 - 2]);
            Tools.rotateCube(Cube, 3, 240 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[229 - 2]);
            Tools.rotateCube(Cube, 3, 229 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[230 - 2]);
            Tools.rotateCube(Cube, 3, 230 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[231 - 2]);
            Tools.rotateCube(Cube, 3, 231 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[232 - 2]);
            Tools.rotateCube(Cube, 3, 232 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[233 - 2]);
            Tools.rotateCube(Cube, 3, 233 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[234 - 2]);
            Tools.rotateCube(Cube, 3, 234 - 2, "");
            return;
        }
        break;
      case 28:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[247 - 2]);
            Tools.rotateCube(Cube, 3, 247 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[248 - 2]);
            Tools.rotateCube(Cube, 3, 248 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[249 - 2]);
            Tools.rotateCube(Cube, 3, 249 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[250 - 2]);
            Tools.rotateCube(Cube, 3, 250 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[251 - 2]);
            Tools.rotateCube(Cube, 3, 251 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[252 - 2]);
            Tools.rotateCube(Cube, 3, 252 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[241 - 2]);
            Tools.rotateCube(Cube, 3, 241 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[242 - 2]);
            Tools.rotateCube(Cube, 3, 242 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[243 - 2]);
            Tools.rotateCube(Cube, 3, 243 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[244 - 2]);
            Tools.rotateCube(Cube, 3, 244 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[245 - 2]);
            Tools.rotateCube(Cube, 3, 245 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[246 - 2]);
            Tools.rotateCube(Cube, 3, 246 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[259 - 2]);
            Tools.rotateCube(Cube, 3, 259 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[260 - 2]);
            Tools.rotateCube(Cube, 3, 260 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[261 - 2]);
            Tools.rotateCube(Cube, 3, 261 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[262 - 2]);
            Tools.rotateCube(Cube, 3, 262 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[263 - 2]);
            Tools.rotateCube(Cube, 3, 263 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[264 - 2]);
            Tools.rotateCube(Cube, 3, 264 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[253 - 2]);
            Tools.rotateCube(Cube, 3, 253 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[254 - 2]);
            Tools.rotateCube(Cube, 3, 254 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[255 - 2]);
            Tools.rotateCube(Cube, 3, 255 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[256 - 2]);
            Tools.rotateCube(Cube, 3, 256 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[257 - 2]);
            Tools.rotateCube(Cube, 3, 257 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[258 - 2]);
            Tools.rotateCube(Cube, 3, 258 - 2, "");
            return;
        }
        break;
      case 43:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[271 - 2]);
            Tools.rotateCube(Cube, 3, 271 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[272 - 2]);
            Tools.rotateCube(Cube, 3, 272 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[273 - 2]);
            Tools.rotateCube(Cube, 3, 273 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[274 - 2]);
            Tools.rotateCube(Cube, 3, 274 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[275 - 2]);
            Tools.rotateCube(Cube, 3, 275 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[276 - 2]);
            Tools.rotateCube(Cube, 3, 276 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[265 - 2]);
            Tools.rotateCube(Cube, 3, 265 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[266 - 2]);
            Tools.rotateCube(Cube, 3, 266 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[267 - 2]);
            Tools.rotateCube(Cube, 3, 267 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[268 - 2]);
            Tools.rotateCube(Cube, 3, 268 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[269 - 2]);
            Tools.rotateCube(Cube, 3, 269 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[270 - 2]);
            Tools.rotateCube(Cube, 3, 270 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[283 - 2]);
            Tools.rotateCube(Cube, 3, 283 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[284 - 2]);
            Tools.rotateCube(Cube, 3, 284 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[285 - 2]);
            Tools.rotateCube(Cube, 3, 285 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[286 - 2]);
            Tools.rotateCube(Cube, 3, 286 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[287 - 2]);
            Tools.rotateCube(Cube, 3, 287 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[288 - 2]);
            Tools.rotateCube(Cube, 3, 288 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[277 - 2]);
            Tools.rotateCube(Cube, 3, 277 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[278 - 2]);
            Tools.rotateCube(Cube, 3, 278 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[279 - 2]);
            Tools.rotateCube(Cube, 3, 279 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[280 - 2]);
            Tools.rotateCube(Cube, 3, 280 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[281 - 2]);
            Tools.rotateCube(Cube, 3, 281 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.y2Perm(Constants.F2L_Algs[282 - 2]);
            Tools.rotateCube(Cube, 3, 282 - 2, "");
            return;
        }
        break;
    }
  }

  public static void F2L_OB(FridrichSolver Cube) {
    Cube.Solution += " ";

    switch (ecc1) {
      case 5:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[154 - 2]);
            Tools.rotateCube(Cube, 2, 154 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[155 - 2]);
            Tools.rotateCube(Cube, 2, 155 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[156 - 2]);
            Tools.rotateCube(Cube, 2, 156 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[145 - 2]);
            Tools.rotateCube(Cube, 2, 145 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[146 - 2]);
            Tools.rotateCube(Cube, 2, 146 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[147 - 2]);
            Tools.rotateCube(Cube, 2, 147 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[148 - 2]);
            Tools.rotateCube(Cube, 2, 148 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[149 - 2]);
            Tools.rotateCube(Cube, 2, 149 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[150 - 2]);
            Tools.rotateCube(Cube, 2, 150 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[151 - 2]);
            Tools.rotateCube(Cube, 2, 151 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[152 - 2]);
            Tools.rotateCube(Cube, 2, 152 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[153 - 2]);
            Tools.rotateCube(Cube, 2, 153 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[166 - 2]);
            Tools.rotateCube(Cube, 2, 166 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[167 - 2]);
            Tools.rotateCube(Cube, 2, 167 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[168 - 2]);
            Tools.rotateCube(Cube, 2, 168 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[157 - 2]);
            Tools.rotateCube(Cube, 2, 157 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[158 - 2]);
            Tools.rotateCube(Cube, 2, 158 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[159 - 2]);
            Tools.rotateCube(Cube, 2, 159 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[160 - 2]);
            Tools.rotateCube(Cube, 2, 160 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[161 - 2]);
            Tools.rotateCube(Cube, 2, 161 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[162 - 2]);
            Tools.rotateCube(Cube, 2, 162 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[163 - 2]);
            Tools.rotateCube(Cube, 2, 163 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[164 - 2]);
            Tools.rotateCube(Cube, 2, 164 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[165 - 2]);
            Tools.rotateCube(Cube, 2, 165 - 2, "");
            return;
        }
        break;
      case 12:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[178 - 2]);
            Tools.rotateCube(Cube, 2, 178 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[179 - 2]);
            Tools.rotateCube(Cube, 2, 179 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[180 - 2]);
            Tools.rotateCube(Cube, 2, 180 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[169 - 2]);
            Tools.rotateCube(Cube, 2, 169 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[170 - 2]);
            Tools.rotateCube(Cube, 2, 170 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[171 - 2]);
            Tools.rotateCube(Cube, 2, 171 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[172 - 2]);
            Tools.rotateCube(Cube, 2, 172 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[173 - 2]);
            Tools.rotateCube(Cube, 2, 173 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[174 - 2]);
            Tools.rotateCube(Cube, 2, 174 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[175 - 2]);
            Tools.rotateCube(Cube, 2, 175 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[176 - 2]);
            Tools.rotateCube(Cube, 2, 176 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[177 - 2]);
            Tools.rotateCube(Cube, 2, 177 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[190 - 2]);
            Tools.rotateCube(Cube, 2, 190 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[191 - 2]);
            Tools.rotateCube(Cube, 2, 191 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[192 - 2]);
            Tools.rotateCube(Cube, 2, 192 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[181 - 2]);
            Tools.rotateCube(Cube, 2, 181 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[182 - 2]);
            Tools.rotateCube(Cube, 2, 182 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[183 - 2]);
            Tools.rotateCube(Cube, 2, 183 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[184 - 2]);
            Tools.rotateCube(Cube, 2, 184 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[185 - 2]);
            Tools.rotateCube(Cube, 2, 185 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[186 - 2]);
            Tools.rotateCube(Cube, 2, 186 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[187 - 2]);
            Tools.rotateCube(Cube, 2, 187 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[188 - 2]);
            Tools.rotateCube(Cube, 2, 188 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[189 - 2]);
            Tools.rotateCube(Cube, 2, 189 - 2, "");
            return;
        }
        break;
      case 14:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[10 - 2]);
            Tools.rotateCube(Cube, 2, 10 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[11 - 2]);
            Tools.rotateCube(Cube, 2, 11 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[12 - 2]);
            Tools.rotateCube(Cube, 2, 12 - 2, "");
            return;
          case 17:// null point
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[2 - 2]);
            Tools.rotateCube(Cube, 2, 2 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[3 - 2]);
            Tools.rotateCube(Cube, 2, 3 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[4 - 2]);
            Tools.rotateCube(Cube, 2, 4 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[5 - 2]);
            Tools.rotateCube(Cube, 2, 5 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[6 - 2]);
            Tools.rotateCube(Cube, 2, 6 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[7 - 2]);
            Tools.rotateCube(Cube, 2, 7 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[8 - 2]);
            Tools.rotateCube(Cube, 2, 8 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[9 - 2]);
            Tools.rotateCube(Cube, 2, 9 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[22 - 2]);
            Tools.rotateCube(Cube, 2, 22 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[23 - 2]);
            Tools.rotateCube(Cube, 2, 23 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[24 - 2]);
            Tools.rotateCube(Cube, 2, 24 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[13 - 2]);
            Tools.rotateCube(Cube, 2, 13 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[14 - 2]);
            Tools.rotateCube(Cube, 2, 14 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[15 - 2]);
            Tools.rotateCube(Cube, 2, 15 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[16 - 2]);
            Tools.rotateCube(Cube, 2, 16 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[17 - 2]);
            Tools.rotateCube(Cube, 2, 17 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[18 - 2]);
            Tools.rotateCube(Cube, 2, 18 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[19 - 2]);
            Tools.rotateCube(Cube, 2, 19 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[20 - 2]);
            Tools.rotateCube(Cube, 2, 20 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[21 - 2]);
            Tools.rotateCube(Cube, 2, 21 - 2, "");
            return;
        }
        break;
      case 21:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[34 - 2]);
            Tools.rotateCube(Cube, 2, 34 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[35 - 2]);
            Tools.rotateCube(Cube, 2, 35 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[36 - 2]);
            Tools.rotateCube(Cube, 2, 36 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[25 - 2]);
            Tools.rotateCube(Cube, 2, 25 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[26 - 2]);
            Tools.rotateCube(Cube, 2, 26 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[27 - 2]);
            Tools.rotateCube(Cube, 2, 27 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[28 - 2]);
            Tools.rotateCube(Cube, 2, 28 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[29 - 2]);
            Tools.rotateCube(Cube, 2, 29 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[30 - 2]);
            Tools.rotateCube(Cube, 2, 30 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[31 - 2]);
            Tools.rotateCube(Cube, 2, 31 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[32 - 2]);
            Tools.rotateCube(Cube, 2, 32 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[33 - 2]);
            Tools.rotateCube(Cube, 2, 33 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[46 - 2]);
            Tools.rotateCube(Cube, 2, 46 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[47 - 2]);
            Tools.rotateCube(Cube, 2, 47 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[48 - 2]);
            Tools.rotateCube(Cube, 2, 48 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[37 - 2]);
            Tools.rotateCube(Cube, 2, 37 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[38 - 2]);
            Tools.rotateCube(Cube, 2, 38 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[39 - 2]);
            Tools.rotateCube(Cube, 2, 39 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[40 - 2]);
            Tools.rotateCube(Cube, 2, 40 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[41 - 2]);
            Tools.rotateCube(Cube, 2, 41 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[42 - 2]);
            Tools.rotateCube(Cube, 2, 42 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[43 - 2]);
            Tools.rotateCube(Cube, 2, 43 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[44 - 2]);
            Tools.rotateCube(Cube, 2, 44 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[45 - 2]);
            Tools.rotateCube(Cube, 2, 45 - 2, "");
            return;
        }
        break;
      case 23:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[58 - 2]);
            Tools.rotateCube(Cube, 2, 58 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[59 - 2]);
            Tools.rotateCube(Cube, 2, 59 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[60 - 2]);
            Tools.rotateCube(Cube, 2, 60 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[49 - 2]);
            Tools.rotateCube(Cube, 2, 49 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[50 - 2]);
            Tools.rotateCube(Cube, 2, 50 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[51 - 2]);
            Tools.rotateCube(Cube, 2, 51 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[52 - 2]);
            Tools.rotateCube(Cube, 2, 52 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[53 - 2]);
            Tools.rotateCube(Cube, 2, 53 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[54 - 2]);
            Tools.rotateCube(Cube, 2, 54 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[55 - 2]);
            Tools.rotateCube(Cube, 2, 55 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[56 - 2]);
            Tools.rotateCube(Cube, 2, 56 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[57 - 2]);
            Tools.rotateCube(Cube, 2, 57 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[70 - 2]);
            Tools.rotateCube(Cube, 2, 70 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[71 - 2]);
            Tools.rotateCube(Cube, 2, 71 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[72 - 2]);
            Tools.rotateCube(Cube, 2, 72 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[61 - 2]);
            Tools.rotateCube(Cube, 2, 61 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[62 - 2]);
            Tools.rotateCube(Cube, 2, 62 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[63 - 2]);
            Tools.rotateCube(Cube, 2, 63 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[64 - 2]);
            Tools.rotateCube(Cube, 2, 64 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[65 - 2]);
            Tools.rotateCube(Cube, 2, 65 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[66 - 2]);
            Tools.rotateCube(Cube, 2, 66 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[67 - 2]);
            Tools.rotateCube(Cube, 2, 67 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[68 - 2]);
            Tools.rotateCube(Cube, 2, 68 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[69 - 2]);
            Tools.rotateCube(Cube, 2, 69 - 2, "");
            return;
        }
        break;
      case 30:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[82 - 2]);
            Tools.rotateCube(Cube, 2, 82 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[83 - 2]);
            Tools.rotateCube(Cube, 2, 83 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[84 - 2]);
            Tools.rotateCube(Cube, 2, 84 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[73 - 2]);
            Tools.rotateCube(Cube, 2, 73 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[74 - 2]);
            Tools.rotateCube(Cube, 2, 74 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[75 - 2]);
            Tools.rotateCube(Cube, 2, 75 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[76 - 2]);
            Tools.rotateCube(Cube, 2, 76 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[77 - 2]);
            Tools.rotateCube(Cube, 2, 77 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[78 - 2]);
            Tools.rotateCube(Cube, 2, 78 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[79 - 2]);
            Tools.rotateCube(Cube, 2, 79 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[80 - 2]);
            Tools.rotateCube(Cube, 2, 80 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[81 - 2]);
            Tools.rotateCube(Cube, 2, 81 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[94 - 2]);
            Tools.rotateCube(Cube, 2, 94 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[95 - 2]);
            Tools.rotateCube(Cube, 2, 95 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[96 - 2]);
            Tools.rotateCube(Cube, 2, 96 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[85 - 2]);
            Tools.rotateCube(Cube, 2, 85 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[86 - 2]);
            Tools.rotateCube(Cube, 2, 86 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[87 - 2]);
            Tools.rotateCube(Cube, 2, 87 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[88 - 2]);
            Tools.rotateCube(Cube, 2, 88 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[89 - 2]);
            Tools.rotateCube(Cube, 2, 89 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[90 - 2]);
            Tools.rotateCube(Cube, 2, 90 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[91 - 2]);
            Tools.rotateCube(Cube, 2, 91 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[92 - 2]);
            Tools.rotateCube(Cube, 2, 92 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[93 - 2]);
            Tools.rotateCube(Cube, 2, 93 - 2, "");
            return;
        }
        break;
      case 32:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[106 - 2]);
            Tools.rotateCube(Cube, 2, 106 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[107 - 2]);
            Tools.rotateCube(Cube, 2, 107 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[108 - 2]);
            Tools.rotateCube(Cube, 2, 108 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[97 - 2]);
            Tools.rotateCube(Cube, 2, 97 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[98 - 2]);
            Tools.rotateCube(Cube, 2, 98 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[99 - 2]);
            Tools.rotateCube(Cube, 2, 99 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[100 - 2]);
            Tools.rotateCube(Cube, 2, 100 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[101 - 2]);
            Tools.rotateCube(Cube, 2, 101 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[102 - 2]);
            Tools.rotateCube(Cube, 2, 102 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[103 - 2]);
            Tools.rotateCube(Cube, 2, 103 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[104 - 2]);
            Tools.rotateCube(Cube, 2, 104 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[105 - 2]);
            Tools.rotateCube(Cube, 2, 105 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[118 - 2]);
            Tools.rotateCube(Cube, 2, 118 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[119 - 2]);
            Tools.rotateCube(Cube, 2, 119 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[120 - 2]);
            Tools.rotateCube(Cube, 2, 120 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[109 - 2]);
            Tools.rotateCube(Cube, 2, 109 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[110 - 2]);
            Tools.rotateCube(Cube, 2, 110 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[111 - 2]);
            Tools.rotateCube(Cube, 2, 111 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[112 - 2]);
            Tools.rotateCube(Cube, 2, 112 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[113 - 2]);
            Tools.rotateCube(Cube, 2, 113 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[114 - 2]);
            Tools.rotateCube(Cube, 2, 114 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[115 - 2]);
            Tools.rotateCube(Cube, 2, 115 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[116 - 2]);
            Tools.rotateCube(Cube, 2, 116 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[117 - 2]);
            Tools.rotateCube(Cube, 2, 117 - 2, "");
            return;
        }
        break;
      case 3:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[130 - 2]);
            Tools.rotateCube(Cube, 2, 130 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[131 - 2]);
            Tools.rotateCube(Cube, 2, 131 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[132 - 2]);
            Tools.rotateCube(Cube, 2, 132 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[121 - 2]);
            Tools.rotateCube(Cube, 2, 121 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[122 - 2]);
            Tools.rotateCube(Cube, 2, 122 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[123 - 2]);
            Tools.rotateCube(Cube, 2, 123 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[124 - 2]);
            Tools.rotateCube(Cube, 2, 124 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[125 - 2]);
            Tools.rotateCube(Cube, 2, 125 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[126 - 2]);
            Tools.rotateCube(Cube, 2, 126 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[127 - 2]);
            Tools.rotateCube(Cube, 2, 127 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[128 - 2]);
            Tools.rotateCube(Cube, 2, 128 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[129 - 2]);
            Tools.rotateCube(Cube, 2, 129 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[142 - 2]);
            Tools.rotateCube(Cube, 2, 142 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[143 - 2]);
            Tools.rotateCube(Cube, 2, 143 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[144 - 2]);
            Tools.rotateCube(Cube, 2, 144 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[133 - 2]);
            Tools.rotateCube(Cube, 2, 133 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[134 - 2]);
            Tools.rotateCube(Cube, 2, 134 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[135 - 2]);
            Tools.rotateCube(Cube, 2, 135 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[136 - 2]);
            Tools.rotateCube(Cube, 2, 136 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[137 - 2]);
            Tools.rotateCube(Cube, 2, 137 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[138 - 2]);
            Tools.rotateCube(Cube, 2, 138 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[139 - 2]);
            Tools.rotateCube(Cube, 2, 139 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[140 - 2]);
            Tools.rotateCube(Cube, 2, 140 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[141 - 2]);
            Tools.rotateCube(Cube, 2, 141 - 2, "");
            return;
        }
        break;
      case 1:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[346 - 2]);
            Tools.rotateCube(Cube, 2, 346 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[347 - 2]);
            Tools.rotateCube(Cube, 2, 347 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[348 - 2]);
            Tools.rotateCube(Cube, 2, 348 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[337 - 2]);
            Tools.rotateCube(Cube, 2, 337 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[338 - 2]);
            Tools.rotateCube(Cube, 2, 338 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[339 - 2]);
            Tools.rotateCube(Cube, 2, 339 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[340 - 2]);
            Tools.rotateCube(Cube, 2, 340 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[341 - 2]);
            Tools.rotateCube(Cube, 2, 341 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[342 - 2]);
            Tools.rotateCube(Cube, 2, 342 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[343 - 2]);
            Tools.rotateCube(Cube, 2, 343 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[344 - 2]);
            Tools.rotateCube(Cube, 2, 344 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[345 - 2]);
            Tools.rotateCube(Cube, 2, 345 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[358 - 2]);
            Tools.rotateCube(Cube, 2, 358 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[359 - 2]);
            Tools.rotateCube(Cube, 2, 359 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[360 - 2]);
            Tools.rotateCube(Cube, 2, 360 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[349 - 2]);
            Tools.rotateCube(Cube, 2, 349 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[350 - 2]);
            Tools.rotateCube(Cube, 2, 350 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[351 - 2]);
            Tools.rotateCube(Cube, 2, 351 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[352 - 2]);
            Tools.rotateCube(Cube, 2, 352 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[353 - 2]);
            Tools.rotateCube(Cube, 2, 353 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[354 - 2]);
            Tools.rotateCube(Cube, 2, 354 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[355 - 2]);
            Tools.rotateCube(Cube, 2, 355 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[356 - 2]);
            Tools.rotateCube(Cube, 2, 356 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[357 - 2]);
            Tools.rotateCube(Cube, 2, 357 - 2, "");
            return;
        }
        break;
      case 41:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[370 - 2]);
            Tools.rotateCube(Cube, 2, 370 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[371 - 2]);
            Tools.rotateCube(Cube, 2, 371 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[372 - 2]);
            Tools.rotateCube(Cube, 2, 372 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[361 - 2]);
            Tools.rotateCube(Cube, 2, 361 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[362 - 2]);
            Tools.rotateCube(Cube, 2, 362 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[363 - 2]);
            Tools.rotateCube(Cube, 2, 363 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[364 - 2]);
            Tools.rotateCube(Cube, 2, 364 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[365 - 2]);
            Tools.rotateCube(Cube, 2, 365 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[366 - 2]);
            Tools.rotateCube(Cube, 2, 366 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[367 - 2]);
            Tools.rotateCube(Cube, 2, 367 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[368 - 2]);
            Tools.rotateCube(Cube, 2, 368 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[369 - 2]);
            Tools.rotateCube(Cube, 2, 369 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[382 - 2]);
            Tools.rotateCube(Cube, 2, 382 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[383 - 2]);
            Tools.rotateCube(Cube, 2, 383 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[384 - 2]);
            Tools.rotateCube(Cube, 2, 384 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[373 - 2]);
            Tools.rotateCube(Cube, 2, 373 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[374 - 2]);
            Tools.rotateCube(Cube, 2, 374 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[375 - 2]);
            Tools.rotateCube(Cube, 2, 375 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[376 - 2]);
            Tools.rotateCube(Cube, 2, 376 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[377 - 2]);
            Tools.rotateCube(Cube, 2, 377 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[378 - 2]);
            Tools.rotateCube(Cube, 2, 378 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[379 - 2]);
            Tools.rotateCube(Cube, 2, 379 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[380 - 2]);
            Tools.rotateCube(Cube, 2, 380 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[381 - 2]);
            Tools.rotateCube(Cube, 2, 381 - 2, "");
            return;
        }
        break;
      case 10:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[202 - 2]);
            Tools.rotateCube(Cube, 2, 202 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[203 - 2]);
            Tools.rotateCube(Cube, 2, 203 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[204 - 2]);
            Tools.rotateCube(Cube, 2, 204 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[193 - 2]);
            Tools.rotateCube(Cube, 2, 193 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[194 - 2]);
            Tools.rotateCube(Cube, 2, 194 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[195 - 2]);
            Tools.rotateCube(Cube, 2, 195 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[196 - 2]);
            Tools.rotateCube(Cube, 2, 196 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[197 - 2]);
            Tools.rotateCube(Cube, 2, 197 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[198 - 2]);
            Tools.rotateCube(Cube, 2, 198 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[199 - 2]);
            Tools.rotateCube(Cube, 2, 199 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[200 - 2]);
            Tools.rotateCube(Cube, 2, 200 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[201 - 2]);
            Tools.rotateCube(Cube, 2, 201 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[214 - 2]);
            Tools.rotateCube(Cube, 2, 214 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[215 - 2]);
            Tools.rotateCube(Cube, 2, 215 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[216 - 2]);
            Tools.rotateCube(Cube, 2, 216 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[205 - 2]);
            Tools.rotateCube(Cube, 2, 205 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[206 - 2]);
            Tools.rotateCube(Cube, 2, 206 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[207 - 2]);
            Tools.rotateCube(Cube, 2, 207 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[208 - 2]);
            Tools.rotateCube(Cube, 2, 208 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[209 - 2]);
            Tools.rotateCube(Cube, 2, 209 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[210 - 2]);
            Tools.rotateCube(Cube, 2, 210 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[211 - 2]);
            Tools.rotateCube(Cube, 2, 211 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[212 - 2]);
            Tools.rotateCube(Cube, 2, 212 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[213 - 2]);
            Tools.rotateCube(Cube, 2, 213 - 2, "");
            return;
        }
        break;
      case 37:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[226 - 2]);
            Tools.rotateCube(Cube, 2, 226 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[227 - 2]);
            Tools.rotateCube(Cube, 2, 227 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[228 - 2]);
            Tools.rotateCube(Cube, 2, 228 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[217 - 2]);
            Tools.rotateCube(Cube, 2, 217 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[218 - 2]);
            Tools.rotateCube(Cube, 2, 218 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[219 - 2]);
            Tools.rotateCube(Cube, 2, 219 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[220 - 2]);
            Tools.rotateCube(Cube, 2, 220 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[221 - 2]);
            Tools.rotateCube(Cube, 2, 221 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[222 - 2]);
            Tools.rotateCube(Cube, 2, 222 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[223 - 2]);
            Tools.rotateCube(Cube, 2, 223 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[224 - 2]);
            Tools.rotateCube(Cube, 2, 224 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[225 - 2]);
            Tools.rotateCube(Cube, 2, 225 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[238 - 2]);
            Tools.rotateCube(Cube, 2, 238 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[239 - 2]);
            Tools.rotateCube(Cube, 2, 239 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[240 - 2]);
            Tools.rotateCube(Cube, 2, 240 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[229 - 2]);
            Tools.rotateCube(Cube, 2, 229 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[230 - 2]);
            Tools.rotateCube(Cube, 2, 230 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[231 - 2]);
            Tools.rotateCube(Cube, 2, 231 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[232 - 2]);
            Tools.rotateCube(Cube, 2, 232 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[233 - 2]);
            Tools.rotateCube(Cube, 2, 233 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[234 - 2]);
            Tools.rotateCube(Cube, 2, 234 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[235 - 2]);
            Tools.rotateCube(Cube, 2, 235 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[236 - 2]);
            Tools.rotateCube(Cube, 2, 236 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[237 - 2]);
            Tools.rotateCube(Cube, 2, 237 - 2, "");
            return;
        }
        break;
      case 19:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[250 - 2]);
            Tools.rotateCube(Cube, 2, 250 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[251 - 2]);
            Tools.rotateCube(Cube, 2, 251 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[252 - 2]);
            Tools.rotateCube(Cube, 2, 252 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[241 - 2]);
            Tools.rotateCube(Cube, 2, 241 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[242 - 2]);
            Tools.rotateCube(Cube, 2, 242 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[243 - 2]);
            Tools.rotateCube(Cube, 2, 243 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[244 - 2]);
            Tools.rotateCube(Cube, 2, 244 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[245 - 2]);
            Tools.rotateCube(Cube, 2, 245 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[246 - 2]);
            Tools.rotateCube(Cube, 2, 246 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[247 - 2]);
            Tools.rotateCube(Cube, 2, 247 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[248 - 2]);
            Tools.rotateCube(Cube, 2, 248 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[249 - 2]);
            Tools.rotateCube(Cube, 2, 249 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[262 - 2]);
            Tools.rotateCube(Cube, 2, 262 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[263 - 2]);
            Tools.rotateCube(Cube, 2, 263 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[264 - 2]);
            Tools.rotateCube(Cube, 2, 264 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[253 - 2]);
            Tools.rotateCube(Cube, 2, 253 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[254 - 2]);
            Tools.rotateCube(Cube, 2, 254 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[255 - 2]);
            Tools.rotateCube(Cube, 2, 255 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[256 - 2]);
            Tools.rotateCube(Cube, 2, 256 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[257 - 2]);
            Tools.rotateCube(Cube, 2, 257 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[258 - 2]);
            Tools.rotateCube(Cube, 2, 258 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[259 - 2]);
            Tools.rotateCube(Cube, 2, 259 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[260 - 2]);
            Tools.rotateCube(Cube, 2, 260 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[261 - 2]);
            Tools.rotateCube(Cube, 2, 261 - 2, "");
            return;
        }
        break;
      case 39:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[274 - 2]);
            Tools.rotateCube(Cube, 2, 274 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[275 - 2]);
            Tools.rotateCube(Cube, 2, 275 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[276 - 2]);
            Tools.rotateCube(Cube, 2, 276 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[265 - 2]);
            Tools.rotateCube(Cube, 2, 265 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[266 - 2]);
            Tools.rotateCube(Cube, 2, 266 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[267 - 2]);
            Tools.rotateCube(Cube, 2, 267 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[268 - 2]);
            Tools.rotateCube(Cube, 2, 268 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[269 - 2]);
            Tools.rotateCube(Cube, 2, 269 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[270 - 2]);
            Tools.rotateCube(Cube, 2, 270 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[271 - 2]);
            Tools.rotateCube(Cube, 2, 271 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[272 - 2]);
            Tools.rotateCube(Cube, 2, 272 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[273 - 2]);
            Tools.rotateCube(Cube, 2, 273 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[286 - 2]);
            Tools.rotateCube(Cube, 2, 286 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[287 - 2]);
            Tools.rotateCube(Cube, 2, 287 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[288 - 2]);
            Tools.rotateCube(Cube, 2, 288 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[277 - 2]);
            Tools.rotateCube(Cube, 2, 277 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[278 - 2]);
            Tools.rotateCube(Cube, 2, 278 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[279 - 2]);
            Tools.rotateCube(Cube, 2, 279 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[280 - 2]);
            Tools.rotateCube(Cube, 2, 280 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[281 - 2]);
            Tools.rotateCube(Cube, 2, 281 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[282 - 2]);
            Tools.rotateCube(Cube, 2, 282 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[283 - 2]);
            Tools.rotateCube(Cube, 2, 283 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[284 - 2]);
            Tools.rotateCube(Cube, 2, 284 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[285 - 2]);
            Tools.rotateCube(Cube, 2, 285 - 2, "");
            return;
        }
        break;
      case 28:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[298 - 2]);
            Tools.rotateCube(Cube, 2, 298 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[299 - 2]);
            Tools.rotateCube(Cube, 2, 299 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[300 - 2]);
            Tools.rotateCube(Cube, 2, 300 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[289 - 2]);
            Tools.rotateCube(Cube, 2, 289 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[290 - 2]);
            Tools.rotateCube(Cube, 2, 290 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[291 - 2]);
            Tools.rotateCube(Cube, 2, 291 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[292 - 2]);
            Tools.rotateCube(Cube, 2, 292 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[293 - 2]);
            Tools.rotateCube(Cube, 2, 293 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[294 - 2]);
            Tools.rotateCube(Cube, 2, 294 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[295 - 2]);
            Tools.rotateCube(Cube, 2, 295 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[296 - 2]);
            Tools.rotateCube(Cube, 2, 296 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[297 - 2]);
            Tools.rotateCube(Cube, 2, 297 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[310 - 2]);
            Tools.rotateCube(Cube, 2, 310 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[311 - 2]);
            Tools.rotateCube(Cube, 2, 311 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[312 - 2]);
            Tools.rotateCube(Cube, 2, 312 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[301 - 2]);
            Tools.rotateCube(Cube, 2, 301 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[302 - 2]);
            Tools.rotateCube(Cube, 2, 302 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[303 - 2]);
            Tools.rotateCube(Cube, 2, 303 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[304 - 2]);
            Tools.rotateCube(Cube, 2, 304 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[305 - 2]);
            Tools.rotateCube(Cube, 2, 305 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[306 - 2]);
            Tools.rotateCube(Cube, 2, 306 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[307 - 2]);
            Tools.rotateCube(Cube, 2, 307 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[308 - 2]);
            Tools.rotateCube(Cube, 2, 308 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[309 - 2]);
            Tools.rotateCube(Cube, 2, 309 - 2, "");
            return;
        }
        break;
      case 43:
        switch (cc1) {
          case 8:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[322 - 2]);
            Tools.rotateCube(Cube, 2, 322 - 2, "");
            return;
          case 15:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[323 - 2]);
            Tools.rotateCube(Cube, 2, 323 - 2, "");
            return;
          case 53:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[324 - 2]);
            Tools.rotateCube(Cube, 2, 324 - 2, "");
            return;
          case 17:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[313 - 2]);
            Tools.rotateCube(Cube, 2, 313 - 2, "");
            return;
          case 24:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[314 - 2]);
            Tools.rotateCube(Cube, 2, 314 - 2, "");
            return;
          case 51:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[315 - 2]);
            Tools.rotateCube(Cube, 2, 315 - 2, "");
            return;
          case 26:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[316 - 2]);
            Tools.rotateCube(Cube, 2, 316 - 2, "");
            return;
          case 33:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[317 - 2]);
            Tools.rotateCube(Cube, 2, 317 - 2, "");
            return;
          case 45:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[318 - 2]);
            Tools.rotateCube(Cube, 2, 318 - 2, "");
            return;
          case 35:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[319 - 2]);
            Tools.rotateCube(Cube, 2, 319 - 2, "");
            return;
          case 6:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[320 - 2]);
            Tools.rotateCube(Cube, 2, 320 - 2, "");
            return;
          case 47:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[321 - 2]);
            Tools.rotateCube(Cube, 2, 321 - 2, "");
            return;
          case 2:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[334 - 2]);
            Tools.rotateCube(Cube, 2, 334 - 2, "");
            return;
          case 38:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[335 - 2]);
            Tools.rotateCube(Cube, 2, 335 - 2, "");
            return;
          case 9:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[336 - 2]);
            Tools.rotateCube(Cube, 2, 336 - 2, "");
            return;
          case 11:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[325 - 2]);
            Tools.rotateCube(Cube, 2, 325 - 2, "");
            return;
          case 36:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[326 - 2]);
            Tools.rotateCube(Cube, 2, 326 - 2, "");
            return;
          case 18:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[327 - 2]);
            Tools.rotateCube(Cube, 2, 327 - 2, "");
            return;
          case 20:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[328 - 2]);
            Tools.rotateCube(Cube, 2, 328 - 2, "");
            return;
          case 42:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[329 - 2]);
            Tools.rotateCube(Cube, 2, 329 - 2, "");
            return;
          case 27:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[330 - 2]);
            Tools.rotateCube(Cube, 2, 330 - 2, "");
            return;
          case 29:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[331 - 2]);
            Tools.rotateCube(Cube, 2, 331 - 2, "");
            return;
          case 44:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[332 - 2]);
            Tools.rotateCube(Cube, 2, 332 - 2, "");
            return;
          case 0:
            Cube.Solution += Tools.yPerm(Constants.F2L_Algs[333 - 2]);
            Tools.rotateCube(Cube, 2, 333 - 2, "");
            return;
        }
        break;
    }
  }

  private static void AssignCornor(int p) {
    switch (p) {
      case 0:
        cc1 = 29;
        cc2 = 44;
        break;
      case 2:
        cc1 = 9;
        cc2 = 38;
        break;
      case 6:
        cc1 = 35;
        cc2 = 47;
        break;
      case 8:
        cc1 = 15;
        cc2 = 53;
        break;
      case 9:
        cc1 = 2;
        cc2 = 38;
        break;
      case 11:
        cc1 = 36;
        cc2 = 18;
        break;
      case 15:
        cc1 = 8;
        cc2 = 53;
        break;
      case 17:
        cc1 = 24;
        cc2 = 51;
        break;
      case 18:
        cc1 = 36;
        cc2 = 11;
        break;
      case 20:
        cc1 = 42;
        cc2 = 27;
        break;
      case 24:
        cc1 = 17;
        cc2 = 51;
        break;
      case 26:
        cc1 = 33;
        cc2 = 45;
        break;
      case 27:
        cc1 = 20;
        cc2 = 42;
        break;
      case 29:
        cc1 = 0;
        cc2 = 44;
        break;
      case 33:
        cc1 = 26;
        cc2 = 45;
        break;
      case 35:
        cc1 = 6;
        cc2 = 47;
        break;
      case 36:
        cc1 = 18;
        cc2 = 11;
        break;
      case 38:
        cc1 = 2;
        cc2 = 9;
        break;
      case 42:
        cc1 = 20;
        cc2 = 27;
        break;
      case 44:
        cc1 = 29;
        cc2 = 0;
        break;
      case 45:
        cc1 = 26;
        cc2 = 33;
        break;
      case 47:
        cc1 = 35;
        cc2 = 6;
        break;
      case 51:
        cc1 = 24;
        cc2 = 17;
        break;
      case 53:
        cc1 = 8;
        cc2 = 15;
        break;
    }
  }
}
