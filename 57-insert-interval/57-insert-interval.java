class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       if(intervals.length<=0)
           return new int[][]{newInterval};
        List<int[]> merged = new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0])
        {
            merged.add(intervals[i]);
            i++;
        }
        while (i<intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        merged.add(newInterval);
        while (i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}