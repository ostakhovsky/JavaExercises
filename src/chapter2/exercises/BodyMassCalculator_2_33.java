package chapter2.exercises;
/*
2.33 Create a BMI calculator that reads the user’s weight in pounds and height in inches
(or, if you prefer, the user’s weight in kilograms and height in meters),
then calculates and displays the user’s body mass index.
Also, display the BMI categories and their values from the National Heart Lung and Blood Institute
 */

import java.util.Scanner;


public class BodyMassCalculator_2_33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter weight in kilograms");
    double weight = input.nextDouble();
    System.out.println("Enter height in meters");
    double height = input.nextDouble();

    double bmi = weight / (height * height);
    System.out.printf("BMI: %f ",bmi);
    if (bmi < 18.5) {
      System.out.print(" Underweight\n");
    } else if (bmi >=18.5 && bmi < 24.9){
      System.out.print(" Normal weight\n");
    }  else if (bmi >= 24.9 && bmi < 29.9) {
      System.out.print(" Overweight\n");
    } else {
      System.out.println("Obesity");
    }
  }
}
