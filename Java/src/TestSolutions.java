import Problems.FindAllPairsWithSum;
import Problems.LastCellInaMatrix;

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
    }
}
