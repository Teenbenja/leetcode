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
     public List<Integer> inorderTraversal(TreeNode root) {
         //  Iterative
         List<Integer> res = new ArrayList<>();
         Stack<TreeNode> stk = new Stack<>();
         
         while(root != null || !stk.isEmpty()) {
             if(root != null) {
                 stk.push(root);
                 root = root.left;
             }else {
                 root = stk.pop();
                 res.add(root.val);
                 root = root.right;
             }
         }
         
         return res;
         
     }
 }
 
 
// public class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
           //  recursive
//         List<Integer> res = new ArrayList<>();
//         helper(root, res);
//         return res;
//     }
//     public void helper(TreeNode root, List<Integer> res) {
//         if(root == null) {
//             return ;
//         }
//         helper(root.left, res);
//         res.add(root.val);
//         helper(root.right, res);
//     }
// }