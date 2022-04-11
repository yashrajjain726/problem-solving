class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
        int total = row * col;
        k = k % total;
        
        for(int i=0;i<row;i++)
        {
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int j=0;j<col;j++)
            {
                int shiftIndex = (i*col+j+total-k)%total;
                innerList.add(grid[shiftIndex/col][shiftIndex%col]);    
            }
            list.add(innerList);
        }
        return list;
    }
}