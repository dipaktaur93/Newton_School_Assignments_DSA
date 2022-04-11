import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		while(t-->0){
		    long n = sc.nextLong();
		    int arr[] = new int[(int)n];
		    for(long i=0; i<n; i++){
		        arr[(int)i] = sc.nextInt();
		    }
		   

		    long mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE; 
        long max_index = 0, min_index = 0;
        for(long i=0; i<n; i++){
            if(maxi < arr[(int)i]){
                maxi = arr[(int)i];
                max_index = i;
            }
            if(mini > arr[(int)i]){
                mini = arr[(int)i];
                min_index = i;
            }
        }
        
        int flag = 0;
        if(max_index == min_index -1)
            flag = 1;
        else if(min_index == max_index - 1)
            flag = -1;
        
        if(flag == 1){
            for(long i = 1; i<=max_index; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            for(long i = min_index+1; i<n; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]<=arr[(int)n-1])
                flag = 0;
        } else if(flag == -1){
            for(long i = 1; i<=min_index; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            for(long i = max_index+1; i<n; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]>=arr[(int)n-1])
                flag = 0;
        }
        
        if(flag == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
		}
	}
}
