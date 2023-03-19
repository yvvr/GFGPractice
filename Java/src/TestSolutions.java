import Problems.FindAllPairsWithSum;
import Problems.LastCellInaMatrix;
import Problems.LeadersInAnArray;
import Problems.SortAnArrayOf0s1s2s;

import java.util.Arrays;

public class TestSolutions {

    public static void main(String[] args) {

        // Test LastCellInaMatrix
        int[][] arr = {{0, 1}, {1, 0}};
        int[] output = LastCellInaMatrix.endPoints(arr, 2, 2);
        System.out.println("Answer is : (" + output[0] + ", " + output[1] + ")");

        // Test 2: FindAllPairsWithSum
        long[] a = {1, 2, 4, 5, 7};
        long[] b ={5, 6, 3, 4, 8};
        System.out.println("Answer is : (" + Arrays.toString(FindAllPairsWithSum.allPairs(a, b, 5, 5, 9)) + ")");

        // Test 3: LeadersInAnArray
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println("Answer is : (" + LeadersInAnArray.leaders(A, A.length) + ")");

        // Test 4: SortAnArrayOf0s1s2s
        int[] arr2 = {0, 2, 2, 0, 1, 0, 2, 1, 1, 2, 1, 0, 1, 0};
        SortAnArrayOf0s1s2s.sort012(arr2, arr2.length);
        System.out.println("Answer is : (" + Arrays.toString(arr2) + ")");
    }
}
