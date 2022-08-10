class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int res = 0;
        for(int num:nums){
            if(num==1)
                maxOnes++;
            else
                maxOnes=0;
            res = Math.max(res,maxOnes);
        }
        return res;
    }
}