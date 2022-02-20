class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minSub = Integer.MAX_VALUE;
        int first = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            while(sum>=target)
            {
                minSub = Math.min(minSub,i+1-first);
                sum -= nums[first++];
                
            }
        }
        return (minSub==Integer.MAX_VALUE)?0:minSub;
    }
}