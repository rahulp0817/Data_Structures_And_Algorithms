package Maths_Problems;

public class Count_Digits {
  public static void main(String[] args) {
    int n = 12345;
    int cnt = 0;
    while (n > 0) {
      cnt += 1;
      n /= 10;
    }
    System.out.println(cnt);
  }
}
