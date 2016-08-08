public class Solution {
    public int countPrimes(int n) {
        //  time complexity here is O(nloglogn)
        if(n <= 1) return 0;
        boolean[] helper = new boolean[n+1];
        int res = 0;
        
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(!helper[i]) {
                for(int j = i*i; j < n; j=j+i) {
                    helper[j] = true;
                }
            }
        }
        
        for(int i = 2; i < n; i++) {
            if(helper[i] == false) res++;
        }
        
        return res;
        
    }
}
