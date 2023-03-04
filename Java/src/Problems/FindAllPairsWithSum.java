package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * This question is asked in Amazon Interview. <br>
 *
 * <p>Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to
 * find all pairs from both arrays whose sum is equal to X.<br>
 *
 * <p>Note: All pairs should be printed in increasing order of u. <br>
 * For e.g. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be printed first else
 * second.
 *
 * <p>Expected Time Complexity: O(NLog(N)), Expected Auxiliary Space: O(N)
 *
 * <p>Constraints: 1 ≤ N, M ≤ 10^6 -10^6 ≤ X, A[i], B[i] ≤ 10^6
 *
 * <p>https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1&difficulty[]=0&curated[]=1&sortBy=submissions
 */
public class FindAllPairsWithSum {

    static class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static pair[] allPairs(long[] a, long[] b, long N, long M, long X) {
        List<pair> pairs = new ArrayList<>();
        // nlog(n)
        Arrays.sort(a);
        // Auxiliary Space: O(N)
        HashSet<Long> set = new HashSet<Long>();
        for (long n : b) {
            set.add(n);
        }
        for (long n : a) {
            if (set.contains(X - n)) {
                pairs.add(new pair(n, X - n));
            }
        }
        pair[] pairsArray = new pair[pairs.size()];
        return pairs.toArray(pairsArray);
    }
}
