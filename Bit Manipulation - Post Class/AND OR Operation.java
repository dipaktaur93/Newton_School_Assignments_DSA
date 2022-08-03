import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=0; i<T; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			int res = a;

			res = ((k == 1) ? a & b : b);
			
			System.out.println(res);
		}
	}
}
