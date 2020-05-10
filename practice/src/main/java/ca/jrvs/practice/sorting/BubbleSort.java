package ca.jrvs.practice.sorting;

public class BubbleSort {
  /**
   * In-place bubble sort
   * @param numbers
   */
  public void bubbleSort(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = numbers.length -1; j > i; j--) {
        if (numbers[j] < numbers[j - 1]) {
          swap(numbers, j, j-1);
        }
      }
    }
  }

  /*
   * Utility method to swap two numbers in array
   */
  public void swap(int[] array, int from, int to){
    int temp = array[from];
    array[from] = array[to];
    array[to] = temp;
  }

}
