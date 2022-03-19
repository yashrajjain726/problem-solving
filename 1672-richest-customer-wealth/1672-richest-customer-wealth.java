class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int arrSum = 0;
            for(int j=0;j<accounts[0].length;j++)
                arrSum += accounts[i][j];
            max = Math.max(arrSum,max);
        }
        return max;
    }
}