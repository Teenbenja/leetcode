public class Solution {
    public boolean isPalindrome(int x) {
        //  in order to do it in place, we can't use the method 
        //  of reversing the interger and minus.

        if(x < 0) return false;
        
        int len = 1;
        
        while(len <= x/10) len *= 10;
        
        while(x > 0) {
            if(x / len != x % 10) return false;
            x = (x % len) / 10;
            len /= 100;
        }
        
        return true;
        
    }
}