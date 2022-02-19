class Solution {
    public int maximumDifference(int[] nums) {
        int difference = 0;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            difference = Math.max(difference,nums[i]-minVal);
            minVal = Math.min(minVal,nums[i]);
        }
        
        return (difference==0)?-1:difference;
    }
}