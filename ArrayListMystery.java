//10.16, 10.17: ArrayListMystery
import java.util.*;

public class ArrayListMystery {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(-1);
    list.add(3);
    list.add(28);
    list.add(17);
    list.add(9);
    list.add(33);

    mystery2(list); //[33, 28, 33, -1, 3, 28, 17, 9, 33, 17, -1, 33]


  }

  public static void mystery2(ArrayList<Integer> numbers) {

    for (int i = numbers.size()-1; i >= 0; i--) {
      if (i%2 == 0) {
        numbers.add(numbers.get(i));
      } else {
        numbers.add(0, numbers.get(i));
      }

    }
    System.out.println(numbers);
  }

  public static void mystery3(ArrayList<Integer> list) {
    for (int i = list.size() - 2; i>0; i--) {
      int a = list.get(i);
      int b = list.get(i+1);
      list.set(i, a + b);
    }
    System.out.println(list);
  }



}
