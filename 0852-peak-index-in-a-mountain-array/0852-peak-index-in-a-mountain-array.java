class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if we are on the rising slope
            if (arr[mid] < arr[mid + 1]) {
                // We are climbing up, so peak is to the right
                left = mid + 1;
            } else {
                // We are falling down (or at the peak), so look left
                // We keep 'mid' because it might be the answer
                right = mid;
            }
        }
        
        // When left meets right, we found the peak
        return left;
    }
}