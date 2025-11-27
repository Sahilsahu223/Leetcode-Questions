class NumArray {
    // This array will store the cumulative sums
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];
        
        prefixSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        // Step 2: Apply the formula in O(1) time
        // We want the sum up to 'right'. In our shifted array, that is at index 'right + 1'.
        // We want to subtract everything before 'left'. In our shifted array, that is at index 'left'.
        return prefixSum[right + 1] - prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */