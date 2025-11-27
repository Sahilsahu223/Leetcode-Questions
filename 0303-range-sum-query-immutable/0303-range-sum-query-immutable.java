class NumArray {
    // This array will store the cumulative sums
    private int[] prefixSum;

    public NumArray(int[] nums) {
        // Step 1: Create an array of size N + 1
        prefixSum = new int[nums.length + 1];
        
        // Index 0 is already 0 by default (Java init), so we start filling from 1.
        // prefixSum[i] will store the sum of nums[0]...nums[i-1]
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
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