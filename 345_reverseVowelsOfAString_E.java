public class Solution {
    public boolean isVowel(Character c) {
      
      c = Character.toLowerCase(c);
      
      return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
      
    }
    
    public String reverseVowels(String s) {
      // O(n) time and space
      if(s == null || s.length() <= 1) return s;
      
      char[] sArray = s.toCharArray();
      
      int len = sArray.length;
      int head = 0;
      int tail = len - 1;
      
      while(head < tail) {
        while(!isVowel(sArray[head]) && head < tail) {
          head++;
        }
        while(!isVowel(sArray[tail]) && tail > head) {
          tail--;
        }
        if(head >= tail) break;
        
        char tmp = sArray[head];
        sArray[head] = sArray[tail];
        sArray[tail] = tmp;
        head++;
        tail--;
      }
      
      return String.valueOf(sArray);
      
    }
}