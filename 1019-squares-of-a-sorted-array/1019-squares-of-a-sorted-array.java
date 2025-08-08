class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int [nums.length];
        int i=0, j=nums.length-1;
        int k=nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k]=nums[j]*nums[j];
                k--;
                j--;
            }
            else{
                arr[k]=nums[i]*nums[i];
                k--;
                i++;
            }
        }
        return arr;
    }
}