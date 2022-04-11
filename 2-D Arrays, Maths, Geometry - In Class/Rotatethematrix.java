import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {



	static void printMyTwoDArray(int[][] arr){

		 for(int i =0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
            }
       	  System.out.println();
        }
	}


	static void  rotateNinetyDegree(int[][] arr,int n){  
			for(int i=0;i<n/2;i++){            
				for(int j=i;j<n-i-1;j++){     
					int temp=arr[i][j]; 
					arr[i][j]=arr[n-1-j][i];    
					arr[n-1-j][i]=arr[n-1-i][n-1-j];
					arr[n-1-i][n-1-j]=arr[j][n-1-i];
					arr[j][n-1-i]=temp;
				}
			}
	}

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];

		for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        a[i][j]= sc.nextInt();
	       }
	    }

		rotateNinetyDegree(a,n);
		printMyTwoDArray(a);

		System.out.println();

		rotateNinetyDegree(a,n);
		printMyTwoDArray(a);

	}
}
