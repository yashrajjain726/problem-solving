class Solution {
    public int maxProfit(int[] prices) {
     int ans = 0;
     int min_ele = Integer.MAX_VALUE;
      for(int i=0;i<prices.length;i++){
          min_ele = Math.min(min_ele,prices[i]);
          ans = Math.max(ans,prices[i]-min_ele);
      }
        return ans;
    }
}