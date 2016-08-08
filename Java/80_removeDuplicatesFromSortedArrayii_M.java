public class Solution {
    public int removeDuplicates(int[] nums) {
        //  O(n) time
        if(nums.length < 2) {
            return nums.length;
        }
        
        int pre = 1;
        int pointer = 2;
        
        for(; pointer < nums.length; pointer++) {
            if(nums[pointer] != nums[pre - 1]) {
                nums[++pre] = nums[pointer];
            }
        }
        
        return pre + 1;
        
    }
}