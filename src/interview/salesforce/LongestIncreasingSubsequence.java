package interview.salesforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(lengthOfLIS(new int[]{0,1,0,3,2,3}));
        System.out.println(lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
    // Dynamic programming, O(n^2)
    static int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;

        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        int maximumSoFar = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    LIS[i] = Math.max(1 + LIS[j], LIS[i]);
                }
            }
            maximumSoFar = Math.max(maximumSoFar, LIS[i]);
        }
        return maximumSoFar;
    }

    // Binary search, O(nlogn)
    static int lengthOfLIS2(int[] nums) {
        List<Integer> lis = new ArrayList<>(nums.length);

        for (int n : nums) {
            int i = Collections.binarySearch(lis, n);
            if (i < 0) i = -i - 1;

            if (i == lis.size())
                lis.add(n);
            else
                lis.set(i, n);
        }
        return lis.size();
    }
}
