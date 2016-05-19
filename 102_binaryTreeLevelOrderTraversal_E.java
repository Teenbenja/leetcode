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
    public List<List<Integer>> levelOrder(TreeNode root) {
      //  BFS
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      if(root == null) {
        return res;
      }
      
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      int curLevel = 1;
      int nextLevel = 0;
      queue.offer(root);
      List<Integer> curList = new LinkedList<>();
      
      while(!queue.isEmpty()) {
        
        TreeNode curNode = queue.poll();
        curList.add(curNode.val);
        curLevel--;
        if(curNode.left != null) {
          queue.offer(curNode.left);
          nextLevel++;
        }
        if(curNode.right != null) {
          queue.offer(curNode.right);
          nextLevel++;
        }
        if(curLevel == 0) {
          res.add(curList);
          curLevel = nextLevel;
          nextLevel = 0;
          curList = new LinkedList<>();
        }
      }
      
      return res;
      
    }
}