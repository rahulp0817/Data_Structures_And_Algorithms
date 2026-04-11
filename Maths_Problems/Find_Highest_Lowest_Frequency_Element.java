package Maths_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_Highest_Lowest_Frequency_Element {

  public int[] Frequency(int[] arr, int n) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int maxFreq = Integer.MIN_VALUE;
    int minFreq = Integer.MAX_VALUE;
    int minelement = Integer.MAX_VALUE;
    int maxelement = Integer.MIN_VALUE;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int element = entry.getKey();
      int count = entry.getValue();

      if (count < minFreq) {
        minFreq = count;
        minelement = element;
      }

      if (count > maxFreq) {
        maxFreq = count;
        maxelement = element;
      }
    }

    return new int[] { maxelement, minelement };
  }

  public static void main(String[] args) {
    Find_Highest_Lowest_Frequency_Element fc = new Find_Highest_Lowest_Frequency_Element();
    int[] arr = { 10, 5, 10, 15, 10, 5 };
    fc.Frequency(arr, arr.length);
    int[] result = fc.Frequency(arr, arr.length);
    System.out.println(Arrays.toString(result));
  }

}
