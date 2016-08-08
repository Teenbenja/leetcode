public class Solution {
    public void rotate(int[] nums, int k) {
      
      if(nums == null || nums.length == 0 || k % nums.length == 0) {
        return ;
      }
      int p = k % nums.length;
      reverse(nums, 0, nums.length - p - 1);
      reverse(nums, nums.length - p, nums.length - 1);
      reverse(nums, 0, nums.length - 1);
      
    }
    public void reverse(int[] nums, int i, int j) {
      
      while(i < j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
        j--;
      }
      
    }
}