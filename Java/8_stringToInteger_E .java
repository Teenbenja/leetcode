public class Solution {
    public int myAtoi(String str) {
        /*  cases needed to be considered: space on the head and tail,
        *   "-,+"sign on the front, value out of boundary.
        */
        if(str == null || str.length() == 0) return 0;
        
        long res = 0;
        int sign = 1;
        
        String s = str.trim();

        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                sign = s.charAt(i) == '-' ? -1: 1;
            }else if(s.charAt(i) < '0' || s.charAt(i) > '9') return (int)res*sign;
            else {
                res = res * 10 + Character.getNumericValue(s.charAt(i));
                if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }
        
        return (int)res * sign;
        
    }
}