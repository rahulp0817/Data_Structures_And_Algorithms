package Maths_Problems;

public class Print_1_N {
  public void printNumbers(int current, int n) {
    if (current > n) {
      return;
    }
    System.out.println(current);

    printNumbers(current + 1, n);
  }

  public static void main(String[] args) {
    Print_1_N sol = new Print_1_N();
    int n = 10;

    sol.printNumbers(1, n);
    System.out.println();
  }
}
