public class Solution {
  public int climbStairs(int n) {
    // DP solution
    int[] dp = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;
    
    for(int i = 2; i <= n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    
    return dp[n];
    
  }
}


public class Solution {
    public int climbStairs(int n) {
      //  recursion solution too slow
      if(n == 1) return 1;
      if(n == 2) return 2;
      
      return climbStairs(n - 1) + climbStairs(n - 2);
      
    }
}

