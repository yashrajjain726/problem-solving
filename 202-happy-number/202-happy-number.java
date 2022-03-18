class Solution {
    public int squareSum(int n)
    {
        int temp = n;
        int rev = 0; 
        while(temp!=0)
        {
            int rem = temp%10;
            rev = rev + (int)(Math.pow(rem,2));
            temp /= 10;
        }
        return rev;
    }
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1)
        {
             n = squareSum(n);
            if(n==1)
                return true;
            if(set.contains(n))
                return false;
            set.add(n);
        }
        return true;
    }
}