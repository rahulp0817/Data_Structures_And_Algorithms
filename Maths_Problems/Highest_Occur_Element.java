package Maths_Problems;

import java.util.HashMap;

public class Highest_Occur_Element {
  public static void main(String[] args) {

    Integer[] arr = { 10, 2, 10, 2, 5, 6, 2 };
    int maxFreq = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
      maxFreq = Math.max(maxFreq, map.get(num));
    }
    System.out.println(map + "" + maxFreq);
  }
}
