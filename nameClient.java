//Making a client class for name.java

public class nameClient {

  public static void main(String[] args) {

    Name Sam = new Name("Sam", 'A', "Gorinsky"); //testing out object
    System.out.println(Sam.toString());
    //mutator methods that can change parts of name
    Sam.setFirstName("$@m");
    Sam.setMiddleInitial('G'); 
    Sam.setLastName("*MONEY*");
    System.out.println(Sam.toString());

  }
}
