// 12.3: Mystery1

/*
1   mystery1(1); 	1 	pass
2 	mystery1(4); 	1, 2, 4 	pass
3 	mystery1(16); 	1, 2, 4, 8, 16 	pass
4 	mystery1(30); 	1, 3, 7, 15, 30 	pass
5 	mystery1(100); 	1, 3, 6, 12, 25, 50, 100
*/

public class mystery1 {

  public static void main(String[] args) {

    System.out.print(mystery1(5));
  }

  public void mystery1(int n) { //void type isn't allowing it to run?

    if (n <= 1) {

        System.out.print(n);

    } else {

        mystery1(n / 2);
        System.out.print(", " + n);

    }
  }
}
