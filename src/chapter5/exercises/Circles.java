package chapter5.exercises;
/*
Ex. 5.1
 */

import java.awt.*;
import javax.swing.*;


public class Circles extends JPanel {

  private int[] center;

  public Circles(int[] center) {
    this.center = center;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int i = 0; i < 12; i++) {
      g.drawOval(center[0] - i * 10 / 2, center[1] - i * 10 / 2, 10 + i * 10, 10 + i * 10);
    }
  }
}

