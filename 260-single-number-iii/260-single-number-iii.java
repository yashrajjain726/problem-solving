class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor = 0;
        int res_one = 0;
        int res_two = 0;
        for(int i=0;i<nums.length;i++)
            xor ^= nums[i];
        int last_bit = xor & ~(xor-1);
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&last_bit)==0)
                res_one ^= nums[i];
            else
                res_two ^= nums[i];
        }
        ans[0] = res_one;
        ans[1] = res_two;
        return ans;
        
    }
}