package Patterns;

public class pattern_15 {
  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      for (char ch = 'A'; ch <= 'A' + 5 - i; ch++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}

// Output:
// ABCDEF
// ABCDE
// ABCD
// ABC
// AB
// A