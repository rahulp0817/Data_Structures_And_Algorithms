package Sliding_Window.Dynamic_Window;

public class Minimum_Window_SubString {
  class Solution {
    public String minWindow(String s, String t) {

      // declare frequency of array
      int[] mapS = new int[256];
      int[] mapT = new int[256];

      // populate T
      for (char ch : t.toCharArray()) {
        mapT[ch]++;
      }

      // sliding window
      int left = 0;
      int minLength = Integer.MAX_VALUE;
      int startIndex = 0;
      int count = 0;

      for (int right = 0; right < s.length(); right++) {

        // populate s
        char ch = s.charAt(right);
        mapS[ch]++;

        // check character
        if (mapT[ch] > 0 && mapS[ch] <= mapT[ch]) {
          count++;
        }

        // expand window
        while (count == t.length()) {
          if ((right - left + 1) < minLength) {
            // update values
            minLength = right - left + 1;
            startIndex = left;
          }

          // remove the leftchar
          char leftChar = s.charAt(left);
          mapS[leftChar]--;

          // chack valid broken or not
          if (mapT[leftChar] > 0 && mapS[leftChar] < mapT[leftChar]) {
            count--;
          }

          // shrink
          left++;
        }
      }

      return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
  }
}
