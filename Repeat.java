//12.11: Repeat

public class Repeat {

  public static void main(String[] args) {

    System.out.println(repeat("hello", 3));
    System.out.println(repeat("wow", 5));
    System.out.println(repeat("this is me", 2));
    System.out.println(repeat("bad words", 0));
    System.out.println(repeat("wanker", -1));

  }

  public static String repeat(String s, int n) {

    if (n == 1) {

      return s;

    } else if (n == 0) {

      return "";

    } else if (n < 0) {

      throw new IllegalArgumentException("Cannot repeat a string a negative number of times.");

    } else {

      return repeat(s, n-1) + s;

    }

  }


}
