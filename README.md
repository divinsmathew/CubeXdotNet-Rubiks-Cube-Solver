# Overview

CubeX is an implementation of the famous [Fredrich Method (or CFOP Method)](https://en.wikipedia.org/wiki/CFOP_Method) in C#. It can generate layer-by-layer solutions to any valid scramble of a 3x3x3 Rubik's Cube, with an average of around 63 moves. Only cubes with standard color scheme [with opposite colors as Yellow-White, Green-Blue and Red-Orange] are currently supported.

# Basics

`FredrichSolver` class can be used to create an instance of solver. It takes a string that represents a scrambled cube. The string can contain characters 'g','o','b','r','y' or 'w' ; Each denoting colors Green, Orange, Blue, Red, Yellow and White respectively. The string hence, should contain exactly 54 characters (9 Cubelets * 6 Faces) that can represent the cube state. The order in which the color is to be entered is:


For example a solved cube is represented by : `"gggggggggooooooooobbbbbbbbbrrrrrrrrryyyyyyyyywwwwwwwww"`

# Quickstart

    FredrichSolver Solver = new FredrichSolver("gygrgogwgoyogobowobybobrbwbryrbrgrwryoybygyrywrwbwgwow"); //The Superflip!

    Solver.Solve();

    if(Solver.IsSolved)
    {
        Console.WriteLine("Solution ({0} Moves) : {1}",Solver.Length, Solver.Solution);
    }

Go through the sample provided for better understanding.

![](http://i.imgur.com/dvBFOct.png)
