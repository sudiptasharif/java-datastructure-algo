/** 
A class to study binary search.
*/
public class MyIntArray {
   private int[] arr;
   
   /**
   Constructor.
   
   @param initialArr initial array for internal array
   */
   public MyIntArray(int[] initialArr) {
      arr = initialArr;
   }
   
   public int getValueAt(int index) {
      if (index < 0) {
         throw new IllegalArgumentException("index is negative: " + index);
      }
      return arr[index];
   }
   
   /**
   Used to get the max steps needed in a binary search.
   
   @return the max steps
   */
   public int maxStepsNeeded() {
      int count = 0;
      int result = arr.length;
      do {
         result = result / 2;
         count++;
      } while (result > 0);
      return count;
   }
   
   /**
   Used to search a target in arr.
   
   @param target the value to search 
   
   @return -1 if target is not in arr 
              otherwise returns the index of target in arr
   */
   public int binarySearch(int target) {
      int result = -1;
      int min = 0;
      int max = arr.length - 1;
      int guess = result;
      
      while (!(max < min)) {
         guess = (min + max) / 2;
         if (arr[guess] == target) {
            result = guess;
            max = min - 1;
         } else if (arr[guess] < target) {
            min = guess + 1;
         } else {
            max = guess - 1;
         }
      }
      return result;
   }
   
   public void swap(int firstIndex, int secondIndex) {
      int temp = arr[firstIndex];
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp;
   }
   
   public int indexOfMinimum(int startIndex) {
      int minValue = arr[startIndex];
      int minIndex = startIndex;
      
      for (int i = minIndex + 1; i < arr.length; i++) {
         if (arr[i] < minValue) {
            minIndex = i;
            minValue = arr[i];
         }
      }
      return minIndex;
   }
      
   public void selectionSort() {
      int minIndex;
      for (int startIndex = 0; startIndex < arr.length; startIndex++) {
         minIndex = indexOfMinimum(startIndex);
         swap(startIndex, minIndex);   
      }
   }
   
   public String toString() {
      String result = "{";
      for (int i = 0; i < arr.length; i++) {
         if (i == (arr.length - 1)) {
            result += arr[i] + "}";
         } else {
            result += arr[i] + ", ";
         }   
      }
      return result;
   }
   
   public void insert(int rightIndex, int value) {
      int leftIndex = rightIndex;      
      while ((leftIndex >= 0) && (arr[leftIndex] > value)) {
         arr[leftIndex + 1] = arr[leftIndex];
         leftIndex--;
      }
      arr[leftIndex + 1] = value;
   } 
   
   public void insertionSort() {
      for (int index = 1; index < arr.length; index++) {
         insert((index - 1), arr[index]);
      }
   } 
   
   public void merge(int p, int q, int r) {
      int lowHalfArrLen = (q - p + 1);
      int highHalfArrLen = (r - q);
      
      int[] lowHalfArr = new int[lowHalfArrLen];
      int[] highHalfArr = new int[highHalfArrLen];
      
      int k = p;
      int i = 0;
      int j = 0;
            
      while(i < lowHalfArrLen) {
         lowHalfArr[i] = arr[k];
         i++;
         k++;
      }
      
      while(j < highHalfArrLen) {
         highHalfArr[j] = arr[k];
         j++;
         k++;         
      }
      
      k = p;
      i = 0;
      j = 0;
      
      while ((i < lowHalfArrLen) && (j < highHalfArrLen)) {
         if(lowHalfArr[i] < highHalfArr[j]) {
            arr[k] = lowHalfArr[i];
            i++;
         } else {
            arr[k] = highHalfArr[j];
            j++;
         }
         k++;
      }
      
      while(i < lowHalfArrLen) {
         arr[k] = lowHalfArr[i];
         i++;
         k++;
      }
      
      while(j < highHalfArrLen) {
         arr[k] = highHalfArr[j];
         j++;
         k++;         
      }      
   }
   
   public void mergeSort(int p, int r) {
      int q;
      if(p < r) {
         q = (p + r) / 2;
         mergeSort(p, q);
         mergeSort((q + 1), r);
         merge(p, q, r);
      }
   }
   
   public int partition(int p, int r) {
      int q = p;
      for(int j = p; j < r; j++){
         if(arr[j] <= arr[r]) {
            swap(j, q);
            q++;
         }
      }
      swap(q, r);
      return q;
   }
   
   public void quickSort(int p, int r){
      if(p < r) {
         int q = partition(p, r);
         quickSort(p, (q - 1));
         quickSort((q + 1), r);
      }
   }
}