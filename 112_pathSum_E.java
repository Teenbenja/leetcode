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
    public boolean hasPathSum(TreeNode root, int sum) {
      /*  O(n) time and O(logn) space.
      *   The algorithm here is use travesal method to find if its left subtree and right subtree
      *   contains such path. 
      *   End conditions are null or reach leave and the leave's value equals to remaining sum.
      */
      if(root == null) return false;
      
      if(root.left == null && root.right == null && root.val == sum) return true;
      
      return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
      
    }
}