import java.util.*;
public class Bill {

  public static void main(String[] args) {

    Employee sam = new Employee("Sam");

    Item vinegar = new Item("vinegar", 20.00, 4.00);
    Item juice = new Item("juice", 4, 1);
    Item carrots = new Item("carrots", 5);

    GroceryBill grocery = new GroceryBill(sam);
    DiscountBill discount = new DiscountBill(sam, true);

    discount.add(vinegar);
    discount.add(carrots);
    discount.add(juice);

    grocery.add(vinegar);
    grocery.add(carrots);
    grocery.add(juice);

    System.out.println("total: $" + grocery.getTotal() + "; after discount: $" + discount.getTotal() + "; " + discount.getDiscountCount() + " discount(s): $" +
    discount.getDiscountAmount() + ", " + String.format("%.4g%n", discount.getDiscountPercent()) + "% discounted off total");


  }
}
