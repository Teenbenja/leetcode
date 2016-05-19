public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //  Min-heap solution, O(n + k + (n-k)lgK) time
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
          map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
              public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
              }
            });
        
        List<Integer> res = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
          heap.add(entry);
          if(heap.size() > k) {
            heap.poll();
          }
        }
        
        while(!heap.isEmpty()) {
          res.add(heap.poll().getKey());
        }
        
        return res;
        
    }
}


// public class Solution {
//     public List<Integer> topKFrequent(int[] nums, int k) {
//         //  Max-heap solution, O(n + nlgn) time
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int n: nums) {
//           map.put(n, map.getOrDefault(n, 0) + 1);
//         }
        
//         PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
//         heap.addAll(map.entrySet());
//         List<Integer> res = new ArrayList<>();
        
//         for(int i = 0; i < k; i++ ) {
//           res.add(heap.poll().getKey());
//         }
        
//         return res;
        
//     }
// }


// public class Solution {
//     public List<Integer> topKFrequent(int[] nums, int k) {
//       //  bucket sort solution, O(n) time
//       List<Integer>[] bucket = new List[nums.length + 1];
//       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//       List<Integer> res = new ArrayList<Integer>();
      
//       for(int n: nums) {
//         map.put(n, map.getOrDefault(n, 0) + 1);
//       }
      
//       for(int key: map.keySet()) {
//         int val = map.get(key);
//         if(null == bucket[val]) {
//           bucket[val] = new ArrayList<Integer>();
//         }
//         bucket[val].add(key);
//       }
      
//       for(int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
//         if(bucket[i] != null) {
//           res.addAll(bucket[i]);
//         }
//       }
      
//       return res;
      
//     }
// }