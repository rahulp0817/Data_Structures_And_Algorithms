package Patterns;

public class pattern_22 {
  public static void main(String[] args) {
    for (int i = 0; i < 2 * 4 - 1; i++) { // 2n-1
      for (int j = 0; j < 2 * 4 - 1; j++) {
        int top = i;
        int left = j;
        int right = (2 * 4 - 2) - j; // 2n-2-j
        int bottom = (2 * 4 - 2) - i; // 2n-2-i
        System.out.print(4 - Math.min(Math.min(top, bottom), Math.min(left, right)));
      }
      System.out.println();
    }
  }
}

// Output:
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444