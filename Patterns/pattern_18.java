package Patterns;

public class pattern_18 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}

// Output:
// E
// DE
// CDE
// BCDE
// ABCDE