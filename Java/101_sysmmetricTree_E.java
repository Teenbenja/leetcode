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
    public boolean isSymmetric(TreeNode root) {
      //  iterative solution
      if(root == null) {
        return true;
      }
      
      Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
      Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
      
      queue1.offer(root.left);
      queue2.offer(root.right);
      
      while(!queue1.isEmpty() && !queue2.isEmpty()) {
        TreeNode tmp1 = queue1.poll();
        TreeNode tmp2 = queue2.poll();
        
        if(tmp1 == null && tmp2 != null || tmp1 != null && tmp2 == null) {
          return false;
        }
        if(tmp1 != null) {
          if(tmp2.val != tmp1.val) {
            return false;
          }
          queue1.offer(tmp1.left);
          queue1.offer(tmp1.right);
          queue2.offer(tmp2.right);
          queue2.offer(tmp2.left);
        }
      }
      
      return true;
      
    }
 }
 
 
// public class Solution {
//     public boolean isSymmetric(TreeNode root) {
         //  recursive solution
//       if(root == null) {
//         return true;
//       }
      
//       return symmetric(root.left, root.right);
      
//     }
//     public boolean symmetric(TreeNode left, TreeNode right) {
      
//       if(left == null && right == null) {
//         return true;
//       }
//       if(left == null || right == null) {
//         return false;
//       }
      
//       return (left.val == right.val) && symmetric(left.right, right.left) && symmetric(left.left, right.right);
      
//     }
// }