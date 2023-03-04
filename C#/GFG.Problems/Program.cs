using System;
using GFG.Problems.Solutions;

namespace GFG.Problems
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Solutions for GFG Practice problems");

            // Test problem 1 (LastCellInaMatrix)
            int[,] arr = { { 0, 1 }, { 1, 0 } };
            int[] exitCell = LastCellInaMatrix.endPointsWithLoop(arr, 2, 2);
            Console.WriteLine("Exit cell is: ({0}, {1})", exitCell[0], exitCell[1]);
        }
    }
}
