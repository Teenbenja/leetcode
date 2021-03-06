public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0 || strs == null) return "";
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) return res.toString();
            }
            res.append(strs[0].charAt(i));
        }
        
        return res.toString();
        
    }
}