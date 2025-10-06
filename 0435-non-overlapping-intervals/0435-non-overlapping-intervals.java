class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0||intervals.length==1){
            return 0;
        }
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        int last = intervals[0][1];
        int removals=0;
        for(int i=1;i<intervals.length;i++){
            if(last>intervals[i][0]){
                removals++;
                last=Math.min(intervals[i][1],last);
            }
            else{
                last=intervals[i][1];
            }
        }
        return removals;

    }
}