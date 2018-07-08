//8.10: DistancePoint; 8.14: toStringPoint; 8.21: ConstructorPoint
// Learning Object Oriented Problem

import java.util.*;
public class Point {

  //"State" of object with "fields" composed of "instance variables"
  private int x;
  private int y;

  //Constructor
  public Point(int x_, int y_) { //constructing the object
    this.x = x_;
    this.y = y_;
  }

  //Default constructor with no parameters
  public Point(){
    this(0, 0);
  }

  //Constructor from 8.21
  public Point(Point p1) { //instantiates a new Point using a Point instance as the argument
    this.x = p1.x;
    this.y = p1.y;
  }

  //object Method from 8.10
  public double distance(Point other) {

      return (Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2)));

  }

  //Method from 8.14
  public String toString() {

      return ("java.awt.Point[x=" + x + ",y=" + y + "]");

  }

  //Check to see if Points equal one another
  public boolean point_equals(Point other) {

    if (this.x == other.x && this.y == other.y) {
      return true;

    } else {
      return false;
    }

  }
}
