public class Solution {
    public boolean isPalindrome(String s) {
        //  be careful here, alphanumeric characters includes numbers
        if(s == null || s.length() <= 1) return true;
        
        int i = 0, j = s.length() - 1;
        String res = s.toLowerCase();
        while(i < j) {
            if((res.charAt(i) < 'a' || res.charAt(i) > 'z') && (res.charAt(i) < '0' || res.charAt(i) > '9')) {
                i++;
                continue;
            }
            if((res.charAt(j) < 'a' || res.charAt(j) > 'z') && (res.charAt(j) < '0' || res.charAt(j) > '9')){
                j--;
                continue;
            }
            if(res.charAt(i) != res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }  
        
        return true;
        
    }
}