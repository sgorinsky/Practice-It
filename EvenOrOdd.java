import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    EvenOrOdd();
    daysInMonth();
  }

  public static void EvenOrOdd() {
    Scanner console = new Scanner(System.in);
    System.out.println("Type a number: ");
    int number = console.nextInt();
    if (number % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
