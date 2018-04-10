package chapter2.exercises;
/*
2.27
Write an application that displays a checkerboard
 */

public class CheckerBoard_2_27 {

  public static void main(String[] args) {
    String line1 = "* * * * * * * * ";
    String line2 = " * * * * * * * *";

    for (int i = 0; i < 4; i++) {
      System.out.println(line1);
      System.out.println(line2);
    }
  }
}
