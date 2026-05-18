package Binary_Search;

public class Median_Two_Sorted_Arrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int m = nums1.length;
    int n = nums2.length;

    int[] merged = new int[m + n];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < m && j < n) {

      if (nums1[i] < nums2[j]) {
        merged[k] = nums1[i];
        i++;
      } else {
        merged[k] = nums2[j];
        j++;
      }

      k++;
    }

    while (i < m) {
      merged[k] = nums1[i];
      i++;
      k++;
    }

    while (j < n) {
      merged[k] = nums2[j];
      j++;
      k++;
    }

    int total = m + n;

    // odd
    if (total % 2 == 1)
      return merged[total / 2];

    // even
    double a = merged[total / 2];
    double b = merged[(total / 2) - 1];

    return (a + b) / 2.0;

  }
}

// Time Complexity: O(m + n) where m and n are the lengths of the two input arrays.
// Space Complexity: O(m + n) where m and n are the lengths of the two input arrays.