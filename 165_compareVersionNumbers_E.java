public class Solution {
    public int compareVersion(String version1, String version2) {
      // O(n) time
      long value1 = 0;
      long value2 = 0;
      int i = 0;
      int j = 0;
      int len1 = version1.length();
      int len2 = version2.length();
      
      while(i < len1 || j < len2) {
        value1 = 0;
        value2 = 0;
        while(i < len1 && version1.charAt(i) != '.') {
          value1 = value1 * 10 + version1.charAt(i) - '0';
          i++;
        }
        i++;
        while(j < len2 && version2.charAt(j) != '.') {
          value2 = value2 * 10 + version2.charAt(j) - '0';
          j++;
        }
        j++;
        if(value1 > value2) return 1;
        if(value1 < value2) return -1;
      }
      
      return 0;
      
    }
}