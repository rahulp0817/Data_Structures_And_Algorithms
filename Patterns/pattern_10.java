package Patterns;

public class pattern_10 {
  public static void main(String[] args) {
    for (int i = 1; i <= 2 * 5 - 1; i++) { // 2n-1
      int starts = i;
      if (i > 5)
        starts = 2 * 5 - i; // 2n-i
      for (int j = 1; j <= starts; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

// Output:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
