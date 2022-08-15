class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
            return false;
        int divisor_sum = 1;
        int i;
        for(i=2;i<=Math.sqrt(num);i++)
            if(num%i==0)
                divisor_sum+=i+(num/i);
        return divisor_sum==num;
    }
}