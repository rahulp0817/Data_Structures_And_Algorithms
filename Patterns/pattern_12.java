package Patterns;

public class pattern_12 {
  public static void main(String[] args) {
    int space = 2 * (5 - 1); // first space
    for (int i = 1; i <= 5; i++) {
      // numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // space
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      // numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
      space -= 2; // all space after the first
    }
  }
}


// output:
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321