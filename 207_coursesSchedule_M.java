public class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    //  bfs solution
    //  init the graph
    ArrayList[] graphs = new ArrayList[numCourses];
    int[] indegree = new int[numCourses];
    for(int i = 0; i < numCourses; i++) {
      graphs[i] = new ArrayList<Integer>();
    }
    
    //  fill the graph and count the postCourses
    for(int i = 0; i < prerequisites.length; i++) {
      graphs[prerequisites[i][1]].add(prerequisites[i][0]);
      indegree[prerequisites[i][0]]++;
    }
    
    //  find the enter point
    Queue<Integer> q = new LinkedList<>();
    for(int i = 0; i < numCourses; i++) {
      if(indegree[i] == 0) {
        q.offer(i);
      }
    }
    //  bfs
    int count = 0;
    while(!q.isEmpty()) {
      int curr = q.poll();
      count++;
      ArrayList<Integer> nexts = graphs[curr];
      for(int i = 0; i < nexts.size(); i++) {
        indegree[nexts.get(i)]--;
        if(indegree[nexts.get(i)] == 0) {
          q.offer(nexts.get(i));
        }
      }
    }
    
    return count == numCourses;
    
  }
}





// public class Solution {
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
//       //  topological sort
      
//       //  init the graph list
//       List<Set> graphs = new ArrayList<Set>();
//       for(int i = 0; i < numCourses; i++) {
//         graphs.add(new HashSet<Integer>());
//       }
      
//       //  fill the list
//       for(int i = 0; i < prerequisites.length; i++) {
//         graphs.get(prerequisites[i][1]).add(prerequisites[i][0]);
//       }
      
//       //  count the pre coures
//       int[] listNum = new int[numCourses];
//       for(int i = 0; i < numCourses; i++) {
//         Set set = graphs.get(i);
//         Iterator<Integer> it = set.iterator();
//         while(it.hasNext()) {
//           listNum[it.next()]++;
//         }
//       }
      
//       //  remove the non-pre-nodes
//       for(int i = 0; i < numCourses; i++) {
//         int j = 0;
//         // find the non-pre-nodes
//         for( ; j < numCourses; j++) {
//           if(listNum[j] == 0) {
//             break;
//           }
//         }
//         if(j == numCourses) return false;
//         listNum[j] = -1;
//         //  remove the removed node's edges
//         Set set = graphs.get(j);
//         Iterator<Integer> it = set.iterator();
//         while(it.hasNext()) {
//           listNum[it.next()]--;
//         }
        
//       }
      
//       return true;
      
//     }
// }