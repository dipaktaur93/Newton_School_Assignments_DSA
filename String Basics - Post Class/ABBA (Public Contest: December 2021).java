import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s = sc.next();
            int a=0,b=0;
            for(int i=0; i<n;i++){
                if(s.charAt(i)=='a'){
                    a++;
                }else{
                    b++;
                }
            }
            int result = Math.min(a,b);
            System.out.print(result);
	}
}
