import java.io.*;
import java.util.*;
class Main
 {
 static int mod = 1000000007;
public static void main(String[] args)throws IOException {
BufferedReader read = new BufferedReader(new 
InputStreamReader(System.in));
 //int t = Integer.parseInt(read.readLine());
 String str[] = read.readLine().trim().split(" ");
int n = Integer.parseInt(str[0]);
long a =Long.parseLong(str[1]);
long b = Long.parseLong(str[2]);
long c = Long.parseLong(str[3]);
long dp[] = new long[n];
dp[0] = a;
dp[1] = b;
dp[2] = c;
for(int i = 3; i < n; i++)
{
 dp[i] = (dp[i-1]%mod + dp[i-2]%mod + dp[i-3]%mod)%mod;
}
 System.out.println(dp[n-1]);
 }
 
}
