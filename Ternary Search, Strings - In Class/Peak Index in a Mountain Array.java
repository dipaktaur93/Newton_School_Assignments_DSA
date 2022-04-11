import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = -1, res = -1;
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				res = i;
			}
		}
		System.out.print(res);
	}
}
