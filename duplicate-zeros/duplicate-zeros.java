class Solution {
    public void duplicateZeros(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                rightShift(nums,i+1,nums.length-1);
                i++;
            }
        }
    }
    public void rightShift(int nums[],int start,int end)
    {
        for(int i=end;i>=start;i--)
            nums[i] = nums[i-1];
    }
}