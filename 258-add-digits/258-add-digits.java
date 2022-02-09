class Solution {
    public int untilOneDigit(int n) {
        if(n>=0 && n<=9)
            return n;
        return (n%10+addDigits(n/10));
    }
    public int addDigits(int n)
    {
        while(n>9)
        {
            n = untilOneDigit(n);
        }
        return n;
    }
}