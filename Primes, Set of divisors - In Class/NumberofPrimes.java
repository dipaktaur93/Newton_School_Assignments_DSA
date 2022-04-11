import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int count =0;
        boolean bool = true;
        for(int i=2; i<=size; i++){
            for(int j =2; j*j<=i; j++){
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                count++;
            }
            bool = true;
        }
        System.out.println(count);
    
    }
}
