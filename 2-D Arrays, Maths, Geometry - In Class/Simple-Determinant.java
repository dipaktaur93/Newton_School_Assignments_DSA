import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                   Scanner sc = new Scanner(System.in);
				   int n=sc.nextInt(); 
				   int m=sc.nextInt();
				   int g=sc.nextInt();
				   int c=sc.nextInt(); 
				   System.out.println((n*c)-(m*g)); 
	}
}
