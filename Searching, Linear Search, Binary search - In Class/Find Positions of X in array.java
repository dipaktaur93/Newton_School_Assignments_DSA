import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == x) {
                    arr1.add(i);
                }
            } 
            if(arr1.size() > 0) {
                for(int i : arr1) {
                    System.out.print(i+" ");
                } 
                } else {
                    System.out.print("Not found");
            }
            System.out.println();
            
        }
	}
}
