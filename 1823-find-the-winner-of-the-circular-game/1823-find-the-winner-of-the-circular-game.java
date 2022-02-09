class Solution {
    public int findTheWinner(int n, int k) {
        return josephusProblem(n,k)+1;
    }
    public int josephusProblem(int n, int k)
    {
        if(n==0)
            return 1;
        return ((josephusProblem(n-1,k)+k)%n);
    }
}