import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num;
        boolean flag = true;
        while(flag){
            for(long i =2;i<=Math.sqrt(a);i++){
            if(a % i ==0){
                flag = false;
                break;
            }
        }
        if(flag == false){
            a++;
            flag = true;
        }
        else{
        break;
        }
        }
        System.out.println(a - num);
    }
}
