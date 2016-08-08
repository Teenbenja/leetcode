public class Solution {
    public int reverse(int x) {
        
        if(x == 0) return 0;
        //  dot's forget to consider the boundary issue
        long res = 0;
        
        while(Math.abs(x) > 0) {
            int remain = x % 10;
            x /= 10;
            res = (res * 10 + remain);
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }
        
        return (int)res;
        
    }
}