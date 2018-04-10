package chapter2.exercises;
/*
2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits
from the user, separates the number into its individual digits and prints the digits separated from one another
by three spaces each. For example, if the user types in the number 42339, the program should print
4 2 3 3 9
Assume that the user enters the correct number of digits. What happens when you enter a number with more
than five digits? What happens when you enter a number with fewer than five digits? [Hint: It’s possible to do this
exercise with the techniques you learned in this chapter. You’ll need to use both division and remainder operations
to “pick off ” each digit.]
 */

import java.util.Scanner;


public class SeparatingDigitsAnIntegers_2_30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 5 digits number:");
    int number = input.nextInt();
    int divider = 10000;
    if (number / divider > 10 || number / divider == 0) {
      System.out.println("Incorrect number of digits");
    } else {
      for (int d = 10000; d > 0; d /= 10) {
        System.out.print(number / d + "   ");
        number = number % d;
      }
    }
  }
}
