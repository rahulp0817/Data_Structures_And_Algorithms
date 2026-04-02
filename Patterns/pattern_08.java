package Patterns;

public class pattern_08 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) { // space
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) { // star 2n-(2i+1)
        System.out.print("*");
      }
      for (int j = 0; j < i; j++) { // space
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}

// Output:
// *********
//  *******
//   *****
//    ***
//     *
