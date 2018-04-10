package chapter2.exercises;

import java.util.Scanner;
/*
Write an application that reads five integers and determines and prints the largest and smallest integers in the group
 */

public class LargestSmallestInteger_2_24 {

  public static void main(String[] args) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Scanner _scanner = new Scanner(System.in);
    int number = 5;

    System.out.println("Enter " + number + " integers:");
    for (int i = 0; i < number; i++) {
      int current = _scanner.nextInt();
      if (current > max) {
        max = current;
      }
      if (current < min) {
        min = current;
      }
    }
    System.out.printf("Minimum: %d,%nMaximum: %d", min, max);
  }
}
