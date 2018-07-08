// 10.8: maxLength
// returns the length of the longest string in the list. If your method is passed an empty list
// it should return 0.
import java.util.*;

public class maxLength {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();

    list.add("Did");
    list.add("you");
    list.add("solve");
    list.add("it");
    list.add("or");
    list.add("what?");

    System.out.println(maxLength(list)); // returns 5

    ArrayList<String> empty = new ArrayList<String>();
    System.out.println(maxLength(empty)); //return 0
  }

  public static int maxLength(ArrayList<String> list) {
    String hold = "";

    if (list.size() < 0) return 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).length() > hold.length()) {
        hold = list.get(i);
      }
    }
    return hold.length();
  }
}
