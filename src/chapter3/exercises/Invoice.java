package chapter3.exercises;
/*
ex. 3.13
 */

public class Invoice {
  private String partNumber;
  private String partDescription;
  int quantity;
  double price;

  public String getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  public String getPartDescription() {
    return partDescription;
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Invoice(String partNumber, String partDescription, int quantity, double price) {
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantity = quantity;
    this.price = price;
  }

  public double getInvoiceAmount() {
    if (quantity <= 0) {
      return 0;
    } else {
      if (price <= 0) {
        return 0.0;
      } else {
        return quantity * price;
      }
    }
  }
}
