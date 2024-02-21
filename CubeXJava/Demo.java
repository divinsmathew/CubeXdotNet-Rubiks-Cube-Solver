public class Demo {
  public static void main(String[] args) {
    FridrichSolver ScrambledCube = new FridrichSolver("gygrgogwgoyogobowobybobrbwbryrbrgrwryoybygyrywrwbwgwow");
    ScrambledCube.Solve();

    if (ScrambledCube.IsSolved) {
      System.out.println("Solve succeeded.");
      System.out.println("Solved in: " + ScrambledCube.SolverTime.toString() + "ms");
    }

    System.out.println("Solution: " + ScrambledCube.getSolution());
  }
}
