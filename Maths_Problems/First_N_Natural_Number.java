package Maths_Problems;

public class First_N_Natural_Number {
  public static int num(int n) {
    if (n == 0)
      return 0;
    else if (n == 1)
      return 1;
    else {
      return n + num(n - 1);
    }
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(num(n));
  }
}
