import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class 	Main{
public static void findLongestSubstring(String str)
{
    int i;
    int n = str.length();
    
    int st = 0;
     
    int currlen = 0;
    
    int maxlen = 0;
     
    int start = 0;
     
    HashMap<Character,
            Integer> pos = new HashMap<Character,
                                        Integer>();
     
    pos.put(str.charAt(0), 0);
     
    for (i = 1; i < n; i++)
    {
        if (!pos.containsKey(str.charAt(i)))
        {
            pos.put(str.charAt(i), i);
        }
        else
        {
            if (pos.get(str.charAt(i)) >= st)
            {
                currlen = i - st;
                if (maxlen < currlen)
                {
                maxlen = currlen;
                start = st;
                }
                st = pos.get(str.charAt(i)) + 1;
            }
            pos.replace(str.charAt(i), i);
        }
    }
    if (maxlen < i - st)
    {
        maxlen = i - st;
        start = st;
    }
     
  int length= str.substring(start,
                         start +
                         maxlen).length();
	 System.out.print(length);					 
}
 
public static void main(String[] args)
{   
	Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
	findLongestSubstring(str);
    
}
}
