package chapter5.examples;
/*
Fig. 5.27
Drawing a cascade of shapes based on user's choice
 */

import java.awt.*;
import javax.swing.*;


public class Shapes extends JPanel {
  private int choice;

  public Shapes(int userChoice) {
    choice = userChoice;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int i = 0; i < 10; i++) {
      switch (choice) {
        case 1:                              //draw rectangles
          g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
        case 2:
          g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
      }
    }
  }
}
