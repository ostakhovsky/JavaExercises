package chapter5.exercises;
/*
Ex.5.2
“5.16 (Bar Chart Printing Program) One interesting application of computers is to display graphs and bar charts.
 Write an application that reads five numbers between 1 and 30.
  For each number that’s read, your program should display the same number of adjacent asterisks.
  For example, if your program reads the number 7, it should display *******.
  Display the bars of asterisks after you read all five numbers.”

Excerpt From: Paul Deitel. “Java™ How To Program (Early Objects), Tenth Edition.” iBooks.
 */

import java.awt.*;
import javax.swing.*;


public class Bars extends JPanel {

    private int length;

    public Bars(int length){
      this.length = length;
    }

    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      for (int i = 0; i < 12; i++) {
        g.drawRect(10,  10 , length, 10);
      }
    }
}
