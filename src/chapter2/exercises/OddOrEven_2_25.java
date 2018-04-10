package chapter2.exercises;

import java.util.Scanner;

/*
2.25 Application reads an integer and determines if it's odd or even
 */

public class OddOrEven_2_25 {

  public static void main(String[] args) {
    Scanner _scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    int current = _scanner.nextInt();

    if (current % 2 == 0) {
      System.out.printf("Number %d is even", current);
    } else {
      System.out.printf("Number %d is odd", current);
    }
  }
}
