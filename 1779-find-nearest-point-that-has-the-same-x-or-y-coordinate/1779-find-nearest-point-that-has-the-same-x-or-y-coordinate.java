class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(points[i][0]==x || points[i][1]==y)
                list.add(i);
        }
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            int dist = Math.abs(points[list.get(i)][0]-x) + Math.abs(points[list.get(i)][1]-y);
            if(dist<min)
            {
                min = dist;
                index = list.get(i);
            }
                
        }
        return index;
    }
}