package chapter2.exercises;
/*
2.35 (Car-Pool Savings Calculator) Research several car-pooling websites.
Create an application that calculates your daily driving cost,
so that you can estimate how much money could be saved by car pooling,
which also has other advantages such as reducing carbon emissions and reducing traffic congestion.
The application should input the following information and display the user’s cost per day of driving
to work:
Total miles driven per day.
Cost per gallon of gasoline.
Average miles per gallon.
Parking fees per day.
Tolls per day.
 */

import java.util.Scanner;


public class CarPoolSavingsCalculator_2_35 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Total miles driven per day.");
    double miles = input.nextDouble();
    System.out.println("Cost per gallon of gasoline.");
    double gallonPrice = input.nextDouble();
    System.out.println("Average miles per gallon.");
    double mpg = input.nextDouble();
    System.out.println("Parking fees per day.");
    double parking = input.nextDouble();
    System.out.println("Tolls per day.");
    double toll = input.nextDouble();

    System.out.printf("Cost per day of driving to work: %f", miles / mpg * gallonPrice + parking + toll);
  }
}
