public class Solution {
    public int maxProfit(int[] prices) {
      //  DP solution, O(n) time and O(n) space. But we can do it in O(1) space
      //  by simply replace the two arrays with three veriables.
      if(prices == null || prices.length == 0) {
        return 0;
      }
      
      int len = prices.length;
      int[] haveStock = new int[len + 1];
      int[] noStock = new int[len + 1];
      
      haveStock[0] = - prices[0];
      noStock[0] = 0;
      
      for(int i = 1; i < len; i++) {
        noStock[i] = Math.max(noStock[i - 1], haveStock[i - 1] + prices[i]);
        if(i == 1) {
          haveStock[i] = Math.max(haveStock[0], - prices[1]);
        }else {
          haveStock[i] = Math.max(haveStock[i - 1], noStock[i - 2] - prices[i]);
        }
      }
      
      return noStock[len - 1];
      
    }
}