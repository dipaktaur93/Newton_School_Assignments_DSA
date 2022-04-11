import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

      static long count = 0;

      static long temp[] = new long[100001]; 

      public static void merge(long[] arr, int start, int mid, int end){
            for(int i = start; i <= end; i++){
                  temp[i] = arr[i];
            }
            
            int i = start;
            int j = mid + 1;
            int index = start;
            while(i <= mid && j <= end){
                  if(temp[i] <= temp[j]){
                        /*no inversion*/
                        arr[index] = temp[i];
                        i++;
                  }
                  else{
                        /*inversion*/
                        arr[index] = temp[j];
                        count += mid + 1 - i; 
                        j++;
                  }
                  index++;
            }
            while(i <= mid){
                  arr[index] = temp[i];
                  index++;
                  i++;
            }
            while(j <= end){
                  arr[index] = temp[j];
                  index++;
                  j++;
            }
      }

      public static void mergeSort(long arr[], int start, int end){
      
            if(start >= end){
                  //stop splitting
                  return;
            }
            int mid = (start) + (end - start) / 2;
            mergeSort(arr, start , mid); 
            mergeSort(arr, mid+1 , end); 
            merge(arr, start, mid, end);
      }

	public static void main (String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long array[] = new long[n];
            for(int i = 0; i < n; i++){
                  array[i] = sc.nextLong();
            }
            mergeSort(array, 0, n - 1);
            System.out.println(count);

	}
}
