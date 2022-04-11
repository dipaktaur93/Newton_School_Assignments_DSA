static int isPresent(long arr[], int n, long k)
{
   if(binaryscearch(arr,0,arr.length-1,k)!=-1){
                  return 1;
            }
            return -1;
       }
  static int binaryscearch(long[] arr, int left,int right,long element ){
            if(right>=left){
            int mid=left+(right-left)/2;
            if(element==arr[mid]){
                  return mid;
            }
            if(element<arr[mid]){
                  return binaryscearch(arr, left, mid-1, element);
            }
          return binaryscearch(arr, mid+1, right, element);
         }
      return -1;
      }
