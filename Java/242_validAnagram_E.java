public class Solution {
    public boolean isAnagram(String s, String t) {
      //  O(n) time and space
      if(s == null || t == null || s.length() == 0 || t.length() == 0) {
        return true;
      }
      
      char[] count = new char[27];
      
      for(int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
      }
      for(int i = 0; i < t.length(); i++) {
        if(count[t.charAt(i) - 'a'] <= 0) {
          return false;
        }
        else {
          count[t.charAt(i) - 'a']--;
        }
      }
      
      for(int i = 0; i < 27; i++) {
        if(count[i] != 0) return false;
      }
      
      return true;
      
    }
}



// public class Solution {
//     public boolean isAnagram(String s, String t) {
//       //  O(nlogn) time and O(n) space
//       if(s == null || t == null || s.length() == 0 || t.length() == 0) {
//         return true;
//       }
      
//       char[] sA = s.toCharArray();
//       char[] tA = t.toCharArray();
      
//       Arrays.sort(sA);
//       Arrays.sort(tA);
      
//       return String.valueOf(sA).equals(String.valueOf(tA));
      
//     }
// }