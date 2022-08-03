import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String str1 = br.readLine();
			String[] str2 = str1.split(" ");
			long[] arr = new long[n];
            PriorityQueue<Long> pq = new PriorityQueue<>();
			for(int i = 0; i < n; ++i) {
				arr[i] = Integer.parseInt(str2[i]);
                pq.add(arr[i]);
			}
			// System.out.println(pq);
            long res = 0;
            while(pq.size() > 1) {
                long first = pq.poll();
                long second = pq.poll();
                res += first + second;
                pq.add(first+second);
            }
            System.out.println(res);
			
		}
	}
 
    
}
