class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
boolean[] merged = new boolean[intervals.length];

for (int i = 0; i < intervals.length; i++) {
    int start = intervals[i][0], end = intervals[i][1];
    if (merged[i]) continue;
    for (int j = i + 1; j < intervals.length; j++) {
        if (intervals[j][0] <= end) { // Overlap
            end = Math.max(end, intervals[j][1]);
            merged[j] = true;
        }
    }
    res.add(new int[]{start, end});
}
    return res.toArray(new int[res.size()][]); }
}