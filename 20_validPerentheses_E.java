public class Solution {
    public boolean isValid(String s) {
        // O(n) time, and remember to check if the stk is empty before peek()
        Stack<Character> stk = new Stack<Character>();
        if(s == null || s.length() == 0) return true;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stk.push(')');
            else if(s.charAt(i) == '[') stk.push(']');
            else if(s.charAt(i) == '{') stk.push('}');
            else if(s.charAt(i) == ')' && !stk.isEmpty() && stk.peek() == s.charAt(i)) stk.pop();
            else if(s.charAt(i) == ']' && !stk.isEmpty() && stk.peek() == s.charAt(i)) stk.pop();
            else if(s.charAt(i) == '}' && !stk.isEmpty() && stk.peek() == s.charAt(i)) stk.pop();
            else return false;
        }
        
        return stk.isEmpty();
        
    }
}