package chapter2.exercises;

import java.util.Scanner;

/*
2.8 Write Java statements that accomplish each of the following tasks:
Display the message "Enter an integer: ", leaving the cursor on the same line.
Assign the product of variables b and c to the int variable a.
Use a comment to state that a program performs a sample payroll calculation
 */

public class ex2_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int c = scanner.nextInt();
    System.out.print("Enter second integer: ");
    int b = scanner.nextInt();
    int a = c * b;
    System.out.printf("This is a simple payroll calculation.%nThe result: %d", a);
  }
}
