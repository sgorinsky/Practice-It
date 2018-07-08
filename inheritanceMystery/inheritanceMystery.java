public class inheritanceMystery {

  public static void main(String[] args) {

    C[] elements = {new A(), new B(), new C(), new D()};

    for (int i = 0; i < elements.length; i++) {

      //C, B, A, D classes have no constructor so .toString() is implicit constructor with each instance
      System.out.println(elements[i]);

      elements[i].method1();
      System.out.println();
      elements[i].method2();
      System.out.println();
      System.out.println();
    }

    /* elements[0] is A() object instance: Returns "b" from toString() when prints elements[0],
       A inherits B inherits C, method1 for A is C's, which prints "c 1"
       method 2 is overwritten with a 2, then prints C's method1() on same line
     * b
     * c 1
     * a 2 c 1

       B() object instance is elements[1]: Returns "b" from B's toString() overwrite
       B inherits C's method 1, so prints "c 1 "
       method 2 is B's so prints "b 2 " then prints C's method1()
     * b
     * c 1
     * b 2 c 2

       C() object instance is elements[2]: Returns "c" from its toString() method
       C is the superclass or parent, so it inherits nothing; method1() prints "c 1 "
       C's method2() prints "c 2 "
     * c
     * c 1
     * c 2

       D() object instance is elements[3]: Returns "b" because inherited B's toString()
       overwrites method1() with "d 2 " print then calls B's method2() b/c it didn't overwrite it
       then calls B's method2()
     * b
     * d 1 b 2 c 2
     * b 2 c 2
     */
  }
}
