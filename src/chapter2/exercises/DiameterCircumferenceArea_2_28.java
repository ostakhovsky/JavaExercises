package chapter2.exercises;
/*
Write an application that inputs from the user the radius of a circle as an integer and prints the circle’s diameter,
circumference and area using the floating-point value 3.14159 for π.
[Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than
the value 3.14159. Class Math is defined in package java.lang.
 Use the following formulas (r is the radius):
diameter=2r circumference=2πr area=πr2
Do not store the results of each calculation in a variable. Rather, specify each calculation as the value that will
 be output in a System.out.printf statement. The values produced by the circumference and area calculations are
 floating-point numbers. Such values can be output with the format specifier %f in a System.out.printf statement.
 */

import java.util.Scanner;


public class DiameterCircumferenceArea_2_28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float pi = 3.14159f;

    System.out.print("Enter the radius of a circle: ");
    float r = input.nextFloat();
    System.out.printf("Diameter: %f%nCircumference: %f%nArea: %f%n", 2 * r, 2 * pi * r, pi * Math.pow(r, 2));
    System.out.println();
    System.out.printf("Diameter: %f%nCircumference: %f%nArea: %f%n", 2 * r, 2 * Math.PI * r, Math.PI * Math.pow(r, 2));
  }
}
