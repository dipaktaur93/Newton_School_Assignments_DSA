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
                long low=0,high=N;
                while(low<high){
                   long  mid= (low+high+1)/2;  
                    long answer = mid*mid;                 
                    if(answer<=N){
                          low= mid;
                    }
                    else{
                        high=mid-1;
                      
                    }
                }
                System.out.println(low);
            }
	}
}
