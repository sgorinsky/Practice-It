//Scanner

import java.util.Scanner;

public class ScannerTokensDouble {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How much money do you have? ");
    double money = console.nextDouble();
    System.out.print("I have this much money in java speak: " + money);
  }
}
