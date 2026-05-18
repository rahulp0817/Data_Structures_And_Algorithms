package Greedy_Algorithms;

import java.util.Arrays;

public class Assign_Cookies {
  public int findContentChildren(int[] g, int[] s) {
    int n = g.length;
    int m = s.length;
    int left = 0;
    int right = 0;

    Arrays.sort(g);
    Arrays.sort(s);

    while (left < m && right < n) {

      if (g[right] <= s[left]) {
        right++;
      }

      left++;
    }

    return right;
  }
}

// Time Complexity: O(nlogn + mlogm) where n is the length of g and m is the length of s. This is because we need to sort both arrays.
// Space Complexity: O(1)