package chapter4;
/*
ex. 4.30
Application reads  in a five-digit interger and determines whether it's palindrom;
If number is not a five digit long, displays error message and allows to enter another value
 */

import java.util.Scanner;


public class Palindrom {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    String number;

    do {
      System.out.println("Enter five-digit number: ");
      num = scanner.nextInt();
      number = Integer.toString(num);
    } while (number.length() != 5);

    System.out.println(isPalindrom(number));
  }

  private static boolean isPalindrom(String number) {

    for (int i = 0; i < number.length() / 2; i++) {

      if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
