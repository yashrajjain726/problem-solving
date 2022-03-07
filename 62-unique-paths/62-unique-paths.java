class Solution {
    public int uniquePaths(int m, int n) {
        int rDir = m + n - 2;
        int cDir = m - 1;
        double res = 1;
        for(int i=1;i<=cDir;i++)
        {
            res = res*(rDir-cDir+i)/i; 
        }
        return (int)res;
        
    }
}