import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                    
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0 ; i<test;i++){
            int l = sc.nextInt();
            int[] arr= new int[l];
            for(int x=0;x<l;x++){
                arr[x]=sc.nextInt();                              
                }
            int[] res = insertsort(arr,l);                          
            for(int x : res){
                System.out.print(x+" ");                              
            }
           System.out.println();
                              
        }
	}
    static int[] insertsort(int []arr , int n){
        int j;
        for(int i =0 ; i<n ; i++){
            int key=arr[i];
            for(j=i;j>0;j--){
                if(key < arr[j-1]){
                    arr[j]=arr[j-1];
                }
                else{
                    break;
                }
            }
            arr[j] = key; 

        }
        return arr;
    }
}
