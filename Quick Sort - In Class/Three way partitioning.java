public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> arr, int lowVal, int highVal)
    {
 int low = 0, mid = 0, high = arr.size() - 1;
   while (mid <= high) {
      int value;
           
            if (arr.get(mid) < lowVal)
                value = 0;
           
            else if (arr.get(mid) >= lowVal
                     && arr.get(mid) <= highVal)
                value = 1;
            
            else
                value = 2;
  
            switch (value) {
                case 0:
                Collections.swap(arr, mid, low);
                mid++;
                low++;
                break;
               case 1:
                mid++;
                break;
  
           
            case 2:
                Collections.swap(arr, mid, high);
                high--;
                break;
            }
        }
  
        return arr;
    }
