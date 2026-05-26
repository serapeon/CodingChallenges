/*
Create a primeFinder() method that takes in a number, n, and returns all the prime numbers 
from 1 to n (inclusive). As a reminder, a prime number is a number that is only divisible by 
1 and itself.

For example, primeFinder(13) should return [2, 3, 5, 7, 11, 13].
*/
import java.util.*;

public class PrimeFinder {
  public static void main(String[] args) {
    System.out.println(primeFinder(13));
  }

  public static ArrayList primeFinder(int n) {
    ArrayList<Integer> arr = new ArrayList();
    ArrayList<Integer> nArr = new ArrayList();

    // checking boundary conditions
    if (n <= 1) return arr;
    else if (n == 2) {
      arr.add(n);
      return arr;
    }

    // populating array for testing
    for (int i = 1; i <= n; i++) {
      arr.add(i);
    }
    for (Integer num : arr) {
      for (int j = 2; j <= num; j++) {
        // if iteration has reached actual number it's a prime number
        if (j == num) nArr.add(num);
        // as soon as a number can be divided by another number go to next number
        else if (num%j == 0) break; 
      }
    }
    return nArr;
  }
}