class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        double temp = myPow(x,n/2);
        temp = temp * temp;
        if(n%2==0)
            return temp;
        else
            if(n<0)
                return temp/x;
            return temp * x;
    }
}