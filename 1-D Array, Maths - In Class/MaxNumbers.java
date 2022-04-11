import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static void print3largest(int arr[], int arr_size)
    {
        int i,first,second,third;
        if(arr_size < 3){
            //System.out.println("Invalid Input");
            return;
        }
        third = first=second=Integer.MIN_VALUE;
        for(i=0;i< arr_size;i++){
            if(arr[i] > first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i] >second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third)
            third=arr[i];
        }
        System.out.println(""+first+" "+second+" "+third);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long T=in.nextInt();
        for(int k=0;k<T;k++){
            int n=in.nextInt();
            int arr[]=new int[n];
            for(int m=0;m<n;m++){
                arr[m]=in.nextInt();
            }
            print3largest(arr, n);
            }
    }

}
