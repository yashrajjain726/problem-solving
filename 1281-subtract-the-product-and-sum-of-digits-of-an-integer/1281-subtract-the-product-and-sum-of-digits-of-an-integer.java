class Solution {
    public int subtractProductAndSum(int n) {
        int sumTemp = n;
        int productTemp = n;
        int sum = sumOfNumber(sumTemp);
        int product = productOfNumber(productTemp);
        int res = product - sum;
        return res;
    }
    public int sumOfNumber(int n)
    {
        
        if(n==0)
            return 0;
        return n%10 + sumOfNumber(n/10);
    }
    public int productOfNumber(int n)
    { 
        
        if(n==0)
            return 1;
        return n%10 * productOfNumber(n/10);
    }
}