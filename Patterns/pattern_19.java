package Patterns;

public class pattern_19 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) { // star
        System.out.print("*");
      }
      for (int j = 0; j < 2 * i; j++) { // space
        System.out.print(" ");
      }
      for (int j = 0; j < 5 - i; j++) { // star
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) { // star
        System.out.print("*");
      }
      for (int j = 0; j < 2 * (5 - i - 1); j++) { // space
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) { // star
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


// Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********