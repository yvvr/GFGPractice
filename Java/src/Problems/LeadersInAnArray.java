package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * This question is asked in Adobe Interview. <br>
 *
 * Given an array A of positive integers. Your task is to find the leaders in the array. An element
 * of array is leader if it is greater than or equal to all the elements to its right side. The
 * rightmost element is always a leader.
 *
 * <p>Expected Time Complexity: O(n), Expected Auxiliary Space: O(n)
 *
 * <p>Constraints:
 * 1 <= n <= 10^7
 * 0 <= A[i] <= 10^7
 *
 * https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&difficulty[]=0&curated[]=1&sortBy=submissions
 */
public class LeadersInAnArray {

    // Function to find the leaders in the array.
    public static ArrayList<Integer> leaders(int[] arr, int n) {
        ArrayList<Integer> leadersList = new ArrayList<>();
        int currentLeader = Integer.MIN_VALUE;
        // Find the leaders
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= currentLeader) {
                leadersList.add(arr[i]);
                currentLeader = arr[i];
            }
        }
        Collections.reverse(leadersList);
        return leadersList;
    }
}
