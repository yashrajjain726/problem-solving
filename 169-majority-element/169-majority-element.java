class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[res])
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            {
                count =1;
                res = i;
            } 
        }
        count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[res]==nums[i])
                count++;
        }
        if(count<=nums.length/2) res = -1;
         return nums[res];
    }
}