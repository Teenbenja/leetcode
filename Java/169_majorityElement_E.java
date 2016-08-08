public class Solution {
    public int majorityElement(int[] nums) {
      //  boyer-moore voting algo
      //  O(n) time and O(1) space
      int candidate = nums[0];
      int count = 1;
      
      for(int i = 1; i < nums.length; i++) {
        if(nums[i] != candidate) {
          count--;
        }else {
          count++;
        }
        if(count == 0) {
          candidate = nums[i];
          count = 1;
        }
      }
      
      return candidate;
      
    }
}


// public class Solution {
//     public int majorityElement(int[] nums) {
      
//       Arrays.sort(nums);
      
//       int mid = nums.length / 2;
      
//       return nums[mid];
      
//     }
// }