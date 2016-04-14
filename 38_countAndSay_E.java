public class Solution {
    public String countAndSay(int n) {
        
        if(n <= 0) return "";
        
        String s = "1";
        
        for(int i = 2; i <= n; i++) {
            int count = 1;
            StringBuilder res = new StringBuilder();
            for(int j = 0; j < s.length() - 1; j++) {
                if(s.charAt(j) == s.charAt(j+1))
                    count++;
                else {
                    res.append(count);
                    res.append(s.charAt(j));
                    count = 1;
                }
            }
            res.append(count);
            res.append(s.charAt(s.length() - 1));
            s = res.toString();
        }
        
        return s;
        
    }
}