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
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root == null) {
            return new ArrayList<String>();
        }
        
        ArrayList<String> res = new ArrayList<String>();
        String candi = String.valueOf(root.val);
        helper(res, root, candi);
        
        return res;
        
    }
    public void helper(List<String> res, TreeNode root, String candi) {
        
        if(root.left == null && root.right == null) {
            res.add(candi);
            return ;
        }
        if(root.left != null) { 
            helper(res, root.left, candi + "->" + root.left.val);
        }
        if(root.right != null) {
            helper(res, root.right, candi + "->" + root.right.val);
        }
        
    }
}