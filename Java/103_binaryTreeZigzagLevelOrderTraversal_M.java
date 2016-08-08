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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      
      if(root == null) {
        return res;
      }
      
      boolean odd = true;
      int curLevel = 1;
      int nextLevel = 0;
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      List<Integer> tmpList = new ArrayList<Integer>();
      queue.offer(root);
      
      while(!queue.isEmpty()) {
        TreeNode tmpNode = queue.poll();
        
        if(odd) {
          tmpList.add(tmpNode.val);
        }else {
          tmpList.add(0, tmpNode.val);
        }
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
          res.add(tmpList);
          tmpList = new ArrayList<Integer>();
          curLevel = nextLevel;
          nextLevel = 0;
          odd = !odd;
        }
      }
      
      return res;
      
    }
}