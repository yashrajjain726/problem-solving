class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int num:prices)
        {
            min = Math.min(num,min);
            res = Math.max(res, num-min);
        }
        return res;
    }

}