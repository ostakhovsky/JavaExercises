package chapter2.examples;

/* Fig. 2.7: Addition_2_7.java
 Addition_2_7 program that inputs two numbers then displays their sum.
 */

import java.util.Scanner;


public class Addition_2_7 {

  public static void main(String[] args) {
    // create a Scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: "); // prompt
    int number1 = input.nextInt(); // read first number from user
    System.out.print("Enter second integer: "); // prompt
    int number2 = input.nextInt(); // read second number from user
    int sum = number1 + number2; // add numbers, then store total in sum
    System.out.printf("Sum is %d%n", sum); // display sum
  }
}