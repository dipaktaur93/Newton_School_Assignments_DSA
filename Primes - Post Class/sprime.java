import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		 boolean[] b = new boolean[10000001];
	 for(int p = 2 ;p*p<=10000000 ; p++){
		 if(!b[p]){
			 for (int i = p * p; i <= 10000000; i += p){
                    b[i] = true;
			 }
		 }
	 }
	 
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0 ; t<T ; t++){
			int n = scan.nextInt();
			int c = 0,i=(n/2)+1;
            while(i<=n){
			if(!b[i]){					
					c++;					
				}
				if(i%2==0){
					i++;
				}else{
					i=i+2;
				}
			}
			System.out.println(c);
                     
	}
	
}

}
