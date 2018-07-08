/* 12.5: mystery3

1   mystery3(0); 	* 	pass
2 	mystery3(1); 	[*] 	pass
3 	mystery3(2); 	([*]) 	pass
4 	mystery3(4); 	([([*])]) 	pass
5 	mystery3(5); 	[([([*])])] 	pass

*/
import java.util.Scanner;

public class mystery3 {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.println("Input a number for a pattern: ");
    int n = console.nextInt();

    mystery3(n);

  }

  public static void mystery3(int n) {

      if (n <= 0) {

          System.out.print("*");

      } else if (n % 2 == 0) {

          System.out.print("(");
          mystery3(n - 1);
          System.out.print(")");

      } else {

          System.out.print("[");
          mystery3(n - 1);
          System.out.print("]");

      }
    }
  }
