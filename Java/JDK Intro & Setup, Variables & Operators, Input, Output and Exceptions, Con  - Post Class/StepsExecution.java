import java.io.*; // for handling input/output
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
    int number;
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();
		int i;
		i= (((number + 8)/3)%5)*5;
		System.out.println(i);
		
		
	}

}
