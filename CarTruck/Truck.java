//9.8, 9.9 CarTruck
public class Truck extends Car {

  public void m1() {
    System.out.println("truck 1");
  }

  public void m2() { //overwritten to inherit car's m1()
    super.m1();
  }

  public String toString() {
    return super.toString() + super.toString();
  }


}
