public class Solution {
    public String addBinary(String a, String b) {
        // O(max(m,n)) time, the Character.getNumericValue() is the method need to be noticed here
        StringBuilder res = new StringBuilder();
        
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;
        
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        
        while(i >= 0 && j >= 0) {
            int count = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
            if(count == 3) {
                carry = 1;
                res.append('1');
            }else if(count == 2) {
                carry = 1;
                res.append('0');
            }else if(count == 1) {
                carry = 0;
                res.append('1');
            }
            else {
                carry = 0;
                res.append('0');
            }
            i--;
            j--;
        }
        
        if(a.length() > b.length()) {
            while(i >= 0) {
                int count = Character.getNumericValue(a.charAt(i)) + carry;
                if(count == 3) {
                    carry = 1;
                    res.append('1');
                }else if(count == 2) {
                    carry = 1;
                    res.append('0');
                }else if(count == 1) {
                    carry = 0;
                    res.append('1');
                }
                else {
                    carry = 0;
                    res.append('0');
                }
                i--;
            }
        }else {
            while(j >= 0) {
                int count = Character.getNumericValue(b.charAt(j)) + carry;
                if(count == 3) {
                    carry = 1;
                    res.append('1');
                }else if(count == 2) {
                    carry = 1;
                    res.append('0');
                }else if(count == 1) {
                    carry = 0;
                    res.append('1');
                }
                else {
                    carry = 0;
                    res.append('0');
                }
                j--;
            }
        }
        if(carry == 1) res.append('1');
        
        return res.reverse().toString();
        
    }
}