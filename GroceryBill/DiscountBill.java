

public class DiscountBill extends GroceryBill {

  private int DiscountCount = 0;
  private double DiscountAmount = 0;
  private double DiscountPercent = 0;
  private boolean preferred;

  public DiscountBill(Employee clerk, boolean preferred) {
    super(clerk);

    this.preferred = preferred;


  }

  public void add(Item i) { //takes out discount for preferred customers
    super.add(i);

    if (i.getDiscount() > 0 && preferred == true) {
      DiscountCount++;
      DiscountAmount += i.getDiscount();
    }

  }

  public double getTotal() { //total with discount
    return super.getTotal() - DiscountAmount;
  }

  public int getDiscountCount() { //returns the number of discounted items, if any
    return DiscountCount;
  }

  public double getDiscountAmount() { //returns the total discount for list of items
    return DiscountAmount;
  }

  public double getDiscountPercent() { //discount as a fraction of total cost
    return (DiscountAmount/super.getTotal() * 100);
  }
}
