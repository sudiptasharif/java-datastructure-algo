import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MyIntArrayTest {
//    private MyIntArray myIntArr = null;
// 
//    /** Fixture initialization (common initialization
//     *  for all tests). **/
//    @Before public void setUp() {
//       int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
//          41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
//       
//       myIntArr = new MyIntArray(primes);
//    }


//    /** A test for binary search. **/
//    @Test 
//    public void binarySearchTest() {
//       Assert.assertEquals(18, myIntArr.binarySearch(67));   
//    }
//    
//    /** A test for binary search. **/
//    @Test
//    public void binarySearchTest2() {
//       Assert.assertEquals(24, myIntArr.binarySearch(97));   
//    }
//    
//    /** A test for binary search. **/
//    @Test 
//    public void binarySearchTest3() {
//       Assert.assertEquals(0, myIntArr.binarySearch(2));   
//    } 
//    
//    /** A test for binary search. **/
//    @Test 
//    public void binarySearchTest4() {
//       Assert.assertEquals(-1, myIntArr.binarySearch(100));   
//    } 
//    
//    /** A test for swap. **/
//    @Test 
//    public void swapTest() {
//       myIntArr.swap(0, 24);
//       Assert.assertEquals(97, myIntArr.getValueAt(0));  
//       Assert.assertEquals(2, myIntArr.getValueAt(24));    
//    } 
//    
//    /** A test for indexOfMinimum. **/
//    @Test 
//    public void indexOfMinimumTest() {
//       int[] arr = {18, 6, 66, 44, 9, 22, 14};
//       MyIntArray anotherArr = new MyIntArray(arr);
//       Assert.assertEquals(1, anotherArr.indexOfMinimum(0)); 
//       Assert.assertEquals(4, anotherArr.indexOfMinimum(2)); 
//    } 
//    
//    /** A test for selectionSort. **/
//    @Test
//    public void selectionSortTest() {
//       int[] arr = {18, 6, 66, 44, 9, 22, 14};
//       MyIntArray anotherArr = new MyIntArray(arr); 
//       String expected = "{6, 9, 14, 18, 22, 44, 66}";
//       anotherArr.selectionSort();
//       Assert.assertEquals(expected, anotherArr.toString());    
//    }
//    
//    /** A test for toString **/
//    @Test 
//    public void toStringTest() {
//       int[] arr = {18, 6, 66, 44, 9, 22, 14};
//       MyIntArray anotherArr = new MyIntArray(arr);
//       String expected = "{18, 6, 66, 44, 9, 22, 14}"; 
//       Assert.assertEquals(expected, anotherArr.toString());    
//    }  
//    
//    /** Test for insert of insertion sort*/
//    @Test
//    public void insertTest() {
//       int[] arr = {3, 5, 7, 11, 13, 2, 9, 6};
//       MyIntArray anotherArr = new MyIntArray(arr);
//       anotherArr.insert(4, 2);
//       String expected = "{2, 3, 5, 7, 11, 13, 9, 6}";
//       Assert.assertEquals(expected, anotherArr.toString());
//    }                     
//       
//    /** Test for insert of insertion sort*/
//    @Test 
//    public void insertTest2() {
//       int[] arr = {2, 3, 5, 7, 11, 13, 9, 6};
//       MyIntArray anotherArr = new MyIntArray(arr);
//       anotherArr.insert(5, 9);
//       String expected = "{2, 3, 5, 7, 9, 11, 13, 6}";
//       Assert.assertEquals(expected, anotherArr.toString());
//    } 
//    
//       
//    /** Test for insert of insertion sort*/
//    @Test 
//    public void insertTest3() {
//       int[] arr = {2, 3, 5, 7, 9, 11, 13, 6};
//       MyIntArray anotherArr = new MyIntArray(arr);
//       anotherArr.insert(6, 6);
//       String expected = "{2, 3, 5, 6, 7, 9, 11, 13}";
//       Assert.assertEquals(expected, anotherArr.toString());
//    }  
//    
//    /** Test insertion sort*/
//    @Test
//    public void insertionSortTest() {
//       int[] arr = {22, 11, 99, 88, 9, 7, 42};
//       MyIntArray myArr = new MyIntArray(arr);
//       myArr.insertionSort();
//       String expected = "{7, 9, 11, 22, 42, 88, 99}";   
//       Assert.assertEquals(expected, myArr.toString());
//    } 
//    
//    /** Test insertion sort*/
//    @Test
//    public void insertionSortTest2() {
//       int[] arr = {5, 10, -1, 15, 0, 11, 3};
//       MyIntArray myArr = new MyIntArray(arr);
//       myArr.insertionSort();
//       String expected = "{-1, 0, 3, 5, 10, 11, 15}";   
//       Assert.assertEquals(expected, myArr.toString());
//    }  
//    
//    @Test
//    public void mergeTest() {
//       int[] arr = {3, 7, 12, 14, 2, 6, 9, 11};      
//       MyIntArray myArr = new MyIntArray(arr);
//       myArr.merge(0, ((0 + arr.length - 1) / 2), (arr.length - 1));
//       String expected = "{2, 3, 6, 7, 9, 11, 12, 14}";
//       Assert.assertEquals(expected, myArr.toString());
//    } 
   
//    @Test
//    public void mergeSortTest() {
//       int[] arr = {14, 7, 3, 12, 9, 11, 6, 2};
//       MyIntArray myArr = new MyIntArray(arr);
//       myArr.mergeSort(0, arr.length - 1);
//       String expected = "{2, 3, 6, 7, 9, 11, 12, 14}";
//       Assert.assertEquals(expected, myArr.toString());  
//    }   

   @Test
   public void quickSortTest() {
      int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
      MyIntArray myArr = new MyIntArray(arr);
      myArr.quickSort(0, (arr.length - 1));
      String expected = "{2, 3, 5, 6, 7, 9, 10, 11, 12, 14}";
      Assert.assertEquals(expected, myArr.toString());
   }   
   
}
