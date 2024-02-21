public class Constants {
  public static String[] CrossAlgs = { "F R' F'", "U' R2", "U F R' F'", "R2", "B' R B", "U R2", "U' F R' F'", "U2 R2",
      "R'", "D' F D", "D B' D'", "R", "D2 L' D2", "D B D'", "D' F' D", "F2 R' F2", "F' R'", "F2 U' R2", "R D' F D",
      "B R", "B2 U R2", "L' D' F' D", "L2 U2 R2",
      "U' R' F R", "F2", "R' F R", "U F2", "U R' F R", "U2 F2", "L F' L'", "U' F2", "D R' D'", "F", "R2 F R2", "D R D'",
      "D' L' D", "D2 B D2", "F'", "D' L D", "D R D' F", "R F", "R2 U F2", "B D R D'", "B2 U2 F2", "L' F'", "L2 U' F2",
      "U' R B' R'", "U2 B2", "R B' R'", "U' B2", "U R B' R'", "B2", "L' B L", "U B2", "D' R' D", "D2 F D2", "B'",
      "D' R D", "D L' D'", "B", "D2 F' D2", "D L D'", "F D' R' D", "F2 U2 B2", "R' B'", "R2 U' B2", "B D' R D", "L B",
      "L2 U B2",
      "F' L F", "U L2", "U F' L F", "U2 L2", "B L' B'", "U' L2", "U' F' L F", "L2", "F2 L F2", "D F D'", "D' B' D",
      "D2 R D2", "L'", "D' B D", "D F' D'", "L", "F L", "F2 U L2", "R D' F D", "R2 U2 L2", "B' L'", "B2 U' L2",
      "L' D F' D'" };

  public static String[] F2L_Algs = { "R U' R' U' R U R' U2 R U' R'", "R U R' U2 R U' R' U R U R'",
      "R' U2 R2 U R' U2 R U R'", "R' U R U R U R' U' R U R' U' R U R'", "R' U R2 U2 R' U R U R'",
      "B' U' B U2 R U2 R' U R U R'", "L U2 L' R U R' U' R U R' U' R U R'",
      "L U L' R U2 R' U R U R'", "L' U2 L R U2 R' U R U R'", "L' U2 L R U' R' U2 R U' R'", "F U2 F' R U2 R' U R U R'",
      "U R U R' U2 R U R'", "U' R U' R' U2 R U' R'", "R U R' U' R U R' U' R U R'", "R U2 R' U R U R'",
      "R U' R' U2 R U' R'",
      "U R U R' U' R U R' U' R U R'", "U R U2 R' U R U R'", "U R U' R' U2 R U' R'", "U2 R U R' U' R U R' U' R U R'",
      "R U R' U2 R U R'", "U2 R U' R' U2 R U' R'", "U' R U R' U' R U R' U' R U R'", "R U R' U2 R U2 R' U F' U' F",
      "R U' R' U F' U' F U' F' U' F", "R U R' U' R U' R' U2 F' U' F", "B U B' U' R U R' U  F' U' F",
      "R' U2 R U R U' R' U' F' U' F", "R' U2 R U' R U' R' U F' U F", "L U2 L' U2 R U' R' U' F' U' F",
      "L U2 L' R U' R' U F' U F", "B' U2 B R U' R' U F' U F",
      "F U F' R U' R' U' F' U' F", "F U F' U2 R U' R' U F' U F", "L' U' L R U' R' U F' U F", "U F' U' F U' R U R'",
      "U2 R U' R' U' F' U' F", "R U' R' U F' U F", "U2 F' U' F U' R U R'", "U' R U' R' U' F' U' F",
      "U R U' R' U F' U F",
      "U' F' U' F U' R U R'", "R U R' F R' F' R", "U2 R U' R' U F' U F", "F' U' F U' R U R'", "U R U' R' U' F' U' F",
      "U' R U' R' U F' U F", "B U B' U' F' U F U R U' R'", "B U B' R U' R' U R U' R'", "R' U R2 U2 R' F' U2 F",
      "R' F' U F2 R F'", "B U B' R U2 R' U' R U R'", "B U B' U' R U' R' U R U R'", "R' U2 R B' U2 B R U' R' U2 F' U' F",
      "R' U2 R B' U2 B U' R U2 R' U F' U' F", "R' U' R F' L U2 L' F", "L' U' L R' U R F R' F' R",
      "B U2 B' L' R U' R' L",
      "R' U2 R F U F2 U2 F", "R' U R F R' F' R", "R' U R U F' U F U' F' U' F", "U B U' B' U2 R U R' U R U' R'",
      "B U2 B' F' U F U2 R U R'", "R' U R U' R U' R' U2 F' U' F", "R' U R U2 R U2 R' U F' U' F",
      "U B U2 B' F' U F U2 R U R'",
      "U R' U R U' R U' R' U2 F' U' F", "U R' U R U2 R U2 R' U F' U' F", "U2 B U2 B' F' U F U2 R U R'",
      "U2 R' U R U' R U' R' U2 F' U' F", "U2 R' U R U2 R U2 R' U F' U' F", "R' U R U2 F' U F U R U' R'",
      "R' U R U' R U' R' U R U' R'",
      "R' U R U' R U R' U' R U R'", "R' U R2 U2 R' U2 R U' R'", "R' U R U' R U R' U R U' R'", "R' U R2 U R' U R U R'",
      "L U L' R' U R U2 R U' R' U R U R'", "L U L' R2 F R2 F'", "B U B' U'  L F' U2 F L'", "L2 U R' U' L2 U2 R2 U' R'",
      "R' U R2 L' U' R' L", "B U' B' F U2 F2 U F", "R' U' R2 U R'", "R' U R F' U F U2 R U R'", "U' R2 F R2 F'",
      "U R' U' R2 U R'", "U R' U R F' U F U2 R U R'", "R2 F R2 F'", "U2 R' U' R2 U R'", "U2 R' U R F' U F U2 R U R'",
      "U R2 F R2 F'", "U' R' U' R2 U R'", "U' R' U R F' U F U2 R U R'", "U2 R2 F R2 F'",
      "L U2 L' R' U' R' U' R' U R U R", "L U2 L' R U' R' U R U' R'", "L U2 L' R U R' U' R U R'",
      "R' U' R U L B R U2 R' B' L'", "L U L' R' U' R2 U2 R'",
      "B' U B2 F' U F B'", "R L U2 R' L'", "L U2 L' R U2 R' U' R U R'", "L U L' R U' R' U R U R'",
      "L' U L2 U' L' R U' R'", "L U' L2 R U' R' L", "B' U'  B F U2 F2 U F", "U' L U L' R U R'", "U B' U' B F' U' F",
      "U2 L U' L' U F' U2 F U' R U R'",
      "L U L' R U R'", "U2 B' U' B F' U' F", "U' L U' L' U F' U2 F U' R U R'", "U L U L' R U R'", "U' B' U' B F' U' F",
      "L U' L' U F' U2 F U' R U R'", "U2 L U L' R U R'", "B' U' B F' U' F", "U L U' L' U F' U2 F U' R U R'",
      "L U' L' U R U' R' U' F' U F", "R U2 R' L U' L' F R' F' R", "L U' L' R U R' U' F R' F' R",
      "L U' L' B U B' F' U' F", "B' U B U' R' U' R2  U2 R'", "L U2 L' B F' U F B'", "L U L' R U2 R' U F' U' F",
      "L U2 L' U2 F2 U2 F U F' U F2",
      "L U2 L' R U' R' U2 F' U' F", "L' U L U' L U L' F' U2 F", "F U F' R B' U R' B", "L U' L' U F U F2 U2 F",
      "U' B' U' B U R U R'", "L U L' F'  U2 F", "U2 R B' U B R'", "B' U' B U R U R'", "U L U L' F' U2 F",
      "U' R B' U R' B",
      "U B' U' B U R U R'", "U2 L U L' F' U2 F", "R B' U B R'", "U2 B' U' B U R U R'", "U' L U L'  F'  U2 F",
      "U R B' U B R'", "F U2 F2 U F U R U' R'", "F U' F2 U2 F R U2 R'", "L' U' L R U2 R'  F' U2 F",
      "R'  U R U L' U' L U F' U' F",
      "F U2 F' R' U' R2 U2 R'", "L' U2 L B F'  U F B'", "L U2 L2 U' L U F' U' F", "F U F' B' R U2 R' B",
      "L' U L2 U L' F' U F", "L' U2 L F'  U F", "L' U' L U F'  U F U' F' U' F", "L' U' L F' U2 F U F' U' F",
      "U2 F U F' U R U R'",
      "L' U' L U F' U' F", "F U' F' R U2 R' U' R U R'", "U' F U F'  U R U R'", "U L' U' L U F' U' F",
      "U F U' F' R U2 R' U' R U R'", "F U F' U R U R'", "U2 L' U' L U F' U' F", "U2 F  U' F' R U2 R' U' R U R'",
      "U F U F' U R U R'",
      "U' L' U' L U F' U' F", "U' F U' F' R U2 R' U' R U R'", "L' U L F' U F U R U' R'", "R U R' F2 R' F2 R",
      "F' U' F U2 F2 R' F2 R", "R' U R U F U F2 U' F", "B U2  B' F2 R' F2 R", "R' U2 R F2 R' F2 R",
      "L U2 L' F U F2 U' F", "L U L' U2 F2 R' F2 R",
      "B' U' B F2 R' F2 R", "F U2 F' R U2 R' U F' U' F", "L' U' L F' U F U2 R U R'", "L' U' L U2 R2 U2 R' U' R U' R2",
      "U' L' U L R U R'", "F U F2 U' F", "U F2 R' F2 R", "L' U L R U R'", "U F U F2 U' F", "U2 F2 R' F2 R",
      "U L' U L R U R'",
      "U2 F U F2 U' F", "U' F2 R' F2 R", "U2 L' U L R U R'", "U' F U F2 U' F", "F2 R' F2 R", "U R U' R' U' F' U F",
      "F' U' F U F' U' F", "F' U F2 R' F' R", "B U B' F' U' F", "R' U2 R U' F' U' F", "U' F' B U F B'",
      "U' L U L' U F' U' F",
      "L U' L' U2 F' U' F", "U2 L F' U2 F L'", "U2 F U' F' U F' U2 F", "U L' U' L F' U' F", "U F U F2 U2 F",
      "F R' F' R", "U F' U F U' F' U' F", "F' U2 F U F' U' F", "U2 F' U' F U2 F' U F", "U F' U' F", "F' U2 F U' F' U F",
      "U' F' U2 F U2 F' U F", "U' F' U' F U' F' U' F", "F' U' F U' F' U F", "U' R U' R' U2 F' U' F",
      "U2 R U2 R' U F' U' F", "U F2 U2 F U F' U F2", "U2 F' U F U R U' R'", "U' R U' R' U R U' R'",
      "U' R U R' U' R U R'", "U R' U' R U2 R U R'",
      "U2 R' U2 R2 U' R'", "R' U R U R U R'", "B' U' B U' R U R'", "U L U' L' R U2 R'", "L U2 L' R U R'",
      "U' L' U' L R U R'", "R L' U' R' L", "U2 L' U L U' R U R'", "U F' U2 F U' R U R'", "F' U F U2 R U R'",
      "U2 R2 U2 R' U' R U' R2",
      "R U R' U R U R'", "R U2 R' U2 R U' R'", "U' R U R' U R U' R'", "U2 R U R'", "U R U R' U2 R U' R'",
      "U' R U2 R' U R U' R'", "U2 R U' R' U R U R'", "R U' R'", "U' R U2 R' U' R U R'", "U2 R U' R' U' F' U F",
      "U F' U' F U F' U' F",
      "U R U R' U2 F' U F", "U B U B' F' U' F", "U R' U2 R U' F' U' F", "F' B U F B'", "L U L' U F' U' F",
      "U L U' L' U2 F' U' F", "U' L F' U2 F L'", "U' F U' F' U F' U2 F", "U2 L' U' L F' U' F", "U2 F U F2 U2 F",
      "R U' R' U2 F' U' F",
      "U' R U2 R' U F' U' F", "U2 F2 U2 F U F' U F2", "F' U F", "U2 F' U F U' F' U' F", "U F' U2 F U F' U' F",
      "U' F' U' F U2 F' U F", "U2 F' U' F", "U F' U2 F U' F' U F", "F' U2 F U2 F' U F", "F' U' F U' F' U' F",
      "U F' U' F U' F' U F",
      "U' F' U F U R U' R'", "R U' R' U R U' R'", "R U R' U' R U R'", "U2 R' U' R U2 R U R'", "U' R' U2 R2 U' R'",
      "U R' U R U R U R'", "U B' U' B U' R U R'", "U2 B' R U2 R' B", "U L U2 L' R U R'", "L' U' L R U R'",
      "U L' R U' R' L",
      "F U2 F' U R U R'", "U' R U' R' U R U R'", "R' F R F'", "R U2 R' U' R U R'", "U2 F' U2 F U' R U R'",
      "U F' U F U2 R U R'", "U' R2 U2 R' U' R U' R2", "U R U R' U R U R'", "U R U2 R' U2 R U' R'", "R U R' U R U' R'",
      "U' R U R'",
      "U2 R U R' U2 R U' R'", "R U2 R' U R U' R'", "U' R U' R' U' F' U F", "U2 F' U' F U F' U' F",
      "U2 R U R' U2 F' U F", "U2 B U B' F' U' F", "U2 R' U2 R U' F' U' F", "U F' B U F B'", "U L U L' U F' U' F",
      "U2 L U' L' U2 F' U' F", "L F' U2 F L'",
      "F U' F' U F' U2 F", "U' L' U' L F' U' F", "U' F U F2 U2 F", "U F' U2 F U2 F' U F", "U F' U' F U' F' U' F",
      "U2 F' U' F U' F' U F", "U R U' R' U2 F' U' F", "R U2 R' U F' U' F", "U' F2 U2 F U F' U F2", "F' U2 F",
      "U' F' U F U' F' U' F",
      "U2 F' U2 F U F' U' F", "F' U' F U2 F' U F", "U' F' U' F", "U2 F' U2 F U' F' U F", "F' U F U R U' R'",
      "U R U' R' U R U' R'", "U R U R' U' R U R'", "U' R' U' R U2 R U R'", "R' U' R2 U2 R'", "U2 R' U R U R U R'",
      "U2 B' U' B U' R U R'",
      "U' B' R U2 R' B", "U2 L U2 L' R U R'", "U L' U' L R U R'", "U2 L' R U' R' L", "U F U2 F' U R U R'", "R U R'",
      "U' R U R' U2 R U' R'", "U R U2 R' U R U' R'", "R U' R' U R U R'", "U' R U2 R'", "U R U2 R' U' R U R'",
      "U' F' U2 F U' R U R'", "U2 F' U F U2 R U R'", "R2 U2 R' U' R U' R2", "U2 R U R' U R U R'",
      "U2 R U2 R' U2 R U' R'", "U R U R' U R U' R'", "R U' R' U' F' U F", "U' F' U' F U F' U' F", "U' R U2 R' F' U2 F",
      "U' B U B' F' U' F",
      "U' R' U2 R U' F' U' F", "U2 F' B U F B'", "U2 L U L' U F' U' F", "U' L U' L' U2 F' U' F", "U L F' U2 F L'",
      "U F U' F' U F' U2 F", "L' U' L F' U' F", "F U F2 U2 F", "U F' U' F U2 F' U F", "F' U' F", "U' F' U2 F U' F' U F",
      "U2 F' U2 F U2 F' U F", "U2 F' U' F U' F' U' F", "U' F' U' F2 R' F' R", "U2 R U' R' U2 F' U' F",
      "U R U2 R' U F' U' F", "F2 U2 F U F' U F2", "U F' U2 F", "F' U F U' F' U' F", "U' F' U2 F U F' U' F",
      "U F' U F U R U' R'",
      "U2 R U' R' U R U' R'", "U2 R U R' U' R U R'", "R' U' R U2 R U R'", "U R' U' R2 U2 R'", "U' R' U R U R U R'",
      "U' B' U' B U' R U R'", "B' R U2 R' B", "U' L U2 L' R U R'", "U2 L' U' L R U R'", "U' L' R U' R' L",
      "U2 F U2 F' U R U R'",
      "U' R U R' U R U R'", "U' R U2 R' U2 R U' R'", "U2 R U R' U R U' R'", "U R U R'", "R U R' U2 R U' R'",
      "U2 R U2 R' U R U' R'", "U R U' R' U R U R'", "R U2 R'", "U2 R U2 R' U' R U R'", "F' U2 F U' R U R'",
      "U' F' U F U2 R U R'", "U R2 U2 R' U' R U' R2" };

  public static String[] OLL_Algs = { "R U R' U R U2 R'", "R U2 R' U' R U' R'", "R U2 R2 U' R2 U' R2 U2 R",
      "F R U R' U' R U R' U' R U R' U' F'", "L F R' F' L' F R F'", "F' L F R' F' L' F R", "R2 D R' U2 R D' R' U2 R'",
      "",
      "R U R' U' R' L F R F' L'", "L F R' F' L' R U R U' R'", "B U L U' L' B'", "B' U' R' U R B",
      "R U B' U' R' U R B R'", "R' U' F U R U' R' F' R", "R U R' U R U' R' U' R' F R F'",
      "L' U' L U' L' U L U L F' L' F",
      "L F2 R' F' R F' L'", "L' B2 R B R' B L", "F R U R' U' R U R' U' F'", "F' L' U' L U L' U' L U F",
      "R' F' L F' L' F L F' L' F2 R", "L F R' F R F' R' F R F2 L'", "R' F R' F' R2 U2 B' R B R'",
      "R' F R2 B' R2 F' R2 B R'",
      "R U R' U' R' F R2 U R' U' F'", "R U R' U R' F R F' R U2 R'", "R U2 R2 F R F' R U2 R'", "F R U' R' U' R U R' F'",
      "R2 U R' B' R U' R2 U R B R'", "R U R' U' R U' R' F' U' F R U R'", "R U R' U R U2 R' F R U R' U' F'",
      "R' F R F' R' F R F' R U R' U' R U R'", "L F R' F R F2 L'", "L' B' R B' R' B2 L", "L F R' F R' D R D' R F2 L'",
      "F R U R' U' F' U F R U R' U' F'", "R B' R' U' R U B U' R'", "R' F R U R' U' F' U R",
      "R' U' R' F R F' U R", "R U R2 U' R' F R U R U' F'", "F R U R' U' F'", "R U R' U' R' F R F'",
      "R' U2 R2 U R' U R U2 B' R' B", "R' U' R U' R' U F' U F R", "F R U R' U' R F' L F R' F' L'",
      "B U L U' L' U L U' L' B'", "L F L' R U R' U' L F' L'", "R' F' R L' U' L U R' F R", "F U R U' R2 F' R U R U' R'",
      "R' F R U R' F' R F U' F'", "R U2 R2 F R F' U2 R' F R F'", "F R U R' U' F' B U L U' L' B'",
      "B U L U' L' B' U' F R U R' U' F'", "B U L U' L' B' U F R U R' U' F'", "F R U R' U F' U2 F' L F L'",
      "R L' B R B R' B' L R2 F R F'", "R U R' U R' F R F' U2 R' F R F'", "R L' B R B R' B' R2 L2 F R F' L'" };

  public static String[] PLL_Algs = { "R2 U R U R' U' R' U' R' U R'", "R U' R U R U R U' R' U' R2",
      "U2 R U R' U R' U' R' U R U' R' U' R2 U R", "R2 L2 D R2 L2 U2 R2 L2 D R2 L2", "R' F R' B2 R F' R' B2 R2",
      "R B' R F2 R' B R F2 R2",
      "R B' R' F R B R' F' R B R' F R B' R' F'", "", "L U2 L' U2 L F' L' U' L U L F L2 U",
      "R' U2 R U2 R' F R U R' U' R' F' R2 U'", "R U R' U' R' F R2 U' R' U' R U R' F'",
      "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R",
      "R' U L' U2 R U' R' U2 R L", "R U R' F' R U R' U' R' F R2 U' R'", "F' U F' U' R' F' R2 U' R' U R' F R F",
      "F R U' R' U' R U R' F' R U R' U' R' F R F'", "L U' R U2 L' U R' L U' R U2 L' U R'",
      "R' U L' U2 R U' L R' U L' U2 R U' L",
      "R2 D B' U B' U' B D' R2 F' U F", "R2 D' F U' F U F' D R2 B U' B'", "R U R' F2 D' L U' L' U L' D F2",
      "R' U' R B2 D L' U L U' L D' B2" };

  public static int[][] OLL_Capsules = { { 39, 43, 37, 44, 41, 2, 11, 20 }, { 43, 41, 39, 38, 37, 11, 20, 29 },
      { 41, 37, 43, 36, 39, 20, 29, 2 }, { 37, 39, 41, 42, 43, 29, 2, 11 }, { 39, 36, 43, 37, 41, 0, 9, 27 },
      { 43, 42, 41, 39, 37, 9, 18, 0 },
      { 41, 44, 37, 43, 39, 18, 27, 9 }, { 37, 38, 39, 41, 43, 27, 0, 18 }, { 39, 43, 37, 41, 2, 18, 27, 29 },
      { 43, 41, 39, 37, 11, 27, 0, 2 }, { 41, 37, 43, 39, 20, 0, 9, 11 }, { 37, 39, 41, 43, 29, 9, 18, 20 },
      { 39, 43, 37, 41, 0, 2, 18, 20 },
      { 43, 41, 39, 37, 9, 11, 27, 29 }, { 41, 37, 43, 39, 18, 20, 0, 2 }, { 37, 39, 41, 43, 27, 29, 9, 11 },
      { 39, 36, 43, 37, 41, 38, 0, 20 }, { 43, 42, 41, 39, 37, 36, 9, 29 }, { 41, 44, 37, 43, 39, 42, 18, 2 },
      { 37, 38, 39, 41, 43, 44, 27, 11 },
      { 39, 36, 43, 37, 44, 41, 2, 27 }, { 43, 42, 41, 39, 38, 37, 11, 0 }, { 41, 44, 37, 43, 36, 39, 20, 9 },
      { 37, 38, 39, 41, 42, 43, 29, 18 }, { 42, 39, 36, 43, 37, 41, 0, 2 }, { 44, 43, 42, 41, 39, 37, 9, 11 },
      { 38, 41, 44, 43, 37, 39, 18, 20 },
      { 36, 37, 38, 39, 41, 43, 27, 29 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
      { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 42, 36, 43, 37, 44, 38, 1, 19 },
      { 44, 42, 41, 39, 38, 36, 10, 28 }, { 38, 44, 37, 43, 36, 42, 19, 1 }, { 36, 38, 39, 41, 42, 44, 28, 10 },
      { 42, 36, 43, 44, 38, 39, 1, 10 },
      { 44, 42, 43, 41, 38, 36, 10, 19 }, { 38, 41, 44, 37, 36, 42, 19, 28 }, { 36, 37, 38, 39, 42, 44, 28, 1 },
      { 36, 37, 41, 38, 27, 28, 29, 19 }, { 42, 39, 37, 36, 0, 1, 2, 28 }, { 44, 43, 39, 42, 9, 10, 11, 1 },
      { 38, 41, 43, 44, 18, 19, 20, 10 },
      { 42, 43, 44, 41, 9, 10, 11, 19 }, { 44, 41, 38, 37, 18, 19, 20, 28 }, { 36, 37, 38, 39, 27, 28, 29, 1 },
      { 36, 39, 42, 43, 0, 1, 2, 10 }, { 36, 37, 38, 41, 0, 28, 19, 20 }, { 42, 39, 36, 37, 9, 1, 28, 29 },
      { 44, 43, 42, 39, 18, 10, 2, 1 },
      { 38, 41, 44, 43, 27, 19, 11, 10 }, { 39, 36, 37, 38, 0, 1, 28, 20 }, { 43, 42, 39, 36, 9, 10, 1, 29 },
      { 41, 43, 44, 42, 18, 19, 10, 2 }, { 37, 38, 41, 44, 27, 28, 19, 11 }, { 36, 43, 39, 44, 10, 9, 1, 20 },
      { 42, 43, 41, 38, 10, 18, 19, 29 },
      { 44, 41, 37, 36, 19, 27, 28, 2 }, { 38, 37, 39, 42, 28, 0, 1, 11 }, { 42, 39, 37, 38, 1, 18, 28, 29 },
      { 44, 43, 39, 36, 10, 27, 1, 2 }, { 41, 38, 43, 42, 19, 0, 10, 11 }, { 36, 37, 41, 44, 28, 9, 19, 20 },
      { 39, 36, 37, 0, 1, 9, 28, 27 },
      { 43, 42, 39, 9, 10, 18, 0, 1 }, { 41, 44, 43, 18, 19, 27, 9, 10 }, { 37, 38, 41, 27, 28, 0, 18, 19 },
      { 41, 37, 38, 28, 29, 19, 20, 11 }, { 39, 36, 37, 1, 2, 28, 29, 20 }, { 43, 42, 39, 10, 11, 29, 2, 1 },
      { 41, 43, 44, 2, 19, 20, 10, 11 },
      { 39, 43, 1, 2, 10, 18, 27, 29 }, { 43, 41, 10, 11, 19, 27, 0, 2 }, { 41, 37, 19, 20, 28, 0, 9, 11 },
      { 37, 39, 28, 29, 1, 9, 18, 20 }, { 39, 37, 11, 9, 0, 1, 28, 20 }, { 43, 39, 18, 20, 9, 10, 1, 29 },
      { 41, 43, 27, 29, 18, 19, 10, 2 },
      { 37, 41, 0, 2, 27, 28, 19, 11 }, { 39, 43, 27, 29, 1, 9, 10, 11 }, { 43, 41, 0, 2, 10, 18, 19, 20 },
      { 41, 37, 9, 11, 19, 27, 28, 29 }, { 37, 39, 18, 20, 28, 0, 1, 2 }, { 39, 37, 27, 28, 29, 1, 9, 11 },
      { 43, 39, 0, 1, 2, 10, 18, 20 },
      { 41, 43, 9, 10, 11, 19, 27, 29 }, { 37, 41, 18, 19, 20, 28, 0, 2 }, { 39, 37, 27, 28, 29, 1, 2, 18 },
      { 43, 39, 0, 1, 2, 10, 11, 27 }, { 41, 43, 9, 10, 11, 19, 20, 0 }, { 37, 41, 28, 29, 9, 18, 19, 20 },
      { 39, 43, 0, 1, 20, 9, 10, 11 },
      { 43, 41, 9, 10, 29, 18, 19, 20 }, { 41, 37, 18, 19, 2, 27, 28, 29 }, { 37, 39, 27, 28, 11, 0, 1, 2 },
      { 39, 43, 38, 27, 18, 10, 0, 1 }, { 43, 41, 36, 0, 27, 19, 9, 10 }, { 41, 37, 42, 9, 0, 28, 18, 19 },
      { 37, 39, 44, 18, 9, 1, 27, 28 },
      { 36, 43, 41, 29, 2, 10, 19, 20 }, { 42, 41, 37, 2, 11, 19, 28, 29 }, { 44, 37, 39, 11, 20, 28, 1, 2 },
      { 38, 39, 43, 20, 29, 1, 10, 11 }, { 42, 37, 41, 38, 0, 11, 19, 28 }, { 44, 39, 37, 36, 9, 20, 28, 1 },
      { 38, 43, 39, 42, 18, 29, 1, 10 },
      { 36, 41, 43, 44, 27, 2, 10, 19 }, { 42, 39, 43, 38, 0, 1, 10, 11 }, { 44, 43, 41, 36, 9, 10, 19, 20 },
      { 38, 41, 37, 42, 18, 19, 28, 29 }, { 36, 37, 39, 44, 27, 28, 1, 2 }, { 42, 36, 37, 41, 28, 29, 9, 19 },
      { 44, 42, 39, 37, 18, 28, 1, 2 },
      { 38, 44, 43, 39, 27, 1, 10, 11 }, { 36, 38, 41, 43, 0, 10, 19, 20 }, { 39, 36, 43, 38, 0, 1, 10, 20 },
      { 43, 42, 41, 36, 9, 10, 19, 29 }, { 41, 44, 37, 42, 18, 19, 28, 2 }, { 37, 38, 39, 44, 27, 28, 1, 11 },
      { 39, 43, 44, 38, 18, 20, 10, 1 },
      { 43, 41, 38, 36, 10, 19, 27, 29 }, { 41, 37, 36, 42, 19, 28, 0, 2 }, { 37, 39, 42, 44, 28, 1, 9, 11 },
      { 39, 36, 43, 38, 1, 10, 27, 29 }, { 43, 42, 41, 36, 10, 19, 0, 2 }, { 41, 44, 37, 42, 19, 28, 9, 11, },
      { 37, 38, 39, 44, 28, 1, 18, 20 },
      { 39, 43, 44, 1, 2, 10, 11, 20 }, { 43, 41, 38, 10, 11, 19, 20, 29 }, { 41, 37, 36, 19, 20, 28, 29, 2 },
      { 37, 39, 42, 28, 29, 1, 2, 11 }, { 42, 43, 41, 0, 9, 10, 18, 19 }, { 44, 41, 37, 9, 18, 19, 27, 28 },
      { 38, 37, 39, 18, 27, 28, 0, 1 },
      { 39, 36, 43, 27, 0, 1, 9, 10 }, { 39, 36, 43, 29, 1, 2, 10, 20 }, { 42, 43, 41, 10, 11, 19, 29, 2 },
      { 44, 41, 37, 11, 19, 20, 28, 2 }, { 38, 37, 39, 20, 28, 29, 1, 11 }, { 36, 37, 41, 0, 9, 19, 27, 28 },
      { 42, 39, 37, 9, 18, 28, 1, 0 },
      { 43, 44, 39, 18, 27, 1, 10, 9 }, { 38, 41, 43, 27, 0, 10, 18, 19 }, { 36, 37, 43, 44, 1, 2, 19, 27 },
      { 42, 39, 41, 38, 10, 11, 28, 0 }, { 44, 43, 37, 36, 19, 20, 1, 9 }, { 38, 41, 39, 42, 28, 29, 10, 18 },
      { 42, 43, 37, 38, 29, 1, 18, 19 },
      { 44, 41, 39, 36, 2, 10, 27, 28 }, { 38, 37, 43, 42, 11, 19, 0, 1 }, { 36, 39, 41, 44, 20, 28, 9, 10 },
      { 42, 39, 44, 41, 9, 10, 11, 28 }, { 44, 43, 38, 37, 18, 19, 20, 1 }, { 38, 41, 36, 39, 27, 28, 29, 10 },
      { 36, 37, 42, 43, 0, 1, 2, 19 },
      { 44, 43, 37, 38, 1, 27, 11, 19 }, { 41, 38, 39, 36, 10, 0, 20, 28 }, { 37, 36, 43, 42, 19, 9, 29, 1 },
      { 39, 42, 44, 41, 28, 18, 2, 10 }, { 43, 37, 36, 38, 19, 1, 27, 29 }, { 41, 39, 42, 36, 10, 28, 0, 2 },
      { 37, 43, 42, 44, 1, 19, 9, 11 },
      { 39, 41, 44, 38, 28, 10, 18, 20 }, { 43, 37, 36, 38, 0, 1, 19, 20 }, { 41, 39, 42, 36, 9, 10, 28, 29 },
      { 37, 43, 44, 42, 18, 19, 1, 2 }, { 39, 41, 38, 44, 27, 28, 10, 11 }, { 39, 41, 27, 28, 29, 9, 10, 11 },
      { 43, 37, 0, 1, 2, 18, 19, 20 },
      { 41, 39, 9, 10, 11, 27, 28, 29 }, { 37, 43, 18, 19, 20, 0, 1, 2 }, { 39, 41, 20, 28, 0, 9, 10, 11 },
      { 29, 1, 9, 43, 37, 18, 19, 20 }, { 41, 39, 2, 18, 10, 27, 28, 29 }, { 37, 43, 27, 11, 19, 0, 1, 2 },
      { 43, 37, 27, 29, 19, 1, 9, 11 },
      { 41, 39, 0, 2, 28, 10, 18, 20 }, { 37, 43, 9, 11, 1, 19, 27, 29 }, { 39, 41, 18, 20, 10, 28, 0, 2 },
      { 43, 37, 27, 29, 1, 2, 18, 19 }, { 41, 39, 0, 2, 10, 11, 27, 28 }, { 37, 43, 9, 11, 19, 20, 0, 1 },
      { 39, 41, 18, 20, 28, 29, 9, 10 },
      { 36, 43, 37, 0, 1, 9, 19, 27 }, { 42, 41, 39, 9, 10, 18, 28, 0 }, { 44, 37, 43, 18, 19, 27, 1, 9 },
      { 38, 39, 41, 27, 28, 0, 10, 18 }, { 42, 43, 37, 1, 2, 11, 19, 29 }, { 44, 41, 39, 10, 11, 20, 28, 2 },
      { 38, 37, 43, 19, 20, 29, 1, 11 },
      { 36, 39, 41, 28, 29, 2, 10, 20 }, { 44, 43, 37, 1, 2, 19, 20, 11 }, { 38, 41, 39, 10, 11, 28, 29, 20 },
      { 36, 37, 43, 19, 20, 2, 1, 29 }, { 42, 39, 41, 28, 29, 10, 11, 2 }, { 43, 37, 38, 1, 0, 18, 19, 27 },
      { 41, 39, 36, 9, 10, 27, 28, 0 },
      { 43, 37, 42, 19, 18, 0, 1, 9 }, { 39, 41, 44, 27, 28, 9, 10, 18 }, { 27, 28, 29, 19, 1, 9, 10, 11 },
      { 0, 1, 2, 10, 28, 18, 19, 20 }, { 10, 9, 11, 27, 28, 29, 19, 1 }, { 18, 19, 20, 0, 1, 2, 28, 10 },
      { 27, 28, 29, 1, 2, 10, 18, 19 },
      { 0, 1, 2, 10, 11, 19, 27, 28 }, { 9, 10, 11, 19, 20, 28, 0, 1 }, { 18, 19, 20, 28, 29, 1, 9, 10 },
      { 38, 1, 10, 11, 19, 20, 28, 29 }, { 36, 10, 19, 20, 28, 29, 1, 2 }, { 42, 19, 28, 29, 1, 2, 10, 11 },
      { 44, 28, 1, 2, 10, 11, 19, 20 },
      { 36, 0, 1, 9, 10, 19, 27, 28 }, { 42, 9, 10, 18, 19, 28, 0, 1 }, { 44, 18, 19, 27, 28, 1, 9, 10 },
      { 38, 27, 28, 0, 1, 10, 18, 19 }, { 18, 19, 20, 44, 38, 28, 10, 1 }, { 38, 36, 10, 27, 28, 29, 1, 19 },
      { 36, 42, 0, 1, 2, 10, 28, 19 },
      { 42, 44, 28, 19, 1, 10, 9, 11 }, { 42, 36, 28, 29, 9, 10, 19, 1 }, { 44, 42, 1, 2, 18, 19, 28, 10 },
      { 38, 44, 10, 11, 27, 28, 19, 1 }, { 36, 38, 19, 20, 0, 1, 10, 28 }, { 42, 38, 28, 29, 1, 10, 18, 19 },
      { 44, 36, 1, 2, 10, 19, 27, 28 },
      { 38, 42, 10, 11, 19, 28, 1, 0 }, { 36, 44, 19, 20, 28, 1, 9, 10 }, { 42, 36, 44, 38, 1, 10, 19, 28 },
      { 42, 36, 44, 38, 1, 10, 19, 28 }, { 42, 36, 44, 38, 1, 10, 19, 28 }, { 42, 36, 44, 38, 1, 10, 19, 28 } };

  public static int[][][] PLL_Capsules = { { { 0, 2, 10 }, { 9, 11, 28 }, { 18, 19, 20 }, { 1, 27, 29 } },
      { { 9, 11, 19 }, { 1, 18, 20, }, { 27, 28, 29 }, { 0, 2, 10 } },
      { { 18, 20, 28 }, { 10, 27, 29 }, { 0, 1, 2 }, { 9, 11, 19 } },
      { { 27, 29, 1 }, { 19, 0, 2 }, { 9, 10, 11 }, { 18, 20, 28 } },
      { { 28, 0, 2 }, { 1, 9, 11 }, { 18, 19, 20 }, { 27, 29, 10 } },
      { { 1, 9, 11 }, { 10, 18, 20 }, { 27, 28, 29 }, { 0, 2, 19 } },
      { { 10, 18, 20 }, { 19, 27, 29 }, { 0, 1, 2 }, { 9, 11, 28 } },
      { { 19, 27, 29 }, { 28, 0, 2 }, { 9, 10, 11 }, { 18, 20, 1 } },
      { { 0, 2, 10 }, { 1, 9, 11 }, { 18, 20, 28 }, { 19, 27, 29 } },
      { { 9, 11, 19 }, { 10, 18, 20 }, { 29, 27, 1 }, { 28, 0, 2 } },
      { { 18, 20, 28 }, { 19, 27, 29 }, { 0, 2, 10 }, { 1, 9, 11 } },
      { { 27, 29, 1 }, { 28, 0, 2 }, { 9, 11, 19 }, { 10, 18, 20 } },
      { { 28, 9, 11 }, { 1, 18, 20 }, { 27, 29, 11 }, { 0, 2, 19 } },
      { { 1, 18, 20 }, { 10, 27, 29 }, { 0, 2, 19 }, { 28, 9, 11 } },
      { { 10, 27, 29 }, { 0, 2, 19 }, { 9, 11, 28 }, { 1, 18, 20 } },
      { { 0, 2, 19 }, { 9, 11, 28 }, { 1, 18, 20 }, { 10, 27, 29 } },
      { { 0, 1, 11 }, { 10, 18, 20 }, { 2, 27, 19 }, { 28, 29, 9 } },
      { { 9, 10, 20 }, { 27, 29, 19 }, { 0, 11, 28 }, { 1, 2, 18 } },
      { { 18, 19, 29 }, { 0, 2, 28 }, { 1, 9, 20 }, { 10, 11, 27 } },
      { { 27, 28, 2 }, { 1, 9, 11 }, { 10, 18, 29 }, { 0, 19, 20 } },
      { { 29, 1, 18 }, { 0, 2, 10 }, { 19, 20, 9 }, { 11, 27, 28 } },
      { { 2, 10, 27 }, { 9, 11, 19 }, { 18, 28, 29 }, { 20, 0, 1 } },
      { { 11, 19, 0 }, { 18, 20, 28 }, { 27, 1, 2 }, { 29, 9, 10 } },
      { { 20, 28, 9 }, { 27, 29, 1 }, { 0, 10, 11 }, { 18, 19, 2 } },
      { { 27, 11, 1 }, { 2, 18, 10 }, { 29, 9, 19 }, { 0, 20, 28 } },
      { { 0, 20, 10 }, { 11, 27, 19 }, { 2, 18, 28 }, { 1, 29, 9 } },
      { { 29, 9, 19 }, { 0, 20, 28 }, { 1, 27, 11 }, { 2, 18, 10 } },
      { { 28, 2, 18 }, { 1, 29, 9 }, { 0, 20, 10 }, { 27, 11, 19 } },
      { { 0, 1, 2 }, { 9, 10, 11 }, { 18, 19, 20 }, { 27, 28, 29 } },
      { { 9, 10, 11 }, { 18, 19, 20 }, { 27, 28, 29 }, { 0, 1, 2 } },
      { { 18, 19, 20 }, { 27, 28, 29 }, { 0, 1, 2 }, { 9, 10, 11 } },
      { { 27, 28, 29 }, { 0, 1, 2 }, { 9, 10, 11 }, { 18, 19, 20 } },
      { { 0, 2, 28 }, { 9, 10, 20 }, { 11, 19, 27 }, { 1, 18, 29 } },
      { { 1, 9, 11 }, { 29, 18, 19 }, { 0, 28, 20 }, { 2, 27, 10 } },
      { { 18, 20, 10 }, { 2, 27, 28 }, { 29, 1, 9 }, { 0, 11, 19 } },
      { { 27, 29, 19 }, { 0, 1, 11 }, { 2, 10, 18 }, { 28, 20, 9 } },
      { { 0, 2, 10 }, { 1, 9, 20 }, { 11, 19, 27 }, { 18, 28, 29 } },
      { { 9, 11, 19 }, { 18, 29, 10 }, { 0, 28, 20 }, { 1, 2, 27 } },
      { { 18, 20, 28 }, { 2, 27, 19 }, { 29, 1, 9 }, { 0, 10, 11 } },
      { { 27, 29, 1 }, { 0, 28, 11 }, { 2, 10, 18 }, { 9, 19, 20 } },
      { { 0, 1, 11 }, { 2, 28, 18 }, { 9, 19, 20 }, { 10, 27, 29 } },
      { { 9, 10, 20 }, { 1, 11, 27 }, { 28, 29, 18 }, { 0, 2, 19 } },
      { { 18, 19, 29 }, { 0, 10, 20 }, { 1, 2, 27 }, { 28, 9, 11 } },
      { { 27, 28, 2 }, { 9, 29, 19 }, { 0, 10, 11 }, { 1, 18, 20 } },
      { { 0, 11, 19 }, { 2, 10, 18 }, { 1, 9, 20 }, { 27, 28, 29 } },
      { { 9, 28, 20 }, { 11, 27, 19 }, { 29, 10, 18 }, { 0, 1, 2 } },
      { { 29, 1, 18 }, { 0, 20, 28 }, { 2, 27, 19 }, { 9, 10, 11 } },
      { { 2, 10, 27 }, { 1, 9, 29 }, { 0, 28, 11 }, { 18, 19, 20 } },
      { { 9, 10, 20 }, { 11, 27, 28 }, { 29, 18, 19 }, { 0, 1, 2 } },
      { { 29, 18, 19 }, { 0, 1, 20 }, { 2, 27, 28 }, { 9, 10, 11 } },
      { { 27, 28, 2 }, { 29, 9, 10 }, { 0, 1, 11 }, { 18, 19, 20 } },
      { { 0, 1, 11 }, { 2, 18, 19 }, { 9, 10, 20 }, { 27, 28, 29 } },
      { { 1, 2, 18 }, { 9, 19, 20 }, { 27, 28, 29 }, { 0, 10, 11 } },
      { { 27, 10, 11 }, { 28, 29, 18 }, { 0, 1, 2 }, { 19, 20, 9 } },
      { { 0, 20, 19 }, { 27, 1, 2 }, { 11, 9, 10 }, { 18, 29, 28 } },
      { { 28, 29, 9 }, { 0, 10, 11 }, { 18, 19, 20 }, { 1, 2, 27 } },
      { { 2, 10, 18 }, { 1, 9, 29 }, { 0, 19, 20 }, { 27, 28, 11 } },
      { { 27, 19, 11 }, { 2, 10, 18 }, { 28, 29, 9 }, { 0, 1, 20 } },
      { { 0, 28, 20 }, { 27, 11, 19 }, { 1, 2, 18 }, { 29, 9, 10 } },
      { { 1, 29, 9 }, { 0, 28, 20 }, { 27, 10, 11 }, { 2, 18, 19 } },
      { { 0, 1, 20 }, { 10, 11, 27 }, { 2, 28, 18 }, { 29, 29, 19 } },
      { { 9, 10, 29 }, { 0, 19, 20 }, { 1, 11, 27 }, { 2, 28, 18 } },
      { { 2, 18, 19 }, { 28, 29, 9 }, { 0, 10, 20 }, { 1, 27, 11 } },
      { { 27, 28, 11 }, { 1, 2, 18 }, { 29, 9, 19 }, { 0, 20, 10 } },
      { { 0, 19, 20 }, { 10, 11, 27 }, { 1, 2, 18 }, { 28, 29, 9 } },
      { { 28, 29, 9 }, { 0, 19, 20 }, { 27, 10, 11 }, { 1, 2, 18 } },
      { { 1, 2, 18 }, { 28, 29, 9 }, { 0, 19, 20 }, { 27, 10, 11 } },
      { { 27, 10, 11 }, { 1, 2, 18 }, { 28, 29, 9 }, { 0, 19, 20 } },
      { { 29, 9, 10 }, { 0, 1, 20 }, { 11, 27, 28 }, { 2, 18, 19 } },
      { { 2, 18, 19 }, { 29, 9, 10 }, { 0, 1, 20 }, { 11, 27, 28 } },
      { { 11, 27, 28 }, { 2, 18, 19 }, { 29, 9, 10 }, { 0, 1, 20 } },
      { { 0, 1, 20 }, { 11, 27, 28 }, { 2, 18, 19 }, { 29, 9, 10 } },
      { { 1, 2, 18 }, { 28, 9, 20 }, { 27, 10, 29 }, { 11, 19, 0 } },
      { { 27, 10, 11 }, { 1, 29, 18 }, { 0, 2, 19 }, { 28, 9, 20 } },
      { { 0, 19, 20 }, { 27, 10, 2 }, { 9, 11, 28 }, { 29, 1, 18 } },
      { { 28, 29, 9 }, { 0, 11, 19 }, { 1, 18, 20 }, { 2, 10, 27 } },
      { { 27, 29, 10 }, { 0, 28, 11 }, { 2, 18, 19 }, { 1, 9, 20 } },
      { { 0, 2, 19 }, { 1, 9, 20 }, { 27, 28, 11 }, { 10, 29, 18 } },
      { { 9, 28, 11 }, { 18, 29, 10 }, { 20, 1, 0 }, { 2, 27, 19 } },
      { { 1, 18, 20 }, { 2, 27, 19 }, { 29, 9, 10 }, { 0, 28, 11 } },
      { { 2, 28, 18 }, { 9, 10, 20 }, { 1, 27, 29 }, { 0, 19, 11 } },
      { { 1, 27, 11 }, { 29, 18, 19 }, { 0, 2, 10 }, { 9, 28, 20 } },
      { { 0, 20, 10 }, { 2, 27, 28 }, { 9, 11, 19 }, { 1, 29, 18 } },
      { { 29, 9, 19 }, { 0, 1, 11 }, { 28, 18, 20 }, { 2, 27, 10 } },
      { { 27, 29, 19 }, { 0, 10, 11 }, { 2, 28, 18 }, { 1, 9, 20 } },
      { { 0, 2, 28 }, { 9, 19, 20 }, { 1, 11, 27 }, { 10, 29, 18 } },
      { { 1, 9, 11 }, { 28, 29, 18 }, { 0, 10, 20 }, { 2, 27, 19 } },
      { { 10, 18, 20 }, { 1, 2, 27 }, { 29, 19, 9 }, { 0, 28, 11 } } };

  public static int[] EdgePositions = { 1, 3, 5, 7, 10, 12, 14, 16, 19, 21, 23, 25, 28, 30, 32, 34, 37, 39, 41, 43, 46,
      48, 50, 52 };

  public static int[] CornorPositions = { 0, 2, 6, 8, 9, 11, 15, 17, 18, 20, 24, 26, 27, 29, 33, 35, 36, 38, 42, 44, 45,
      47, 51, 53 };

  public static int[] WhiteLessEdges = { 1, 3, 5, 10, 12, 14, 19, 21, 23, 28, 30, 32, 37, 39, 41, 43 };

  public static int[] YellowEdges = { 0, 1, 2, 9, 10, 11, 18, 19, 20, 27, 28, 29, 36, 37, 38, 39, 41, 42, 43, 44 };

  public static char[] SolvedCube = "gggggggggooooooooobbbbbbbbbrrrrrrrrryyyyyyyyywwwwwwwww".toCharArray();

}