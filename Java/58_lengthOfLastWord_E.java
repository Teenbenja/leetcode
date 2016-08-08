public class Solution {
    public int lengthOfLastWord(String s) {
        // O(n) time
        s = s.trim();
		if(s == null || s.length() == 0) return 0;

		int i = s.length() - 1;
		while(i >= 0) {
			if(s.charAt(i) != ' ')
				i--;
			else 
				break;
		}

		return s.length() - 1 - i;
        
    }
}