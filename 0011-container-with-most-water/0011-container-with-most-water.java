class Solution {
    public int maxArea(int[] height) {
        int i =0, j= height.length-1;
        int maxarea = Integer.MIN_VALUE;
        while(i<j){
            int area = (j-i)*(Math.min(height[i],height[j]));
            maxarea = Math.max(area,maxarea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea ;
    }
}