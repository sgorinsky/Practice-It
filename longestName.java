/* 4.11: longestName
User enters name and program chooses name with longest letters and keeps
only the first letter capitalized
Currently, it doesn't work. */

import java.util.Scanner;
import org.apache.commons.lang.StringUtils;

public class longestName {

  public static void main(String[] arg) {
    longestName(console, 5);
  }

  public static void longestName(Scanner console, int names) {
    Scanner console = new Scanner(System.in);
    for (i = 1; i <= names; i++) {
      System.out.println("name#" +i +"?");
      String newName = console.nextString();
      newName.toLowerCase();
      StringUtils.capitalize(newName);
    }
  }

}
