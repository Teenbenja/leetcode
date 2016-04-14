public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // O(n) time and O(1) space
        int i = m - 1, j = n - 1, p = m + n -1;
        
        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j])
                nums1[p--] = nums1[i--];
            else
                nums1[p--] = nums2[j--];
        }
        
        while(i >= 0) {
            nums1[p--] = nums1[i--];
        }
        
        while(j >= 0) {
            nums1[p--] = nums2[j--];
        }
        
        
    }
}