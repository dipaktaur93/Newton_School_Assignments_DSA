import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	/*static int minXOR(int arr[], int n)
    {
        int min_xor = Integer.MAX_VALUE; // Initialize result

        // Generate all pair of given array
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)

                // update minimum xor value if required
                min_xor = Math.min(min_xor, arr[i] ^ arr[j]);

        return min_xor;
    }

    // Driver program

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minXOR(arr, n));
    }
}*/

    static int minXOR(int arr[], int n)
    {
        // Sort given array
        Arrays.parallelSort(arr);
 
        int minXor = Integer.MAX_VALUE;
        int val = 0;
 
        // calculate min xor of consecutive pairs
        for (int i = 0; i < n - 1; i++) {
            val = arr[i] ^ arr[i + 1];
            minXor = Math.min(minXor, val);
        }
 
        return minXor;
    }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int res = minXOR(arr, n);
		System.out.println(res);
	}
}
