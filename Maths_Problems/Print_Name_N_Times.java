package Maths_Problems;

public class Print_Name_N_Times {
  public void printName(String name, int count, int N) {
    if (count == N)
      return;
    System.out.println(name);
    printName(name, count + 1, N);
  }

  public static void main(String[] args) {
    Print_Name_N_Times sol = new Print_Name_N_Times();
    int N = 5;
    String name = "Ashish";

    sol.printName(name, 0, N);
  }
}
