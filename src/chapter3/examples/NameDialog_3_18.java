package chapter3.examples;

import javax.swing.*;
/*
Fig. 3.18
 */

public class NameDialog_3_18 {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?");
    String message = String.format("Welcome, %s, to Java Programming!", name);
    JOptionPane.showMessageDialog(null, message);
  }
}
