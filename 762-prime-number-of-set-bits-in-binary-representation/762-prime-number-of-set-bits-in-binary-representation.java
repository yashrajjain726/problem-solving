class Solution {
    public boolean checkPrime(int n)
    {
        if(n==0 || n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if((n%2==0)|| (n%3==0))
            return false;
        for(int i=5;i<=Math.sqrt(n);i+=6)
        {
            if((n%i==0)||(n%(i+2)==0))
                return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
     int totalRes = 0;
     int count = 0;
     for(int i=left;i<=right;i++)
     {
         int temp = i;
         count = 0;
         while(temp>0)
         {
             int rem = temp % 2;
             if(rem!=0)
             {
                 count++;
             }
             temp = temp/2;
         }
         totalRes = totalRes + (checkPrime(count)?1:0);
     }
     return totalRes;
    }
}