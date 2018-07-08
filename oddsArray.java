//7.4 oddsArray: all odd numbers from -6 to 38

import java.util.Arrays;

public class oddsArray {

  public static void main(String[] args) {

    int[] odds = new int[(38+6)/2];
    int j = -5;

    for (int i = 0; i<odds.length; i++) {
        odds[i] = j;
        j+=2;
    }

    System.out.println(Arrays.toString(odds));

  }
}
