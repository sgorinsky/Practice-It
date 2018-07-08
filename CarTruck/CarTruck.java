//9.8, 9.9 CarTruck

public class CarTruck {

  public static void main(String[] args) {

    Car myCar = new Car();
    Truck myTruck = new Truck();

    System.out.println(myCar);
    myCar.m1();
    myCar.m2();
    System.out.println(myTruck);
    myTruck.m1();
    myTruck.m2();

    MonsterTruck monster = new MonsterTruck();
    System.out.println(monster);
    monster.m1();
    monster.m2();
    System.out.println(monster.toString());


  }

}
