class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
            if(evenNumberDigits(nums[i]))
                count++;
        return count;
    }
    public boolean evenNumberDigits(int num)
    {
        if(num<9)
            return false;
        int countDigits = 0;
        while(num!=0)
        {
            num /=10;
            countDigits++;
        }
        return countDigits%2==0;
    }
}