class Solution {
    public int[][] merge(int[][] intervals) {
        int index =0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=1;i<intervals.length;i++){
            if(intervals[index][1]>=intervals[i][0]){
                intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
            }
            else{
                index++;
                intervals[index]=intervals[i];
            }
        }
        int res[][] = Arrays.copyOfRange(intervals,0,index+1);
        return res;
    }
}