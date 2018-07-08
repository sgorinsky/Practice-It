/* 3.10: printStrings
Strings in a method will repeat a specified number of times
*/

public class printStrings {

  public static void main(String[] args) {

    printStrings("abc", 5);

  }

  public static void printStrings(String string, int repeats) {

    for (int i=0; i< repeats; i++) {

      System.out.print(string);

    }

  }

}
