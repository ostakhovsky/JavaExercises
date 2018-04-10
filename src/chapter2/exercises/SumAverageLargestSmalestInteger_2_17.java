package chapter2.exercises;

import java.util.Scanner;
/*
Write an application that inputs three integers from the user and displays
the sum, average, product, smallest and largest of the numbers.
[Note: The calculation of the average in this exercise should result in an integer representation of the average.
So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 */

public class SumAverageLargestSmalestInteger_2_17 {

  public static void main(String[] args) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Scanner _scanner = new Scanner(System.in);
    int sum = 0;

    System.out.println("Enter 3 integers:");
    for (int i = 0; i < 3; i++) {
      int current = _scanner.nextInt();
      sum += current;
      if (current > max) {
        max = current;
      }
      if (current < min) {
        min = current;
      }
    }
    System.out.printf("Sum: %d,%naverage %d,%nminimum: %d,%nmaximum: %d", sum, sum / 3, min, max);
  }
}
