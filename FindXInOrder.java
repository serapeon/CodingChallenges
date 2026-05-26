/*
Write a function, getX, that given an int x and a integer array num, returns the Xth number if the list was in sorted order. In other words, the Xth smallest number.

Function Name: getX

Input: An integer, x, and an unsorted list of integers nums that aren’t necessarily distinct

Output: The integer corresponding to the Xth number in the sorted list

Example:

getX(2, [5, 10, -3, -3, 7, 9]) => -3

The second number in order is -3.

getX(4, [5, 10, -3 , -3, 7, 9]) => 7

The fourth number in order is 7.

Note that this assumes the first number is position 1, not 0.
*/

public class FindXInOrder {

  /*
  A function that returns xth smallest number from an integer array
  @param x - integer representing position in list
  @param nums - integer array
  @return xth smallest number in nums array
  */
  public static int getX(int x, int[] nums) {
    if (x > nums.length) return 0;
    if (nums.length == 0) return 0;
    if (x <= 0) return 0;
    if (nums == null) return 0;

    int temp;
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    return nums[x-1];
  }
  
  public static void main(String[] args) {
    int nums[] = new int[]{ 5, 10, -3, -3, 7, 9};
    int x = 2;
    System.out.println(getX(x, nums));
  }
}