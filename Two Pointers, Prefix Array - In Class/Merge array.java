import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
         Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int left[] =new int[n];
		 int right[] =new int[m];
		 for(int i=0 ; i< n ; i++){
             left[i]=sc.nextInt();
		 }
		 for(int i=0 ; i< m ; i++){
             right[i]=sc.nextInt();
		 }
		 int i=0 , j=0;
		 while(i<n && j<m){
			 if(left[i]>right[j]){
				 System.out.print(right[j]+ " ");
				 j++;
			 }else{
				 System.out.print(left[i]+ " ");
				 i++;
			 }
		 }
		 while(i<n){
			 System.out.print(left[i]+ " ");
				 i++;
		 }
		 while(j<m){
			 System.out.print(right[j]+ " ");
				 j++;
		 }
	}
}
