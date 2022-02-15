class Solution {
    public int maxSubarray(int nums[])
    {
        int res = nums[0];
        int tillMax = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            tillMax = Math.max(tillMax+nums[i],nums[i]);
            res = Math.max(res, tillMax);
        }
        return res;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int maxNormal = maxSubarray(nums);
        if(maxNormal<0)
            return maxNormal;
        int arrSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            arrSum += nums[i];
            nums[i] = -nums[i];
        }
        int maxCircular = arrSum + maxSubarray(nums);
        return Math.max(maxNormal,maxCircular);
    }
}