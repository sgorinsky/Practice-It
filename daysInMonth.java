import java.util.Scanner;

public class daysInMonth {

  public static void main(String[] args) {
    daysInMonth();
  }

  public static void daysInMonth() {
  Scanner console = new Scanner(System.in);
  System.out.println("Please choose a number between 1 and 12: ");
  int month = console.nextInt();
  if (month < 1 || month > 12) {
      System.out.println("Not between 1 and 12.");
    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      System.out.println(31);
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      System.out.print(30);
    } else {
      System.out.print(28);
    }
  }
}
