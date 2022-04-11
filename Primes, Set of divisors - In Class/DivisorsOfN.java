import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            
            System.out.println(countDivisors(sc.nextInt()));
        }

    }
    static int countDivisors(int n)
    {
        
        int count = 0, i;

       
        for (i = 1; i <= Math.sqrt(n); i++)
        {

            // Check if i is a factor
            if (n % i == 0)
            {
                // increase the count if i
                // is divisible by k
                if (i % 2 == 0)
                {
                    count++;
                }

                // (n/i) is also a factor
                // check whether it is divisible by k
                if ((n / i) % 2 == 0)
                {
                    count++;
                }
            }
        }

        i--;

        // If the number is a perfect square
        // and it is divisible by k
        if ((i * i == n) && (i % 2 == 0))
        {
            count--;
        }

        return count;
    }
}
