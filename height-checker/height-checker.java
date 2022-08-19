class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length==1)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:heights)
            pq.add(num);
        int count = 0;
        for(int i=0;i<heights.length;i++)
            if(heights[i]!=pq.remove())
                count++;
        return count;
    }
}