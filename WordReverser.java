/*
Write a wordReverser() method that will take a given string and reverse the order of the words. 
You may assume that the string is a sentence that contains only letters and spaces, with all 
words separated by one space.

For example, wordReverser("Codecademy rules") should return "rules Codecademy" and 
wordReverser("May the Fourth be with you") should return "you with be Fourth the May". 
*/

public class WordReverser {
  public static void main(String[] args) {
    System.out.println(wordReverser("May the Fourth be with you"));
  }

  /*
  A function that takes a string and reverses the words in it
  @param input - String to reverse
  @return ret - a reverse String 
  */
  public static String wordReverser(String input) {
    String[] arr;
    String ret = "";
    arr = input.split(" ", 0);
    for (int i = arr.length-1; i > 0; i--) {
      ret += arr[i];
      ret += " ";
    }
    // add last word manually to avoid the space that comes after the other words
    ret += arr[0];
    return ret;
  }
}