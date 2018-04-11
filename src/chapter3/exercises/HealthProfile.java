package chapter3.exercises;
/*
3.17 (Computerization of Health Records)
The class attributes should include the person’s first name, last name, gender, date of birth
 (consisting of separate attributes for the month, day and year of birth), height (in inches)
 and weight (in pounds). Your class should have a constructor that receives this data.
 For each attribute, provide set and get methods. The class also should include methods
 that calculate and return the user’s age in years, maximum heart rate and target-heart-rate range
 (see Exercise 3.16 ), and body mass index (BMI; see Exercise 2.33 ). Write a Java app that prompts for
  the person’s information, instantiates an object of class HealthProfile for that person and prints the
  information from that object—including the person’s first name, last name, gender, date of birth, height
   and weight—then calculates and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate
  range. It should also display the BMI values chart from Exercise 2.33 .
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class HealthProfile {
  private String firstName;
  private String lastName;
  private String gender;
  private LocalDate dob;
  double height;
  double weight;

  public HealthProfile(String firstName, String lastName, String gender, LocalDate dob, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dob = dob;
    this.height = height;
    this.weight = weight;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getAge() {
    return Period.between(dob, LocalDate.now()).getYears();
  }

  public int getMaximumHeartRate() {
    return 220 - getAge();
  }

  public double getBmi() {
    return getWeight() / (getHeight() * getHeight());
  }

  public void displayBmiChart() {
    System.out.println("If BMI<18.5 -  Underweight");
    System.out.println("If 18.5 <= BMI < 24.9 Normal weight");
    System.out.println("If 25 <= BMI < 29.9 Overweight");
    System.out.println("If BMI >30 - Obesity");
  }

  public int[] getTargetHeartRate() {
    int maximumHeartRate = getMaximumHeartRate();
    return new int[]{(int) (0.5 * maximumHeartRate), (int) (0.85 * maximumHeartRate)};
  }

  public void displayRates() {
    System.out.printf("First name: %s last name: %s date of birth: %s%n", getFirstName(), getLastName(),
        getDob().toString());
    System.out.printf("Age: %d%nMaximum heart rate: %d%nTarget heart rate: from %d to %d%n", getAge(),
        getMaximumHeartRate(), getTargetHeartRate()[0], getTargetHeartRate()[1]);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first name: ");
    String fName = input.next();
    System.out.println("Enter last name: ");
    String lName = input.next();
    System.out.println("Enter gender m/f");
    String gender = input.next();
    System.out.println("Enter date of birth. Year:");
    int year = input.nextInt();
    System.out.println("month: ");
    int month = input.nextInt();
    System.out.println("day: ");
    int day = input.nextInt();
    System.out.println("Enter height in meters: ");
    double height = input.nextDouble();
    System.out.println("Enter weight in kilograms: ");
    double weight = input.nextDouble();

    HealthProfile person = new HealthProfile(fName, lName, gender, LocalDate.of(year, month, day), height, weight);
    System.out.println("Health profile");
    System.out.printf("First name: %s%nLast name: %s%nGender: %s%n", person.getFirstName(), person.getLastName(),
        person.getGender());
    System.out.printf("Date of birth: %s%n", person.getDob().toString());
    System.out.printf("Age: %d",person.getAge());
    System.out.printf("Height: %.2f%nWeight: %.2f%nBMI: %.2f", person.getHeight(), person.getWeight(), person.getBmi());
    person.displayBmiChart();
    System.out.println();
    person.displayRates();
  }
}
