//DrinkSipBiteGulp
import java.util.*;
public class DrinkSipBiteGulp {
  public static void main(String[] args) {
    // Object var1 = new Bite();
    Gulp var2 = new Gulp();
    Gulp var3 = new Sip();
    Bite var4 = new Drink();
    // Object var5 = new Gulp();
    Gulp var6 = new Drink();

    // System.out.print("1: "); var1.method2();
    System.out.print("2: "); var2.method2();
    System.out.print("3: "); var3.method2();
    System.out.print("4: "); var4.method2();
    // System.out.print("5: "); var5.method2();
    System.out.print("6: "); var6.method2();
    // System.out.print("1: "); var1.method3();
    System.out.print("2: "); var2.method3();
    System.out.print("3: "); var3.method3();
    System.out.print("4: "); var4.method3();
    // System.out.print("5: "); var5.method3();
    System.out.print("6: "); var6.method3();

    // System.out.print("3: "); ((Gulp) var1).method2();
    // System.out.print("4: "); ((Bite) var1).method3();
    System.out.print("5: "); ((Bite) var6).method1();

    System.out.print("7: "); ((Drink) var4).method2();
    System.out.print("8: "); ((Bite) var3).method1();


    }












}
