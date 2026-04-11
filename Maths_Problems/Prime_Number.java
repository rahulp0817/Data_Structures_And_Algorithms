package Maths_Problems;

public class Prime_Number {
  public static void main(String[] args) {
    int n = 29;
    if (n <= 1) {
      System.out.println("Not Prime");
      return;
    }
    for (int i = 2; i * i <= n; i++) { // for(int i = 2; i <= Math.sqrt(n); i++) -> slow approach
      if (n % i == 0) {
        System.out.println("Not Prime");
        return;
      }
    }
    System.out.println("Prime");
  }
}

// Time Complexity: O(sqrt(n))

// why Sqrt(n) ?
// large number like n = 36 then i = 6, it will become square root of it..

// prime numbers: It has factor of 2 and itself only.