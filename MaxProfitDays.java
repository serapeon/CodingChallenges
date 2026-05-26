/*
Given the daily values of a stock, create a function called maxProfitDays() that, given an array of integers, will return the index value of the two elements that represent the day on which one should have bought a share and the day on which one should have sold a share based on the max profit.

An array of integers will represent the stock price at the beginning or “opening bell” of each day for a week. You are required to buy and sell only once. You also must buy a stock before selling it.

For example, given the array {7, 11, 60, 25, 150, 75, 31, 120}, you can assume that index 0 represents day 0 and index 7 represents day 7. In this case, purchasing on day 1 and selling on day 4 would yield the most profit. If we were to call maxProfitDays() with an array containing the values {17, 11, 60, 25, 150, 75, 31, 120} as the argument, the function would return {1, 4}.
*/

import java.util.*;

public class MaxProfitDays {
  public static void main(String[] args) {
    int[] stockPrices = {17, 11, 60, 25, 150, 75, 31, 120};
    int[] maxProfitDays = (maxProfitDays(stockPrices));
    System.out.println(maxProfitDays[0]);
    System.out.println(maxProfitDays[1]);
  }

  /*
  A function that takes an array of stock prices and returns the two days that would have given maximum return
  @param stockPrices - an array of stock prices
  @return index value that represent buy day and sell day
  */
  public static int[] maxProfitDays(int[] stockPrices) {
    int maxProfit = Integer.MIN_VALUE;
    int temp;
    int days[] = new int[2];
    
    for (int i = 0; i < stockPrices.length-1; i++) {
        for (int j = i + 1; j < stockPrices.length; j++) {
            temp = stockPrices[j] - stockPrices[i];
            if (temp > maxProfit) {
                maxProfit = temp;
                days[0] = i;
                days[1] = j;
            }
        }
    }
    return days;
  }
}