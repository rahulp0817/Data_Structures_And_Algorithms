package Maths_Problems;

import java.util.HashMap;

public class Freq_of_element {
  public static void main(String[] args) {

    Integer[] arr = { 10, 2, 10, 2, 5, 6, 2 };

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      // if (map.containsKey(num)) {
      // map.put(num, map.get(num) + 1);
      map.put(num, map.getOrDefault(num, 0) + 1);
      // } else {
      // map.put(num, 1);
      // }
    }
    System.out.println(map);
  }
}
