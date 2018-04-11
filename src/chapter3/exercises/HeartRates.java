package chapter3.exercises;
/*
3.16 (Target-Heart-Rate Calculator) formula for calculating your maximum heart rate in beats per minute is
220 minus your age in years.

Your target heart rate is a range that’s 50–85% of your maximum heart rate.
[Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health,
fitness and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should include
the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year
of birth).


a method that calculates and returns the person’s maximum heart rate

and a method that calculates and returns
the person’s target heart rate. Write a Java app that prompts for the person’s information, instantiates an object
of class HeartRates and prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.
 */

import java.time.LocalDate;
import java.time.Period;


public class HeartRates {
  private String firstName;
  private String lastName;
  private LocalDate dob;

  public HeartRates(String firstName, String lastName, LocalDate dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
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

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public int getAge() {
    return Period.between( dob,LocalDate.now()).getYears();
  }

  public int getMaximumHeartRate() {
    return 220 - getAge();
  }

  public int[] getTargetHeartRate() {
    int maximumHeartRate = getMaximumHeartRate();
    return new int[]{(int) (0.5 * maximumHeartRate), (int) (0.85 * maximumHeartRate)};
  }

  public static void main(String[] args) {
    HeartRates rates = new HeartRates("John", "Doe", LocalDate.of(1980, 10, 3));
    rates.displayRates();
  }

  public void displayRates() {
    System.out.printf("First name: %s last name: %s date of birth: %s%n", getFirstName(), getLastName(),
        getDob().toString());
    System.out.printf("Age: %d%nMaximum heart rate: %d%nTarget heart rate: from %d to %d%n", getAge(),getMaximumHeartRate(),
        getTargetHeartRate()[0], getTargetHeartRate()[1]);
  }
}
