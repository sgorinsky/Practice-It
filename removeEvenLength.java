// 10.3: removeEvenLength
//removes strings of even length
import java.util.*;

public class removeEvenLength {

  public static void main(String[] args) {

    ArrayList<String> strings = new ArrayList<String>();

    strings.add("Did");
    strings.add("you");
    strings.add("solve");
    strings.add("it");
    strings.add("or");
    strings.add("what?");

    System.out.println(strings);
    removeEvenLength(strings);

  }
  public static void removeEvenLength(ArrayList<String> list) {

    for (int i = 0; i < list.size(); i++) { //ArrayList automatically resizes when you remove an entry
      if (list.get(i).length() % 2 == 0) {
        list.remove(i);
        i--; //therefore, you have to reduce the iterator since all entries shift left 
      }
    }
    System.out.println(list);
  }
}
