import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(kthDiff(arr, n, k));
		}
	}
	 static int countPairs(int[] a, int n, int mid)
    {
        int res = 0, value;
        for(int i = 0; i < n; i++)
        { 
            if(a[i]+mid>a[n-1])
              res+=(n-(i+1));
            else
            {
             int ub = upperbound(a, n, a[i]+mid);
             res += (ub- (i+1));
            }
        }
        return res;
    }
    static int upperbound(int a[], int n, int value)
    {
        int low = 0;
        int high = n;
        while(low < high)
        {
            final int mid = (low + high)/2;
            if(value >= a[mid])
                low = mid + 1;
            else
                high = mid;
        }
  
    return low;
    }
    static int kthDiff(int a[], int n, int k)
    {
        Arrays.sort(a);
        int low = a[1] - a[0];
        for (int i = 1; i <= n-2; ++i)
             low = Math.min(low, a[i+1] - a[i]);
        int high = a[n-1] - a[0];
        while (low < high)
        {
            int mid = (low + high) >> 1;
            if (countPairs(a, n, mid) < k)
                low = mid + 1;
            else
                high = mid;
        }
  
        return low;
    }
	 
}
