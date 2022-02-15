class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int tillMax = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            tillMax = Math.max(tillMax+nums[i],nums[i]);
            res = Math.max(tillMax,res);
        }
        return res;
    }
}