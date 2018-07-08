// 7.35: arrayMystery2d
import java.util.Arrays;
public class arrayMystery2d {

  public static void main(String[] args) {

    int[][] numbers = {
                       {3, 4, 5, 6},
                       {4, 5, 6, 7},
                       {5, 6, 7, 8}
                     };

    int a[][] = mystery2d(numbers);

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[0].length; j++) {
        System.out.println("a[" + i + "]" + "[" + j+ "] = " + a[i][j]);
      }
    }
  }

  public static int[][] mystery2d(int[][] a) {

    for (int r = 0; r < a.length; r++) {
      for (int c = 0; c < a[0].length-1; c++) {
        if (a[r][c+1] > a[r][c]) {
          a[r][c] = a[r][c+1];
          }
        }
      }

      return a;
    }
}
