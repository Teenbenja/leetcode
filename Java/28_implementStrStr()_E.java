public class Solution {
    public int strStr(String haystack, String needle) {
        //  this is the brute force solution, time complexity will be O(mn)
        //  and there is the KMP solution that can solve it in O(n) time
        if(needle == null || needle.length() == 0) return 0;
        
        if(haystack == null || haystack.length() == 0 || haystack.length() < needle.length()) return -1;
        
        int res = -1;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j) == needle.charAt(j) && j == needle.length() - 1)
                    {
                        res = i;
                        return res;
                    }
                if(haystack.charAt(i+j) != needle.charAt(j)) 
                    break;
            }
        }
        
        return res;
        
    }
}