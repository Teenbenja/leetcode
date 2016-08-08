public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using hashtable, O(n) time
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length - 1; i++) {
            int tmp = target - nums[i];
            if(map.containsKey(tmp) && i != map.get(tmp)) {
                res[0] = i+1;
                res[1] = map.get(tmp)+1;
                break;
            }
        }
        
        return res;
        
    }
}