public class Solution {
    
    public int getNextNum(int n) {
        
      int res = 0;
      
      while(n != 0) {
          res += Math.pow(n%10, 2);
          n /= 10;
      }
      
      return res;
        
    }
    
    public boolean isHappy(int n) {
      
      if(n < 1) return false;
      
      Set<Integer> set = new HashSet<Integer>();
      
      while(n != 1) {
        if(set.contains(n)) {
          return false;
        }
        set.add(n);
        n = getNextNum(n);
      }
      
      return true;
      
    }
}