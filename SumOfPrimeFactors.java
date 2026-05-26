/*Create a sumOfPrimeFactors() method that takes in an integer n and returns the sum of all of 
its prime factors. As a reminder, a prime number is a number whose only factors are one and itself. 
Therefore, a prime factor is a factor of a given number that itself is a prime number.

For example, sumOfPrimeFactors(91) should return 20 since its prime factors are 13 and 7. 
*/

import java.util.*;

public class SumOfPrimeFactors {
  public static void main(String[] args) {
    System.out.println(sumOfPrimeFactors(91));
  }

  /*
  A helper function that determines if a number is a prime number
  @param m - the number to check
  @return true if m is a prime number
  */
  public static boolean isPrime(int m) {
    if (m < 2) return false;
    for (int i = 2; i < m; i++) {
      if (m%i == 0) return false;
    }
    return true;
  }

  /*
  A function that takes an integer n and returns the sum of all of its prime factors
  @param n - the number for which the sum should be calculated for
  @return the sum of all prime factors for n
  */
  public static int sumOfPrimeFactors(int n) {
    int count = 0;
    if (isPrime(n)) return n;
    else {
      for (int i = 2; i < n; i++) {
      	// if n can be divided with i, then one prime factor is found
        if (n%i == 0) {
          count += i;
          // change n accordingly
          n = n/i;
          // if the new n is a prime number we're done
          if (isPrime(n)) {
            count += n;
            return count;
          }
          // otherwise start for-loop again
          else {
            i = 2;
          }
        }
      }
      return count;
    }
  }

}