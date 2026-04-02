package Patterns;

public class pattern_20 {
  public static void main(String[] args) {
    int spaces = 2 * 5 - 2; // 2*n-2
    for (int i = 1; i <= 2 * 5 - 1; i++) { // 2*n-1
      int stars = i; // i+1
      if (i > 5)
        stars = 2 * 5 - i; // 2*n-i
      // stars
      for (int j = 1; j <= stars; j++) { // stars
        System.out.print("*");
      }
      // spaces
      for (int j = 1; j <= spaces; j++) { // stars
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= stars; j++) { // stars
        System.out.print("*");
      }
      System.out.println();
      if (i < 5)
        spaces -= 2; // spaces-2
      else
        spaces += 2; // spaces+2
    }
  }
}

// Output:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *