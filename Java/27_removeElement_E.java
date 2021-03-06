public class Solution {
    public int removeElement(int[] nums, int val) {
      
      if(nums == null || nums.length == 0) return 0;
      
      int i = 0;
      int j = nums.length - 1;
      
      while(i <= j) {
        if(nums[i] == val) {
          int tmp = nums[i];
          nums[i] = nums[j];
          nums[j] = tmp;
          j--;
        }else {
          i++;
        }
      }
      
      return j+1;
      
    }
}