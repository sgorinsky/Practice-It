//5.15: isVowel method, returns whether only a single character string is a vowel

import java.io.*;

public class isVowel {

  public static void main(String[] args) {

    System.out.println(isVowel("a"));
    System.out.println(isVowel("E"));

    System.out.println(isVowel("s"));
    System.out.println(isVowel("w"));
    System.out.println(isVowel("boogie"));

  }

  public static boolean isVowel(String s) {

    boolean result = true;

    s = s.toLowerCase();

    if (s.length() == 1) {

      if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") ||s.contains("u")) {

      result = true;

    } else {

      result = false;

      }

    } else {

      result = false;

    }

    return result;

  }

}
