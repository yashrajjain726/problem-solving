class Solution {
    public int countPrimes(int n) {
        boolean isPrime[] = new boolean[n+1];
        int count = 0;
        Arrays.fill(isPrime,true);
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(isPrime[i])
            {
                for(int j = i*i;j<n;j=j+i)
                {
                    isPrime[j]= false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(isPrime[i])
                count++;
        }
        return count;
    }
}