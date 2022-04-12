import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	static long lenOfLongSubarr(int[] arr, int n, int k)
    {
       
             HashMap<Long, Long> map = new HashMap<>();
             long sum = 0, maxLen = 0;
 

             for (int i = 0; i < n; i++) {
                 
       
                  sum += arr[i];

                  if (sum == k)
                      maxLen = i + 1;
 
                  if (!map.containsKey(sum)) {
                      map.put(sum, (long)i);
                  }
 
                  if (map.containsKey(sum - k)) {
                       
              
                      if (maxLen < (i - map.get(sum - k)))
                          maxLen = i - map.get(sum - k);
                  }
             }
              
             return maxLen;    
	}
	public static void main (String[] args) {
                      // Your code here

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0; j<n; j++){
				arr[j] = sc.nextInt();
			}
		System.out.println(lenOfLongSubarr(arr, n, k));
		}
	}
}
