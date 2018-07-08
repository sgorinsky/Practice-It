/* 2.06: numberedTriangle
Creates a triangle of 7 rows with each row index having the corresponding
number of entries */

public class numberTriangle {

  public static void main(String[] args) {
    numberTriangle();
  }

  public static void numberTriangle() {
    for (int i=1; i<=7; i++) {
      for (int j=0; j<i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
