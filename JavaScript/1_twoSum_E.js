/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    var maps = {};
    
    for(var i = 0; i < nums.length; i++) {
        if(maps[nums[i]] !== undefined) {
            return [maps[nums[i]], i];
        }else {
            maps[target - nums[i]] = i;
        }
    }
    
};