public class Solution {
    public String convert(String s, int numRows) {
        //  be careful with the equations
        if(s == null || s.length() == 0 || numRows <= 0) return "";
        
        if(numRows == 1) return s;
        
        StringBuilder res = new StringBuilder();
        int size = 2*numRows - 2;
        for(int i = 0; i < numRows; i++) {
            for(int j = i; j < s.length(); j += size) {
                res.append(s.charAt(j));
                if(i != 0 && i != numRows - 1 && j + size - i * 2 < s.length()) res.append(s.charAt(j + size - i * 2));
            }
        }
        
        return res.toString();
        
    }
}