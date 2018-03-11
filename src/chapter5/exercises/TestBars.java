package chapter5.exercises;
/*
Ex. 5.1
 */

import javax.swing.*;


public class TestBars {
  public static void main(String[] args) {


    for (int i = 0; i < 5; i++) {
      String input = JOptionPane.showInputDialog("Enter a number ");
      int choice = Integer.parseInt(input);
      Bars panel = new Bars(choice);
      JFrame application = new JFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(300, 300);
      application.setVisible(true);
    }
  }
}
