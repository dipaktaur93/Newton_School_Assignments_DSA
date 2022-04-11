import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
            int testCases = scan.nextInt();
			for(int x=1;x<=testCases;x++){
				int N =scan.nextInt();
				long[] arr = new long[N];
				long X = scan.nextLong();
				for(int j=0;j<N;j++){
				  arr[j] = scan.nextLong();
				}
				int l=-1,r=N-1,mid;
				while(l<r){
					mid=(l+r+1)/2;
					if(arr[mid]<=X){
						l=mid;
					}
					else{
						r=mid-1;
					}
				}
				System.out.println(l);
			}
	}
}
