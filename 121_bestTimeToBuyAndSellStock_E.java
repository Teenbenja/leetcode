public class Solution {
    public int maxProfit(int[] prices) {
      //  DP, O(n) time and O(1) space
      if(prices.length < 2) return 0;
      int minVal = prices[0];
      int maxProfit = 0;
      
      for(int i = 1; i < prices.length; i++) {
        if(prices[i] < minVal) {
          minVal = prices[i];
        } else {
          maxProfit = Math.max(maxProfit, prices[i] - minVal);
        }
      }
      
      return maxProfit;
      
    }
}