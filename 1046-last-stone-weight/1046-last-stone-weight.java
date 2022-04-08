class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)
            return stones[0];
        int n = stones.length;
        Arrays.sort(stones);
        while(stones[n-2]!=-1)
        {
            
            if(stones[n-1]!= stones[n-2])
                stones[n-1] = stones[n-1] - stones[n-2];
            else
                stones[n-1] = 0;
            stones[n-2] = -1;
            Arrays.sort(stones);    
        }
        return stones[n-1];
    }
    // 2 3 7
    // 2 0 4
    // 0 2 4
    // 0 0 2
    
    
}