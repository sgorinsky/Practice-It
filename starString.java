//12.1: StarString

public class starString {

  public static void main(String[] args) {

    System.out.println(starString(0));
    System.out.println(starString(1));
    System.out.println(starString(2));
    System.out.println(starString(3));
    System.out.println(starString(4));
    System.out.println(starString(5));
    System.out.println(starString(-1));

  }

  public static String starString(int n) {

    if (n>=0) {

      if (n == 0) {

        return "*";

      } else if (n == 1) {

        return "**";

      } else {

        return starString(n-1) + starString(n-1);

      }
    } else {

      throw new IllegalArgumentException("Input value is negative.");

    }
  }
}
