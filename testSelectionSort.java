/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
    }

    public void testNegative(){

        /** Test data contains negative values only **/
    }

    @Test
      public void testMixed(){

          /** Test data contains with both positive, negative and zeros **/
      	int[] arr = new int [5];
      	arr[0] = -8;
          arr[1] = 4;
          arr[2] = 0;
          arr[3] = -3;
          arr[4] = 1;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = -8;
          Sortedarr[1] = -3;
          Sortedarr[2] = 0;
          Sortedarr[3] = 1;
          Sortedarr[4] = 4;

          temp = new SelectionSort();
          int [] selectionSortedArr = temp.basicSelectionSort(arr);

          System.out.println("TEST MIXED");

          for (int i = 0; i < selectionSortedArr.length; i++) {
          	System.out.print(selectionSortedArr[i] + " ");
          }

          System.out.println();

          for (int i = 0; i < Sortedarr.length; i++) {
          	System.out.print(Sortedarr[i] + " ");
          }

          System.out.println();


          assertArrayEquals(Sortedarr, selectionSortedArr);
      }

      @Test
      public void testDuplicates(){

          /** Test data contains duplicates **/
      	int[] arr = new int [5];
      	arr[0] = -8;
          arr[1] = 4;
          arr[2] = -8;
          arr[3] = 3;
          arr[4] = 3;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = -8;
          Sortedarr[1] = -8;
          Sortedarr[2] = 3;
          Sortedarr[3] = 3;
          Sortedarr[4] = 4;

          temp = new SelectionSort();
          int [] selectionSortedArr = temp.basicSelectionSort(arr);

          System.out.println("TEST DUPLICATES");

          for (int i = 0; i < selectionSortedArr.length; i++) {
          	System.out.print(selectionSortedArr[i] + " ");
          }

          System.out.println();

          for (int i = 0; i < Sortedarr.length; i++) {
          	System.out.print(Sortedarr[i] + " ");
          }

          System.out.println();


          assertArrayEquals(Sortedarr, selectionSortedArr);
      }
  }
