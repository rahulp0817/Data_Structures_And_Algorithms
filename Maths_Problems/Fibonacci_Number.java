package Maths_Problems;

public class Fibonacci_Number {
  public static int fibonacci(int n) {
    // noraml approach

    // if (n == 0) return 0;
    // else if (n == 1) return 1;
    // else {
    // return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    // better approach

    if (n <= 1)
      return n;

    int last = fibonacci(n - 1);
    int secondLast = fibonacci(n - 2);

    return last + secondLast;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(fibonacci(n));
  }
}
