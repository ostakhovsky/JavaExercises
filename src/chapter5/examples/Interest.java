package chapter5.examples;
/*
Fig. 5.6
Compound-interest calculations with for.
 */

public class Interest {
  public static void main(String[] args) {
    double amount;                //amount on deposit each year
    double principal = 1000.0;    //initial amount before interest
    double rate = 0.05;           //interest rate

    System.out.printf("%s %20s", "Year", "Amount on deposit%n");
    //calculate amount on deposit for each year of 10 years
    for (int year = 1; year <= 10; year++) {
      amount = principal * Math.pow(1.0 + rate, year);
      System.out.printf("%4d%,20.2f%n", year, amount);
    }
  }
}
