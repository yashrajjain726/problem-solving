class Solution {
    public int subtractProductAndSum(int n) {
        int sumTemp = n;
        int productTemp = n;
        int sum = sumOfNumber(sumTemp);
        System.out.println("sum "+sum);
        int product = productOfNumber(productTemp);
        System.out.println("product "+product);
        int res = product - sum;
        return res;
    }
    public int sumOfNumber(int n)
    {
        
        if(n==0)
            return 0;
        int sum = 0;
        sum += n%10;
        return sum + sumOfNumber(n/10);
    }
    public int productOfNumber(int n)
    { 
        
        if(n==0)
            return 1;
        
        return n%10 * productOfNumber(n/10);
    }
}