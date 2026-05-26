/*
Write a fizzbuzz() method that takes in a number, n, and returns an ArrayList of the numbers from 1 to n. For multiples of three, use "Fizz" instead of the number, and for the multiples of five, use "Buzz". For numbers that are multiples of both three and five, use "FizzBuzz" (capitalization matters).

For example, fizzbuzz(16) should return [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16].
*/

import java.util.*;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(fizzbuzz(16));
  }

  /*
  A function that takes in n and returns arraylist of numbers 1-n where multiples of 3 are exchanged for "Fizz", multiples 
  of 6 are exchanged for "Buzz" and multiples of both for "FizzBuzz"
  @param n - number that decides size of arraylist
  @return an arraylist 
  */
  public static ArrayList fizzbuzz(int n) 
  {
    ArrayList a = new ArrayList();
    for (int i = 1; i <= n; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) a.add("FizzBuzz");
        else if (i % 3 == 0) a.add("Fizz");
        else if (i % 5 == 0) a.add("Buzz");
        else a.add(i);
    }
    return a;
  }
  
}