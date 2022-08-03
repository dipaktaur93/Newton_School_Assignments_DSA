import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		int n=(int)Math.pow(2,k);
		int[] arr = new int[n];
		for(int i=0 ; i<n ;i++){
			arr[i]=sc.nextInt();
		}
		Queue<Integer> win = new ArrayDeque<>();
		Queue<Integer> los = new ArrayDeque<>();
		for(int i=0 ;i<n-1 ;i+=2){
			int winner = Math.max(arr[i],arr[i+1]);
			win.add(winner);
			int loser = Math.min(arr[i],arr[i+1]);
			los.add(loser);
		}
		while(win.size()!=1){
            int winner1 = win.remove();
			int winner2 = win.remove();
			int loser1 = los.remove();
			int loser2 = los.remove();
			win.add(Math.max(winner1+loser2,winner2+loser1));
			los.add(Math.min(winner1+loser2,winner2+loser1));
			
		}
		System.out.println(win.remove());		
		
	}
}
