public class Solution {
    public int[] searchRange(int[] nums, int target) {
      //  binary search solution
      int[] res = {-1, -1};
      if(nums == null || nums.length == 0) {
        return res;
      }
      
      int l1 = 0;
      int r1 = nums.length - 1;
      int mid = 0;
      //  find the left index and l1 is the index
      while(l1 <= r1) {
        mid = l1 + (r1 - l1) / 2;
        if(nums[mid] < target) {
          l1 = mid + 1;
        }else {
          r1 = mid - 1;
        }
      }
      //  find the right index and r2 is the index
      int l2 = 0;
      int r2 = nums.length - 1;
      while(l2 <= r2) {
          mid = l2 + (r2 - l2) / 2;
          if(nums[mid] > target) {
            r2 = mid - 1;
          }else {
            l2 = mid + 1;
          }
      }
      
      if(l1 <= r2) {
        res[0] = l1;
        res[1] = r2;
      }
      
      return res;
      
    }
}