import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
          Scanner I=new Scanner(System.in);
					int a=I.nextInt();
          int[] ar= new int[a];
      
         for(int i=0;i<a;i++) ar[i]=I.nextInt();
         int n = ar.length;
        int []maxFromEnd = new int[n + 1];
  Arrays.fill(maxFromEnd, Integer.MIN_VALUE);

  for (int i = ar.length - 1; i >= 0; i--)
  {
    maxFromEnd[i] = Math.max(maxFromEnd[i + 1],
                             ar[i]);
  }
 
  int result = 0;
 
  for (int i = 0; i < ar.length; i++)
  {
    int low = i + 1, high = ar.length - 1,
        ans = i;
 
    while (low <= high)
    {
      int mid = (low + high) / 2;
 
      if (ar[i] <= maxFromEnd[mid])
      {

        ans = Math.max(ans, mid);
        low = mid + 1;
      }
      else
      {
        high = mid - 1;
      }
    }
    result = Math.max(result, ans-i);

  }if(result==0) 
  result= -1;
  System.out.print(result + "\n");
}
			  
}
