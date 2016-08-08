public class Solution {
    public int findPeakElement(int[] nums) {
      //  binary search 
      if(nums == null || nums.length == 0) {
        return -1;
      }
      
      int l = 0;
      int r = nums.length - 1;
      int mid = 0;
      
      while(l <= r) {
        mid = l + (r - l) / 2;
        if((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
          return mid;
        }else if(mid > 0 && nums[mid] < nums[mid - 1]) {
          r = mid;
        }else {
          l = mid + 1;
        }
      }
      
      return mid;
      
    }
}