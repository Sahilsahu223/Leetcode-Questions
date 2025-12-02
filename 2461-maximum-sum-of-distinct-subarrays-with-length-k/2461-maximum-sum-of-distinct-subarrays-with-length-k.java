import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0, r = 0;
        Set<Integer> set = new HashSet<>();
        long maxSum = 0, sum = 0;

        while (r < nums.length) {
            sum += nums[r];

            // shrink until nums[r] is unique
            while (set.contains(nums[r])) {
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            set.add(nums[r]);

            // if window has exactly k distinct numbers
            if (set.size() == k) {
                maxSum = Math.max(maxSum, sum);

                // shrink from left to keep window moving
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            r++;
        }

        return maxSum;
    }
}