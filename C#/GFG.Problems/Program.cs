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

            // Test problem 2 (FindMiddleElementInLinkedList)
            var findMiddleElementInLinkedList = new FindMiddleElementInLinkedList();
            findMiddleElementInLinkedList.push(1);
            findMiddleElementInLinkedList.push(2);
            findMiddleElementInLinkedList.push(3);
            Console.WriteLine("MiddleElementInLinkedList : {0}", findMiddleElementInLinkedList.getMiddle());

            Console.ReadKey();
        }
    }
}
