class Solution {
    public int rob(int[] nums) {
        int maxEven = 0;
        int maxOdd = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                maxEven += nums[i];
                maxEven = Math.max(maxEven,maxOdd);
            }
            else
            {
                maxOdd += nums[i];
                maxOdd = Math.max(maxEven,maxOdd);
            }
        }
        return Math.max(maxEven,maxOdd);
    }
}