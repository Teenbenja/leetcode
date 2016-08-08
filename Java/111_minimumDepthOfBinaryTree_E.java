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
    public int minDepth(TreeNode root) {
      //  Recursion solution  
      if(root == null) return 0;
      
      if(root.left == null) 
        return minDepth(root.right) + 1;
      if(root.right == null) 
        return minDepth(root.left) + 1;
        
      return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        
    }
}

 public class Solution {
     public int minDepth(TreeNode root) {
       //  iteration solution, bfs. Once reach the first leave, stop and return.
       if(root == null) {
         return 0;
       }
       
       LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
       int level = 1;
       int curNum = 0;  //  number of nodes in current level
       int lastNum = 1;  //  number of nodes in last level
       
       queue.offer(root);
       while(!queue.isEmpty()) {
         TreeNode cur = queue.poll();
         if(cur.left == null && cur.right == null) {
           return level;
         }
         curNum--;
         if(cur.left != null) {
           queue.offer(cur.left);
           nextNum++;
         }
         if(cur.right != null) {
           queue.offer(cur.right);
           nextNum++;  
         }
         if(curNum == 0) {
           curNum = nextNum;
           nextNum = 0;
           level++;
         }
       }
       
       return 0;
       
     }
 }