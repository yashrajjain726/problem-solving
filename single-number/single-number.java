class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int xor = 0;
        for(int ele:nums)
            xor ^= ele;
        return xor;
    }
}