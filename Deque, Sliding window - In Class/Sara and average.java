import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		int[] arr= new int[n+1];
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=1 ;i<=n ; i++){
			arr[i]=sc.nextInt();
		}
		long sum=0;
		for(int i=1;i<w;i++){
			sum+=arr[i];
			System.out.print(sum/i+" ");
		}
		int prev=0;
		for(int i=w ; i<=n ;i++){
			sum = sum+arr[i]-arr[prev];
			prev++;
			System.out.print(sum/w+" ");
		}
	}
}
