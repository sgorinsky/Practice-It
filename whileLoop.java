/* 5.1: While Loops
Quick while loop practice */

public class whileLoop {
  public static void main(String[] args) {

    int x = 2;
    while (x < 200) {
      System.out.println(x);
      x*=x;
    }

    int i = 1;
    String word = "a";
    while  (word.length() < 10) {
      word = "b" + word + "b";
      System.out.println(i);
      i++;
    }

    int y = 100;
    while (y>0) {
      System.out.println(y);
      y=y/2;
    }
    System.out.print(250%3);
  }
}
