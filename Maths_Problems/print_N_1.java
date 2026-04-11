package Maths_Problems;

public class print_N_1 {
  public void printNumbers(int current) {
    if (current < 1) {
      return;
    }

    System.out.println(current);

    printNumbers(current - 1);
  }

  public static void main(String[] args) {
    print_N_1 sol = new print_N_1();
    int n = 10;

    sol.printNumbers(n);
    System.out.println();
  }
}
