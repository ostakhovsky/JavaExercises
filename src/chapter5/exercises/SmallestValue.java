package chapter5.exercises;

import java.util.Scanner;

/**
 * ex. 5.11
 * Find the smallest value of several integers.The first value is number of integers.
 */

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp < min) {
                min = temp;
            }
        }

        System.out.println("Smallest value is: " + min);
    }
}
