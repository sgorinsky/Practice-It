//7.19: matrixAdd
import java.util.*;
public class matrixAdd {

  public static void main(String[] args) {
    int[][] n = {
                  {3, 4, 5, 6},
                  {4, 5, 6, 7},
                  {5, 6, 7, 8}
                };

    int[][] c = {};

    int a[][] = matrixAdd(c, c); //testing to see if method works

    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[0].length; j++) {
        System.out.println("a[" + i + "]" + "[" + j+ "] = " + a[i][j]);
      }
    }

    System.out.println(Arrays.toString(a));
  }

  public static int[][] matrixAdd(int[][] a, int[][] b) {

  /* other construction of initializing an empty matrix c with dimensions of a didn't work
     when parameter a had null length, then it wouldn't be able to be passed through
     as the number of rows and/or columns c. This way, if length is null (or < 0), for loop is
     skipped and a is immediately returned */


    for(int i = 0; i < a.length; i++) {
        for(int j = 0; j < a[0].length; j++) {
            a[i][j] = a[i][j] + b[i][j];
        }
    }
    return a;
  }
}
