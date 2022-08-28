class Solution {
    public int reverse(int x) {
        boolean isNeg = (x>0) ?false: true;
        int rev = reverseInt(Math.abs(x));
        return isNeg?-rev:rev;
    }
    public int reverseInt(int x){
        int temp = x;
        long rev = 0;
        while(temp!=0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp /10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
            rev = 0;
        return (int)rev;
    }
}