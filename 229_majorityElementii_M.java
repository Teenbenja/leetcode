public class Solution {
    public List<Integer> majorityElement(int[] nums) {
      //  Boyer-Moore voting algo
      //  O(n) time and O(1) space
      if(nums == null || nums.length == 0) {
        return new ArrayList<Integer>();
      }
      List<Integer> res = new ArrayList<>();
      
      int canOne = nums[0];
      int canTwo = nums[0];
      int cntOne = 0;
      int cntTwo = 0;
      
      for(int i = 0; i < nums.length; i++) {
        if(nums[i] == canOne) {
          cntOne++;
        }else if(nums[i] == canTwo) {
          cntTwo++;
        }else if(cntOne == 0) {
          canOne = nums[i];
          cntOne = 1;
        }else if(cntTwo == 0) {
          canTwo = nums[i];
          cntTwo = 1;
        }else {
          cntOne--;
          cntTwo--;
        }
      }
      
      cntOne = 0;
      cntTwo = 0;
      
      for(int i = 0; i < nums.length; i++) {
        if(nums[i] == canOne) {
          cntOne++;
        }else if(nums[i] == canTwo) {
          cntTwo++;
        }
      }
      
      if(cntOne > nums.length / 3) res.add(canOne);
      if(cntTwo > nums.length / 3) res.add(canTwo);
      
      return res;
      
    }
}