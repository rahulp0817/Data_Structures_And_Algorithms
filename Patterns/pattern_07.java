package Patterns;

public class pattern_07 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i - 1; j++) { // space
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) { // star
        System.out.print("*");
      }
      for (int j = 0; j < 5 - i - 1; j++) { // space
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}

// Output:
//     *
//    ***
//   *****
//  *******
// *********