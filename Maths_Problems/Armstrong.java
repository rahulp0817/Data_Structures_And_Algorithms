package Maths_Problems;

// if the sum of the cubes of the digits of a number is equal to the number itself, then it is called an Armstrong number. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

// if user input asked
import java.util.Scanner;

class Armstrong {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int temp = n;
    int val = 0;

    // Step 1: count digits
    int digits = String.valueOf(n).length();

    // Step 2: process digits
    while (n > 0) {
      int digit = n % 10;
      val += (int) Math.pow(digit, digits);
      n /= 10;
    }

    // Step 3: check
    if (val == temp) {
      System.out.println("It is Armstrong");
    } else {
      System.out.println("It is Not Armstrong");
    }
    sc.close();
  }
}

// if number given

// public class Armstrong {
//    public static void main(String[] args) {
//         int n = 1634;
//         int temp = n;
//         int val = 0;
//         while(n > 0){
//             int digit =  n % 10;
//             val = val + (digit * digit * digit * digit);
//             n /= 10;
//         }
//         if (val == temp) {
//             System.out.println("it is Armstrong");
//         } else {
//             System.out.println("it is Not Armstrong");
//         }
        
//     }
// }
