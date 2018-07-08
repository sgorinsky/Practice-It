/* 3.19: StringExpressions
3.20: StringExpressions2 */

public class StringExpressions {

  public static void main(String[] args) {

    //3.19
    String str4 = "Gandalf the GRAY";

    System.out.println(str4.replace("gray", "white"));

    //3.20

    String str1 = "Q.E.D.";
    String str2 = "Arcturan Megadonkey";
    String str3 = "Sirius Cybernetics Corporation";

    System.out.println(str1.toLowerCase());
    System.out.println(str1.substring(2, 4));
    System.out.println(str2.indexOf("donkey"));
    System.out.println(str3.indexOf("X"));




  }
}
