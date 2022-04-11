import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
          Scanner scan = new Scanner(System.in);
		  long m = scan.nextLong();
		  long n= scan.nextLong();
		  long ans= GCD(m,n);
		  System.out.println(ans);
}
static long GCD(long a,long b){
	if(a==0){
		return b;
	}
	if(b==0){
		return a;
	}
	if(a>b){
		return GCD(a-b,b);
	}
	return GCD(a,b-a);
}
}
