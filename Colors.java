import java.util.*;

public class Colors {
  public static void main(String[] args) {
    colors();
  }

  public static void colors() {
    System.out.print("What color do you want? ");
    Scanner console = new Scanner(System.in);
    String color = console.next();

    if (color.equalsIgnoreCase("r")) {
      System.out.println("You have chosen Red.");
    } else if (color.equalsIgnoreCase("b")) {
      System.out.println("You have chosen Blue.");
    } else if (color.equalsIgnoreCase("g")) {
      System.out.println("You have chosen Green.");
    } else {
      System.out.println("Unknown color: " + color);
    }
  }
}

/*
equals 	name.equals("John Doe")
equalsIgnoreCase 	name.equalsIgnoreCase("john doe")
startsWith  	name.startsWith("Joh")
endsWith  	name.endsWith("Doe")
contains  	name.contains(" ") */
