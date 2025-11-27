class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rights [] = new int [n];
        int lefts [] = new int [n];
        lefts[0]=nums[0];
        for(int i=1;i<n;i++){
            lefts[i]=lefts[i-1]+nums[i];
        }
        rights[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rights[i]=rights[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(rights[i]==lefts[i]){
                return i;
            }
        }
        return -1;
    }
}