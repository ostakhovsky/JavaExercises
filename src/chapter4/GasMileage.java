package chapter4;
/*
ex. 4.17
 */

import java.util.Scanner;

public class GasMileage {
  private  int milesTotal;
  private int gallonsTotal;

  public GasMileage(){
    milesTotal = 0;
    gallonsTotal = 0;
  }
  public void addTrip(int miles, int gallons){
    milesTotal += miles;
    gallonsTotal += gallons;
    System.out.println("Trip mpg: " +  (double) miles / gallons);
  }


  public double getaverageMpg(){
    return (double) milesTotal / gallonsTotal;
  }

  public static void main(String[] args) {
    GasMileage gasMileage = new GasMileage();
    Scanner scanner = new Scanner(System.in);
    int miles;
    int gallons;
    String ans = "y";

    while (ans.equals("y")){
      System.out.println("Enter miles driven: ");
      miles = scanner.nextInt();
      System.out.println("Enter gallon used: ");
      gallons = scanner.nextInt();
      gasMileage.addTrip(miles,gallons);

      System.out.println("Next trip? y/n");
      ans = scanner.next();

    }
    System.out.println("Average mpg: " + gasMileage.getaverageMpg());
  }

}
