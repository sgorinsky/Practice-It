//8.26: Encapsulated Name; 8.27: mutatorsName

// A Name object represents a person's name such as "John Q. Public".
public class Name {
    //All fields should be private
    private String firstName;
    private char middleInitial;
    private String lastName;

    public Name(String first, char middle, String last) {
        firstName = first;
        middleInitial = middle;
        lastName = last;
    }

    //Accessor methods
    public String getFirstName(){
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }
    public String getLastName() {
        return lastName;
    }

    //Mutator Methods: should be void, not returning anything but changes fields
    public void setFirstName(String first_) { //changes firstName
        this.firstName = first_;
    }

    public void setMiddleInitial(char middle_) { //changes middleInitial
        this.middleInitial = middle_;
    }

    public void setLastName(String last_) { // changes lastName
         this.lastName = last_;
    }

    public String toString() {
      return (firstName + " " + middleInitial + " " + lastName);
    }

}
