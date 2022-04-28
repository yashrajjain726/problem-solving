class Solution {
    final int[][] SHIFT = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minimumEffortPath(int[][] heights) {  
    int m = heights.length, n = heights[0].length;
    int[][] effort = new int[m][n];
        
    for (int[] row : effort) 
        Arrays.fill(row, Integer.MAX_VALUE);
        
    effort[0][0] = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
    pq.add(new int[] {0, 0, 0});
        
    while (!pq.isEmpty()) 
    {        
      int[] cur = pq.remove();
      int row = cur[0], col = cur[1], weight = cur[2];
        
      for (int[] s : SHIFT) {
        int nRow = s[0] + row, nCol = s[1] + col;
        if (nRow >= 0 && nRow < m && nCol >= 0 && nCol < n)
        {
          int newWeight = Math.max(weight, Math.abs(heights[row][col] - heights[nRow][nCol]));
          if (effort[nRow][nCol] > newWeight)
          {
            effort[nRow][nCol] = newWeight;
            pq.add(new int[] {nRow, nCol, newWeight});
          }
        }
      }
    }
    return effort[m - 1][n - 1];
        
    }
}