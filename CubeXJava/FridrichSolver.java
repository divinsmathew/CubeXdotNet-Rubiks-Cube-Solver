import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class FridrichSolver {
  public char[] Cube;
  public int Length;
  public boolean IsSolved;
  public int ErrorCode;
  public Duration SolverTime;

  public String Solution;

  public FridrichSolver(String ScrambledCube) {
    this.Cube = ScrambledCube.toCharArray();
  }

  public String getSolution() {
    return this.Solution;
  }

  public void setSolution(String Solution) {
    this.Solution = Solution;
  }

  public void setCube(char[] Cube) {
    this.Cube = Cube;
  }

  public char[] getCube() {
    return this.Cube;
  }

  public int Solve() {
    Instant StartTime = Instant.now();

    Cross.Solve(this);

    F2L.Solve(this);

    OLL.Solve(this);

    PLL.Solve(this);

    if (Arrays.equals(this.Cube, Constants.SolvedCube)) {
      Tools.OptimizeSolution(this); // Removes redundant moves like "U U'" and reduces "R R2" to "R'"

      this.SolverTime = Duration.between(StartTime, Instant.now());

      this.IsSolved = true;

      return 1; // Success
    } else {
      return -9; // Unknown Error
    }
  }
}
