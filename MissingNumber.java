/*
You have a bag containing tiles with numbers [1, 2, 3, …, n] written on them. Each number appears 
exactly once, so there are n tiles and n numbers. Now, without looking, k number tiles are randomly 
picked out of the bag and discarded. Create a missingNos() function that takes in a list and k, and 
returns the missing numbers in ascending order (from smallest to greatest).

For example, calling missingNos() with ([1, 2, 4, 5, 6, 7, 8, 10], 2) should return [3, 9].
*/
public class MissingNumber {
  public static void main(String[] args) {
    int[] answer = missingNos(new int[]{1, 2, 4, 5, 6, 7, 8, 10}, 2);
    System.out.println(answer[0]);
    System.out.println(answer[1]);
  }
  
  /*
  A helper function to make sure array is in ascending order
  @param arr - the array that will be sorted
  */
  public static void sortArray(int[] arr) {
    int len = arr.length;
    int temp = 0;
    for (int i = 0; i < len-1; i++) {
      for (int j = i+1; j < len; j++) {
      	if (arr[j] < arr[i]) {
	      temp = arr[j];
    	  arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  }

  /*
  A function that takes in a list and k and returns the missing numbers in ascending order
  @param array - the array with k missing numbers
  @param k - amount of missing numbers
  @return - an array with missing numbers in ascending order
  */
  public static int[] missingNos(int[] array, int k) {
    int count = 0;
    int num = 1;
    int[] ret = new int[k];
    
    // in case the array is unsorted it is sorted first
    sortArray(array);

    for (int i = 0; i < array.length; i++) {
      // if numbers don't match, num is added to return array
      if (num != array[i]) {
        ret[count] = num;
        // need to increase num and check with same array element, hence i--
        num++;
        i--;
        count++;
      }
      // if numbers match, just increment num
      else {
        num++;
      }
      // if right amount of elements has been added to return array we can stop iterating
      if (count == k) {
        return ret;
      }
    }
    return ret;
  }
}