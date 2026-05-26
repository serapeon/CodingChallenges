/*
Write a uniqueCharacters() function that determines if any given string has all unique characters 
(i.e. no character in the string is duplicated). If the string has all unique characters, the 
function should return true. If the string does not have all unique characters, return false.

For example, uniqueCharacters("apple") should return false.
*/

import java.util.*;

public class UniqueCharacters {
  public static void main(String[] args) {
    System.out.println(uniqueCharacters("apple"));
  }

  /*
  A function that determines whether a string has all unique characters or not
  @param strIn - string to check
  @return true or false
  */
  public static boolean uniqueCharacters(String strIn) {
    if (strIn.isEmpty()) {
        throw new IllegalArgumentException("Empty string");
    }

    ArrayList a = new ArrayList<String>();

    for (int i = 0; i < strIn.length(); i++) {
        if (a.contains(strIn.charAt(i))) {
            return false;
        }
        else {
            a.add(strIn.charAt(i));
        }
    }
    return true;
  }
}