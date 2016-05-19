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
    public List<Integer> rightSideView(TreeNode root) {
      
      List<Integer> res = new ArrayList<Integer>();
      
      if(root == null) {
        return res;
      }
      
      Queue<TreeNode> queue = new LinkedList<>();
      int curLevel = 1;
      int nextLevel = 0;
      queue.offer(root);
      
      while(!queue.isEmpty()) {
        TreeNode tmpNode = queue.poll();
        curLevel--;
        
        if(tmpNode.left != null) {
          queue.offer(tmpNode.left);
          nextLevel++;
        }
        if(tmpNode.right != null) {
          queue.offer(tmpNode.right);
          nextLevel++;
        }
        
        if(curLevel == 0) {
          res.add(tmpNode.val);
          curLevel = nextLevel;
          nextLevel = 0;
        }
      }
      
      return res;
      
    }
}