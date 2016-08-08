// public class Solution {
//   public boolean isPowerOfThree(int n) {
    
//     if(n < 1) return false;
//     if(n == 1) return true;
    
//     while(n > 3) {
//       if(n % 3 == 0) {
//         n /= 3;
//       }
//       else return false;
//     }
    
//     return n == 3;
    
//   }
// }


public class Solution {
    public boolean isPowerOfThree(int n) {
      
      return n < 1? false : n == Math.pow(3, Math.round(Math.log(n) / Math.log(3))); 
      
    }
}