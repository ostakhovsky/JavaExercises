package chapter5.examples;
/*
Counts letter grades
 */

import java.util.Scanner;


public class LetterGrades {
  public static void main(String[] args) {
    int total = 0;            //sum of grades
    int gradeCounter = 0;     //number of grades
    int aCount = 0;           //count of A
    int bCount = 0;           //count of B
    int cCount = 0;           //count of C
    int dCount = 0;           //count of D
    int fCount = 0;           //count of F

    Scanner input = new Scanner(System.in);
    System.out.printf("%s%n%s%n%s%n %s%n", "Enter the integer grades in range 0-100",
        "Type the end-of-file indicator to terminate input:", "On UNIX/Mac OS X type <Ctrl>d then press Enter",
        "On Windows type <Ctrl>z then press Enter");
    while (input.hasNext()) {
      int grade = input.nextInt();     //real grade
      total += grade;                    //add gradev  to total
      ++gradeCounter;                  //increment numbers of grades
      switch ((grade / 10)) {
        case 9:                        //grade is between 90
        case 10:                       //and 100, inclusive
          ++aCount;
          break;
        case 8:                        //grade is between 80 and 89
          ++bCount;
          break;
        case 7:                        //grade is between 70 and 79
          ++cCount;
          break;
        case 6:                        //grade is between 60 and 69
          ++dCount;
          break;
        default:                        //grade is less then 60
          ++fCount;
          break;
      }
    }
    System.out.printf("%nGradeReport:%n");
    if (gradeCounter != 0) {
      double average = (double) total / gradeCounter;

      System.out.printf("Total of grades entered is %d%n", gradeCounter, total);
      System.out.printf("Class average is %.2f%n", average);
      System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade ", "A: ",
          aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
    } else {
      System.out.println("No grades were entered");
    }
  }
}
