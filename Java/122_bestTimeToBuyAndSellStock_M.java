public class Solution {
    public int maxProfit(int[] prices) {
      
      int len = prices.length;
      if(len < 2) {
        return 0;
      }
      
      int maxProfit = 0;
      int i = 0;
      
      while(i < len - 1) {
        int buy = i;
        int sell = i;
        //  find the vale and set it the buy point
        while(i + 1 < len && prices[i] > prices[i+1]) {
          i++;
        }
        buy = i;
        //  find the peak and set it the sell point, be careful with the condition "=".
        //  if forgotten that sign in the situation of flat line of value, means the value not changing, 
        //  the i will not moving forward and end up dead loop.
        while(i + 1 < len && prices[i] <= prices[i+1]) {
          i++;
        }
        sell = i;
        maxProfit += (prices[sell] - prices[buy]);
      }
      
      return maxProfit;
      
    }
}