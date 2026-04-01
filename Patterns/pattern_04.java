package Patterns;

public class pattern_04 {
  public static void main(String[] args){
    for (int i = 0; i <= 6; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}


// Output:
// 0
// 11
// 222
// 3333
// 44444
// 555555
