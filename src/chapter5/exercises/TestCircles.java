package chapter5.exercises;
/*
Ex. 5.1
 */

import javax.swing.*;


public class TestCircles {
  public static void main(String[] args) {
    int hight = 300;
    Circles panel = new Circles(new int[]{hight / 2, hight / 2});
    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(hight, hight);
    application.setVisible(true);
  }
}
