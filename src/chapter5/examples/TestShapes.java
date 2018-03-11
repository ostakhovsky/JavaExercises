package chapter5.examples;
/*
Fig. 5.27
 */

import javax.swing.*;


public class TestShapes {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");
    int choice = Integer.parseInt(input);
    Shapes panel = new Shapes(choice);
    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(300, 300);
    application.setVisible(true);
  }
}