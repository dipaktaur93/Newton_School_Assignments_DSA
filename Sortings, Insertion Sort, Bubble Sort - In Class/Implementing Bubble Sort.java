import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0 ; i<test;i++){
            int n = sc.nextInt();
            int[] arr= new int[n];
            for(int x=0;x<n;x++){
                arr[x]=sc.nextInt();                              
            }
            int temp; 
            for(int j=0 ; j<n ; j++){
                boolean flag = false;
                for(int k = 0 ; k<n-1-j ;k++){
                    if(arr[k]>arr[k+1]){
                        temp = arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                        flag=true;
                    }
                }
                if(!flag){
                    for(int x=0;x<n;x++){
                        System.out.print(arr[x]+" ");                                    
                    }
                    break;
                }
            }                          
            System.out.println();                              
        }
	}
}
