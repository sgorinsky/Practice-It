//3.14:

public class parameterMysteryReturn {

  public static void main(String[] args) {

    int x = 1;
    int y = 2;
    int z = 3;

    z = mystery(x, z, y); // 3 0
    System.out.println(x + " " + y + " "+ z); //1 2 4
    x = mystery(z, z, x); // 4 1
    System.out.println(x + " " + y + " "+ z);//5 2 4
    y = mystery(y, y, z); // 8 1
    System.out.println(x + " " + y + " "+ z);//5 9 4

  }

  public static int mystery(int z, int x, int y) {

    z--;
    x = 2 * y + z;
    y = x - 1;
    System.out.println(y + " " + z);
    return x;

  }

}
