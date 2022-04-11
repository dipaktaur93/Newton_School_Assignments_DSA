import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int count=0,i=2;
			int[] primeArr=new int[50001];			
			while(count<50000){			
				if(isprime(i)){					
					count++;
					primeArr[count]=i;
				}
				if(i%2==0){
					i++;
				}else{
					i=i+2;
				}
			}
			long[] sumArray= new long[50001];
			sumArray[1]=primeArr[1];
			for(int j=2; j<=50000 ;j++ ){
				sumArray[j]=sumArray[j-1]+primeArr[j];
			}
			
		   for(int t=0 ; t<T ; t++){
			int L = scan.nextInt();
			int R = scan.nextInt();
			long result = sumArray[R]-sumArray[L-1];
			System.out.println(result);
			
			
		}

		scan.close();
		
                    
	}
	static boolean isprime(int n) {

		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for ( int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;

	}
}
