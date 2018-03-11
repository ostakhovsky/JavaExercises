package chapter5.examples;
/*
Fig. 5.13
 */

public class BreakTest {
  public static void main(String[] args) {
    int count;
    for (count = 1; count <= 10; count++) {
      if (count == 5) {
        break;
      }
      System.out.printf("%d ", count);
    }
  }
}


