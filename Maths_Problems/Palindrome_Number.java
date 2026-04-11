package Maths_Problems;

public class Palindrome_Number {
  public static void main(String[] args) {
    int n = 121;
    int temp = n;
    int reversed = 0;
    while (n > 0) {
      int digit = n % 10;
      n /= 10;
      reversed = reversed * 10 + digit;
    }

    if (reversed == temp) {
      System.out.println("It is Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
