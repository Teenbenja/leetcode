public class Solution {
    public int numSquares(int n) {
      // dp solution, O(n * n) time and O(n) space
      int[] dp = new int[n + 1];
      dp[1] = 1;
      
      for(int i = 2; i <= n; i++) {
        int min = Integer.MAX_VALUE;
        for(int j = 1; j * j <= i; j++) {
          min = Math.min(min, dp[i - j * j] + 1);
        }
        dp[i] = min;
      }
      
      return dp[n];
     
    }
}