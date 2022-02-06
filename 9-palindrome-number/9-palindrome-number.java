class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int temp = n;
        int rem = 0;
        int rev = 0;
        while(temp!=0)
        {
            rem = temp % 10;
            rev = (rev * 10)+rem;
            temp/=10;
        } return (n==rev);
    }
}