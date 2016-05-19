public class Solution {
    public int nthUglyNumber(int n) {
      //  min heap solution
      if(n == 1) {
        return 1;
      }
      
      PriorityQueue<Long> pq = new PriorityQueue<>();
      pq.add(1l);
      for(int i = 1; i < n; i++) {
        long tmp = pq.poll();
        while(!pq.isEmpty() && pq.peek() == tmp) {
          tmp = pq.poll();
        }
        pq.add(tmp * 2);
        pq.add(tmp * 3);
        pq.add(tmp * 5);
      }
      
      return pq.poll().intValue();
      
    }
}