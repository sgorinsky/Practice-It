//7.32: rectangularArray
import java.util.*;

public class rectangularArray {

public static void main(String[] args) {
  int[][] data = new int[4][7];

  for (int i = 0; i < data[0].length; i++) {
      data[2][i] = i+1; //yields third row
    }

  System.out.println(Arrays.toString(data[2]));

  }

}
