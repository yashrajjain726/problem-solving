class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int total_sum = 0;
        int start = 0;
        int prev_sum = 0;
        
        for(int i=0;i<n;i++)
        {
            total_sum += gas[i] - cost[i];
            if(total_sum < 0)
            {
                start = i+1;
                prev_sum += total_sum;
                total_sum = 0;
            }
        }
        return (prev_sum+total_sum>=0)?start:-1;
    }
}