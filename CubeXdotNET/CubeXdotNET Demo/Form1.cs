using CubeXdotNET;

using System;
using System.Linq;
using System.Windows.Forms;

namespace CubeXdotNET_Demo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void SolveButton_Click(object sender, EventArgs e)
        {
            if (CubeState.Text.Length != 54 || !CubeState.Text.All(c => "gobryw".Contains(c))) // Invalid entry if user didn't enter 54 colors or if the input string contains other characters.
            {
                MessageBox.Show("Invalid Entry");
                return;
            }

            FridrichSolver Solver = new FridrichSolver(CubeState.Text);

            //Status before solving
            LengthLabel.Text = "Length : " + Solver.Length.ToString();
            ErrorCodeLabel.Text = "ErrorCode : " + Solver.ErrorCode.ToString();
            IsSolvedLabel.Text = "IsSolved : " + ((Solver.IsSolved) ? "true" : "false");
            SolverTimeLabel.Text = "SolverTime : " + Solver.SolverTime.Milliseconds.ToString() + "ms"; 

            Solver.Solve();

            //Status after solving
            Soln.Text = Solver.Solution;
            LengthLabel.Text = "Length : " + Solver.Length.ToString();
            ErrorCodeLabel.Text = "ErrorCode : " + Solver.ErrorCode.ToString();
            IsSolvedLabel.Text = "IsSolved : " + ((Solver.IsSolved) ? "true" : "false");
            SolverTimeLabel.Text = "SolverTime : " + Solver.SolverTime.Milliseconds.ToString() + "ms";
        }
    }
}
