class Solution {
    public void sortColors(int[] nums) {
        int start=0, m=0, end=nums.length-1;
        while(m<=end){
            if(nums[m]== 0){
                int temp = nums[m];
                nums[m]=nums[start];
                nums[start]=temp;
                m++;
                start++;

            }
            else if (nums[m]== 2){
                int temp = nums[m];
                nums[m]=nums[end];
                nums[end]=temp;
                end--;
            }
            else{
                m++;
            }
        }
    }
}