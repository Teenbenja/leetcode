public class Solution {
    public String reverseString(String s) {
      
      if(s == null || s.length() <= 1) return s;
      
      int len = s.length();
      char[] sArray = s.toCharArray();
      int i = 0;
      int j = len - 1;
      
      while(i < j) {
        char tmp = sArray[i];
        sArray[i++] = sArray[j];
        sArray[j--] = tmp;
      }
      
      return String.valueOf(sArray);
      
    }
}