using System;
using System.Linq;

namespace CubeXdotNET
{
    public class FredrichSolver
    {
        public char[] Cube = "".ToCharArray();
        public int Length = 0;
        public bool IsSolved = false;
        public int ErrorCode = 0;
        public TimeSpan SolverTime = TimeSpan.FromSeconds(0);

        public string Solution = "";

        public FredrichSolver(string ScramledCube)
        {
            this.Cube = ScramledCube.ToCharArray();
        }

        public int Solve()
        {
            DateTime StartTime = DateTime.Now;

            Cross.Solve(this);

            F2L.Solve(this);

            OLL.Solve(this);

            PLL.Solve(this);

            if (Enumerable.SequenceEqual(this.Cube, Constants.SolvedCube))
            {
                Tools.OptimizeSolution(this);

                this.SolverTime = DateTime.Now - StartTime;

                this.IsSolved = true;

                return 1; //Success
            }
            else
                return -9; //Unknown Error
        }
    }
}
