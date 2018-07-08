/* 12.2: writeNums
Although my outpt looks exactly as it should, the output's type
may be different than what is asked
*/

public class writeNums {

  public static void main(String[] args) {

  }

  public void writeNums(int n) {

    if (n < 1) {

      throw new IllegalArgumentException("Integer value less than 1.");

    } else if (n == 1) {

      System.out.print(1);

    } else {

      writeNums(n - 1);
      System.out.print(", " + n);

    }

  }

}
