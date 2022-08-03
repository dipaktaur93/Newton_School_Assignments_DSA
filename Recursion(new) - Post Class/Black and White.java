import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
                      // Your code here
					  StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int T = Integer.parseInt(s);
        for (int t=0; t<T; t++) {
            s = reader.readLine();
            int index = s.indexOf(' ');
            long N = Integer.parseInt(s.substring(0,index));
            long M = Integer.parseInt(s.substring(index+1));
            if (N < M) {
                long temp = N;
                N = M;
                M = temp;
            }
            long answer;
            if (M == 1) {
                answer = 0;
            } else if (M == 2) {
                if (N == 2) {
                    answer = 0;
                } else if (N == 3) {
                    answer = 4;
                } else {
                    answer = 2*N*M-8;
                }
            } else if (M == 3) {
                if (N == 3) {
                    answer = 16;
                } else {
                    answer = 4*N*M-20;
                }
            } else {
                answer = (N-4)*(8*M-12)+2*(4*M-6)+2*(6*M-10);
            }
            BigInteger all = BigInteger.valueOf(N*M);
            BigInteger result = all.multiply(all.add(BigInteger.ONE.negate())).add(BigInteger.valueOf(-answer));
            //System.out.println(result);
            output.append(result).append("\n");
        }
        System.out.print(output);
	}
}
