public class Solution {
    public String convertToTitle(int n) {
      
      if(n < 1) return "";
      
      StringBuilder res = new StringBuilder();
      
      while(n > 0) {
        res.append((char)((n - 1) % 26 + 'A'));
        n = (n - 1) / 26;           // be careful with the 26, 26 / 26 == 1
      }
      
      return res.reverse().toString();
      
    }
}