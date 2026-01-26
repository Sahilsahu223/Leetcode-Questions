class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Compare mid with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // We are in an upward slope. The peak must be to the right.
                // mid definitely cannot be the peak (it's smaller than mid+1).
                left = mid + 1;
            } else {
                // We are in a downward slope. The peak is either at mid or to the left.
                right = mid;
            }
        }
        
        // When left == right, we found a peak
        return left;
    }
}