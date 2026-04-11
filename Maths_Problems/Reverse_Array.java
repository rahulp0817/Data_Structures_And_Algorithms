package Maths_Problems;

import java.util.Arrays;

public class Reverse_Array {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 4, 5 };

    int p0 = 0;
    int p1 = arr.length - 1;

    while (p0 < p1) {
      int temp = arr[p0];
      arr[p0] = arr[p1];
      arr[p1] = temp;
      p0++;
      p1--;
    }
    System.out.println(Arrays.toString(arr));
  }
}

// can use colllections.reverse(arr) method as well for reverse array list.

// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Integer[] arr = {1, 2, 3, 4, 5};

//         List<Integer> list = Arrays.asList(arr);
//         Collections.reverse(list);

//         System.out.println(list);
//     }
// }