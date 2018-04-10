package chapter2.exercises;
/*
2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints
their sum, product, difference and quotient (division). Use the techniques shown in Fig. 2.7 .
 */

import java.util.Scanner;


public class Arithmetic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int a = scanner.nextInt();
    System.out.print("Enter second integer: ");
    int b = scanner.nextInt();
    System.out.printf("%d +  %d = %d%n", a, b, a + b);
    System.out.printf("%d *  %d = %d%n", a, b, a * b);
    System.out.printf("%d -  %d = %d%n", a, b, a - b);
    System.out.printf("%d /  %d = %d%n", a, b, a / b);
  }
}
