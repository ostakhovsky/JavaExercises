package chapter2.exercises;
/*
2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and prints
 the number of negative numbers input, the number of positive numbers input and the number of zeros input.
 */

import java.util.Scanner;


public class NegativePositiveZeroValues_2_32 {
  public static void main(String[] args) {
    int negative = 0;
    int positive = 0;
    int zero = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 5 numbers:");
    for (int i = 0; i < 5; i++) {
      int current = input.nextInt();
      if (current > 0) {
        positive++;
      } else if (current == 0) {
        zero++;
      } else {
        negative++;
      }
    }
    System.out.printf("Number of positive numbers: %d%nNumber of negative numbers: %d%nNumber of zeros: %d%n", positive,
        negative, zero);
  }
}
