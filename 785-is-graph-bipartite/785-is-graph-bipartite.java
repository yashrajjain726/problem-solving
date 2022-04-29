class Solution {
    public boolean isBipartite(int[][] graph) {
        int n= graph.length;
        int ans[]=new int[n+1];
        Arrays.fill(ans,-1);
        
        for(int i=0;i<n;i++)
        {
            if(ans[i]==-1)
            {
                Queue<Integer> queue=new LinkedList<>();
                queue.add(i);
                ans[i]=1;
                while(queue.isEmpty()==false)
                {
                    int ele = queue.poll();
                    for(int inner_ele: graph[ele])
                    {
                        if(ans[inner_ele]==-1)
                        {
                            ans[inner_ele] = 1-ans[ele];
                            queue.add(inner_ele);
                        }
                        else if(ans[ele]==ans[inner_ele])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}