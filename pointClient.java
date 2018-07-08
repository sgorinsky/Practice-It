public class pointClient {

  public static void main(String[] args) {

    Point distance1 = new Point(5, 2); //calling first constructor to initialize instance of Point object
    Point other = new Point(8,6);
    Point distance2 = new Point(other); //calling second constructor to initialize instance of Point (from Point object class)
    Point other2 = other; //same as distance2?
    Point distance3 = new Point(); //initializing instance of Point by calling default constructor

    System.out.println(distance1.distance(other)); //testing 8.10 distance method
    System.out.println(distance2.toString()); //testing 8.21 constructor
    System.out.println(distance2.point_equals(other2)); //since I made a constructor that allows Point objects as arguments, should print true
    System.out.println(distance3.toString()); //testing default constructor with no parameters

  }

}
