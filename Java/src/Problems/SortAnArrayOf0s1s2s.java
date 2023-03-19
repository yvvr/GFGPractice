package Problems;

/**
 * This question is asked in Flipkart, Paytm Interview. <br>
 *
 * <p>Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 *
 * <p>Expected Time Complexity: O(N) Expected Auxiliary Space: O(1)
 *
 * <p>Constraints:
 * 1 <= N <= 10^6
 * 0 <= A[i] <= 2
 *
 * https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&difficulty[]=0&sortBy=submissions
 */
public class SortAnArrayOf0s1s2s {

    public static void sort012(int[] a, int n) {
        // Represents the 0 end
        int i = -1;
        // Represents the 1 end
        int j = -1;
        // Represents the 2 start
        int k = n;

        for (int l = 0; l < k; l++) {
            if (a[l] == 0) {
                // Sort 0.
                i++;
                j++;
                a[i] = 0;
                if (i != j) {
                    a[j] = 1;
                }
            } else if (a[l] == 1) {
                // Sort 1.
                j++;
                a[j] = 1;
            } else if (a[l] == 2) {
                // Sort 2.
                k--;
                while (k >= 0 && a[k] == 2) {
                    k--;
                }
                if (a[k] == 0) {
                    // Sort 0.
                    i++;
                    j++;
                    a[i] = 0;
                    if (i != j) {
                        a[j] = 1;
                    }
                } else if (a[k] == 1) {
                    // Sort 1.
                    j++;
                    a[j] = 1;
                }
                a[k] = 2;
                while (k - 1 >= 0 && a[k - 1] == 2) {
                    k--;
                }
            }
        }
    }
}
