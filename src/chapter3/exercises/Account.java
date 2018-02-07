package chapter3.exercises;
/*
ex. 3.12
 */

public class Account {
  private String name;
  private double balance;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Account(String name, double balance) {
    this.name = name;
    if (balance > 0) {
      this.balance = balance;
    }
  }

  public void deposit(double depositAmout) {
    if (depositAmout > 0) {
      balance += depositAmout;
    }
  }

  public void withdraw(double amount){
    if (amount > balance){
      System.out.println("Withdrawal amount exceeded account balance.");
    } else{
      balance -= amount;
    }
  }
  public static  void displayAccount(Account account){
    System.out.println("Name: " + account.name + " balance: " + account.balance);
  }
}
