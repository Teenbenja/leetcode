/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
      //  bfs
      //  iterative dfs solution is about the same, but just change the queue with a stack
      if(node == null) {
        return null;
      }
      
      UndirectedGraphNode head = new UndirectedGraphNode(node.label);
      //  use the hashmap to store the visited node as key and its' duplicate new node as value
      HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
      hm.put(node, head);
      
      Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
      queue.offer(node);
      
      while(!queue.isEmpty()) {
        UndirectedGraphNode tmpNode = queue.poll();
        for(UndirectedGraphNode aneighbor: tmpNode.neighbors) {
          if(!hm.containsKey(aneighbor)) {
            queue.offer(aneighbor);
            hm.put(aneighbor, new UndirectedGraphNode(aneighbor.label));
          }
          //  this step is to put all the neighbors of tmpNode into its' neighbor list
          hm.get(tmpNode).neighbors.add(hm.get(aneighbor)); 
        }
      }
      
      return head;
      
    }
}