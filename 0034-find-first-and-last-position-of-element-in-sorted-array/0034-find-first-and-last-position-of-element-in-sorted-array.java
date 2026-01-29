class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstindex = findindex(nums,target,true);
        int lastindex = findindex(nums,target,false);
        return new int[] {firstindex,lastindex};
    }
    static int findindex(int[] nums, int target, boolean isfirst){
            int i=0, j=nums.length-1;
            int index = -1;
            while(i<=j){
                int mid = i-(i-j)/2;
                if(nums[mid]==target){
                    index = mid;
                    if(isfirst){
                        j=mid-1;
                    }
                    else{
                        i=mid+1;
                    }
                }
                else if(nums[mid]<target){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            return index;
    }

}