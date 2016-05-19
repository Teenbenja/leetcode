public class Solution {
    public int addDigits(int num) {
      //  this is about the digital root according to the hint
      return (num - 1) % 9 + 1;
      
    }
}



// public class Solution {
//     public int addDigits(int num) {
      
//       while(num / 10 > 0) {
//         int tmp = 0;
//         while(num > 0) {
//             tmp += num % 10;
//             num /= 10;
//         }
//         num = tmp;
//       }
      
//       return num;
      
//     }
// }