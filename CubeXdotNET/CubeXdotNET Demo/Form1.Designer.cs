namespace CubeXdotNET_Demo
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.CubeState = new System.Windows.Forms.TextBox();
            this.SolveButton = new System.Windows.Forms.Button();
            this.Soln = new System.Windows.Forms.RichTextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.SolverTimeLabel = new System.Windows.Forms.Label();
            this.IsSolvedLabel = new System.Windows.Forms.Label();
            this.ErrorCodeLabel = new System.Windows.Forms.Label();
            this.LengthLabel = new System.Windows.Forms.Label();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // CubeState
            // 
            this.CubeState.Location = new System.Drawing.Point(12, 19);
            this.CubeState.Name = "CubeState";
            this.CubeState.Size = new System.Drawing.Size(421, 20);
            this.CubeState.TabIndex = 0;
            // 
            // SolveButton
            // 
            this.SolveButton.Location = new System.Drawing.Point(12, 54);
            this.SolveButton.Name = "SolveButton";
            this.SolveButton.Size = new System.Drawing.Size(421, 70);
            this.SolveButton.TabIndex = 1;
            this.SolveButton.Text = "Solve using Fridrich Method!";
            this.SolveButton.UseVisualStyleBackColor = true;
            this.SolveButton.Click += new System.EventHandler(this.SolveButton_Click);
            // 
            // Soln
            // 
            this.Soln.Location = new System.Drawing.Point(12, 19);
            this.Soln.Name = "Soln";
            this.Soln.Size = new System.Drawing.Size(421, 100);
            this.Soln.TabIndex = 2;
            this.Soln.Text = "";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.CubeState);
            this.groupBox1.Controls.Add(this.SolveButton);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(444, 135);
            this.groupBox1.TabIndex = 3;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Input";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.SolverTimeLabel);
            this.groupBox2.Controls.Add(this.IsSolvedLabel);
            this.groupBox2.Controls.Add(this.ErrorCodeLabel);
            this.groupBox2.Controls.Add(this.LengthLabel);
            this.groupBox2.Controls.Add(this.Soln);
            this.groupBox2.Location = new System.Drawing.Point(12, 153);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(444, 183);
            this.groupBox2.TabIndex = 4;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Solution";
            // 
            // SolverTimeLabel
            // 
            this.SolverTimeLabel.AutoSize = true;
            this.SolverTimeLabel.Location = new System.Drawing.Point(9, 161);
            this.SolverTimeLabel.Name = "SolverTimeLabel";
            this.SolverTimeLabel.Size = new System.Drawing.Size(88, 13);
            this.SolverTimeLabel.TabIndex = 6;
            this.SolverTimeLabel.Text = "SolverTime : 0ms";
            // 
            // IsSolvedLabel
            // 
            this.IsSolvedLabel.AutoSize = true;
            this.IsSolvedLabel.Location = new System.Drawing.Point(354, 161);
            this.IsSolvedLabel.Name = "IsSolvedLabel";
            this.IsSolvedLabel.Size = new System.Drawing.Size(79, 13);
            this.IsSolvedLabel.TabIndex = 5;
            this.IsSolvedLabel.Text = "IsSolved : false";
            // 
            // ErrorCodeLabel
            // 
            this.ErrorCodeLabel.AutoSize = true;
            this.ErrorCodeLabel.Location = new System.Drawing.Point(364, 137);
            this.ErrorCodeLabel.Name = "ErrorCodeLabel";
            this.ErrorCodeLabel.Size = new System.Drawing.Size(69, 13);
            this.ErrorCodeLabel.TabIndex = 4;
            this.ErrorCodeLabel.Text = "ErrorCode : 0";
            // 
            // LengthLabel
            // 
            this.LengthLabel.AutoSize = true;
            this.LengthLabel.Location = new System.Drawing.Point(9, 137);
            this.LengthLabel.Name = "LengthLabel";
            this.LengthLabel.Size = new System.Drawing.Size(55, 13);
            this.LengthLabel.TabIndex = 3;
            this.LengthLabel.Text = "Length : 0";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(466, 341);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "CubeXdotNET Demo";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TextBox CubeState;
        private System.Windows.Forms.Button SolveButton;
        private System.Windows.Forms.RichTextBox Soln;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label ErrorCodeLabel;
        private System.Windows.Forms.Label LengthLabel;
        private System.Windows.Forms.Label IsSolvedLabel;
        private System.Windows.Forms.Label SolverTimeLabel;
    }
}

