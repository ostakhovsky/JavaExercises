package chapter2.exercises;
/*
2.34 (World Population Growth Calculator) Search the Internet to determine the current world population
and the annual world population growth rate. Write an application that inputs these values,
then displays the estimated world population after one, two, three, four and five years.
 */

import java.util.Scanner;


public class WorldPopulationGrowth_2_34 {
  public static void main(String[] args) {
    long current;
    double annualGrowthRate;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter current world population:");
    current = input.nextLong();
    System.out.println("Enter annual growth rate(%):");
    annualGrowthRate = input.nextDouble();

    System.out.println("Estimated world population:");

    for (int i = 1; i < 6; i++) {
      System.out.printf("after %d year: %d%n", i, current *= annualGrowthRate / 100 + 1);
    }
  }
}
