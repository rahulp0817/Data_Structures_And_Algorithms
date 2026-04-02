package Patterns;

public class pattern_17 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      // spaces
      for (int j = 0; j <= 5 - i - 1; j++) {
        System.out.print(" ");
      }
      // char
      char ch = (char) ('A');
      int breakpoint = (2 * i + 1) / 2; // middle
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print(ch);
        if (j < breakpoint)
          ch++;
        else
          ch--;
      }
      // spaces
      for (int j = 0; j <= 5 - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}


// Output:
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA