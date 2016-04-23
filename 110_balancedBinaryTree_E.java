/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
      
      return subIsBalanced(root) != -1;
      
    }
    
    public int subIsBalanced(TreeNode root) {
      
      if(root == null) {
        return 0;
      }
      
      int left = subIsBalanced(root.left);
      int right = subIsBalanced(root.right);
      
      if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
        return -1;
      }
      
      return Math.max(left, right) + 1;
      
    }
}