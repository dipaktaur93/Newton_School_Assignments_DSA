import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		long m=1000000007;
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		long cd=(long)Math.pow(c,d);
        long bc=fastPower(b,cd,(m-1));
		// System.out.println(fastPower(c,d,m-1)%m-1);	
    	// System.out.println(fastPower(b,cd,m-1));
		System.out.println(fastPower(a,bc,m));
		
	}
	static long fastPower(long a,long b ,long m)
	{	
		long ans=1;
		if(b==0){
			return 1;
		}
		while(b>0){
			if((b&1)!=0){
				ans=(ans*a)%m;

			}
			a=(a*a*1)%m;
			b>>=1;

		}
		return ans;

	}
}
