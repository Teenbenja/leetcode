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
    public int maxDepth(TreeNode root) {
      // recursion solution
      if(root == null) return 0;
        
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        
    }

    public int maxDepth(TreeNode root) {
      //  Iteration solution
      if(root == null) return 0;

      int level = 0;
      LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

      queue.add(root);
      int curNum = 1;  //  nubmer of nodes left in current level
      int nextNum = 0;  //  number of nodes in next level

      while(!queue.isEmpty()) {
      	TreeNode n = queue.poll();
      	curNum--;
      	if(n.left != null) {
      	  queue.add(n.left);
      	  nextNum++;
      	}
      	if(n.right != null) {
      	  queue.add(n.right);
      	  nextNum++;
      	}
      	if(curNum == 0) {
      		level++;
      		curNum = nextNum;
      		nextNum = 0;
      	}
      }

      return level;

    }
}