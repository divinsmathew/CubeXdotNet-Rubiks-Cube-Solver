
public class PLL {
  public static void Solve(FridrichSolver scrambledCube) {
    int i, j, c;
    int[][] yellowPositions = new int[4][3];

    try {
      for (i = j = c = 0; i < 12; i++) { // green
        if (scrambledCube.Cube[Constants.YellowEdges[i]] == 'g') {
          yellowPositions[0][j++] = Constants.YellowEdges[i];
          c++;
        }
      }

      for (i = j = 0; i < 12; i++) { // orange
        if (scrambledCube.Cube[Constants.YellowEdges[i]] == 'o') {
          yellowPositions[1][j++] = Constants.YellowEdges[i];
          c++;
        }
      }

      for (i = j = 0; i < 12; i++) { // blue
        if (scrambledCube.Cube[Constants.YellowEdges[i]] == 'b') {
          yellowPositions[2][j++] = Constants.YellowEdges[i];
          c++;
        }
      }

      for (i = j = 0; i < 12; i++) { // red
        if (scrambledCube.Cube[Constants.YellowEdges[i]] == 'r') {
          yellowPositions[3][j++] = Constants.YellowEdges[i];
          c++;
        }
      }
    } catch (IndexOutOfBoundsException e) { // error @ PLL
      scrambledCube.ErrorCode = -7;
      return;
    }

    if (c != 12) {
      scrambledCube.ErrorCode = -8;
      return;
    } // error @ PLL

    if (!(scrambledCube.Cube[0] == 'g' && scrambledCube.Cube[1] == 'g' && scrambledCube.Cube[2] == 'g'
        && scrambledCube.Cube[9] == 'o' && scrambledCube.Cube[10] == 'o' && scrambledCube.Cube[11] == 'o'
        && scrambledCube.Cube[18] == 'b' && scrambledCube.Cube[19] == 'b'
        && scrambledCube.Cube[20] == 'b'
        && scrambledCube.Cube[27] == 'r' && scrambledCube.Cube[28] == 'r'
        && scrambledCube.Cube[29] == 'y'))
      movePLL(scrambledCube, yellowPositions);

    switch (scrambledCube.Cube[1]) {
      case 'r':
        scrambledCube.setSolution(scrambledCube.getSolution() + " U");
        Tools.rotateCube(scrambledCube, 0, 0, "");
        break;
      case 'o':
        scrambledCube.setSolution(scrambledCube.getSolution() + " U'");
        Tools.rotateCube(scrambledCube, 0, 1, "");
        break;
      case 'b':
        scrambledCube.setSolution(scrambledCube.getSolution() + " U2");
        Tools.rotateCube(scrambledCube, 0, 2, "");
        break;
    }
  }

  private static void movePLL(FridrichSolver scrambledCube, int[][] yellowPositions) {
    int i, j, k, c, m, n, ac;

    for (i = 0; i < 88; i++) {
      for (j = 0, c = 0; j < 4; j++) {
        for (k = 0; k < 4; k++) {
          for (ac = 0, m = 0; m < 3; m++) {
            for (n = 0; n < 3; n++) {
              if (Constants.PLL_Capsules[i][j][m] == yellowPositions[k][n]) {
                ac++;
              }
            }
          }
          if (ac == 3) {
            c++;
          }
        }
        if (c == 4) {
          switch ((i + 1) % 4) {
            case 1:
              scrambledCube.setSolution(scrambledCube.getSolution() + " ");
              scrambledCube.setSolution(scrambledCube.getSolution() + Constants.PLL_Algs[i / 4]);
              Tools.rotateCube(scrambledCube, 11, i / 4, "");
              return;
            case 2:
              scrambledCube.setSolution(scrambledCube.getSolution() + " U ");
              scrambledCube.setSolution(scrambledCube.getSolution() + Constants.PLL_Algs[i / 4]);
              Tools.rotateCube(scrambledCube, 12, i / 4, "");
              return;
            case 3:
              scrambledCube.setSolution(scrambledCube.getSolution() + " U2 ");
              scrambledCube.setSolution(scrambledCube.getSolution() + Constants.PLL_Algs[i / 4]);
              Tools.rotateCube(scrambledCube, 13, i / 4, "");
              return;
            case 0:
              scrambledCube.setSolution(scrambledCube.getSolution() + " U' ");
              scrambledCube.setSolution(scrambledCube.getSolution() + Constants.PLL_Algs[i / 4]);
              Tools.rotateCube(scrambledCube, 10, i / 4, "");
              return;
          }
        }
      }
    }
  }
}
