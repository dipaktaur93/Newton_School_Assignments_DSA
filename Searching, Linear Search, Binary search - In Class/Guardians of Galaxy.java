import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i<n; i++) {
            h[i] = scan.nextInt();
        }

        long l = 0;
        long r = Integer.MAX_VALUE;

        long ans = 0;

        while(l<r){
            long m = l+(r-l)/2;
            if(checkWithValue(h,n,m)){
                r = m;
                ans = m;
            }
            else{
                l = m+1;
            }
        }

        System.out.println(ans);

	}

    public static boolean checkWithValue(int[] h, int n, long thrust){

        for(int i=0;i<n;i++){
            thrust += thrust - h[i];
            if(thrust >= Integer.MAX_VALUE)
                return true;
            if(thrust < 0)
                return false;
        }

        return true;
    }

   
}
