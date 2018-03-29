package chapter6.exercises;
/*
“6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three hours.
 The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
  The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time.
  Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday.
  You should enter the hours parked for each customer. The program should display the charge for the current customer and
  should calculate and display the running total of yesterday’s receipts. It should use the method calculateCharges
   to determine the charge for each customer.”
 */

import java.util.Scanner;


public class ParkingCharges {
  private static final double MIN_FEE_PER_HOUR = 2.0;
  private static final double EXTRA_FEE_PER_HOUR = 0.5;
  private static final double MAX_CHARGE = 10.0;
  private static final double MIN_HOURS = 3.0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double total = 0;
    System.out.printf("%s%n%s%n%s%n %s%n", "Enter the double hours for each customer parked yesterday",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Mac OS X type <Ctrl>d then press Enter",
        "On Windows type <Ctrl>z then press Enter");
    while (input.hasNext()) {
      double hours = input.nextDouble();
      double charge = calculateCharges(hours);
      total += charge;
    }
  }

  static double calculateCharges(double hours) {
    double charge = MIN_FEE_PER_HOUR * hours;
    if (hours > MIN_HOURS) {
      charge += EXTRA_FEE_PER_HOUR * (hours - MIN_HOURS);
    }
    if (charge > MAX_CHARGE) {
      charge = MAX_CHARGE;
    }
    return charge;
  }
}
