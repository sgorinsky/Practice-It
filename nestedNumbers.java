/* 2.12: nestedNumbers
Creates 3 lines of triplets from 1-9 */

public class nestedNumbers {

  public static void main(String[] args) {
    nestedNumbers();
  }

  public static void nestedNumbers() {
    for (int i = 1; i <=3; i++) {

      for (int j = 1; j <= 9; j++) {

        for (int k = 1; k<=3; k++) {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
