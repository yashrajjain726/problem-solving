class Solution {
    public int countSetBits(int n)
    {
        int res = 0;
        while(n>0)
        {
            n = n&(n-1);
            res++;
        }
        return res;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i] = countSetBits(i);
        }
        return arr;
    }
}