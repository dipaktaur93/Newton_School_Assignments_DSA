import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  String x=sc.next();
					  char[] singleint =x.toCharArray();
					  int totalsum=0;
					  for(int i=0;i<singleint.length;i++){
						  totalsum=singleint[i]+totalsum;
					  }
					  if(totalsum%3==0){
						  System.out.print("Yes");
					  }else{
						  System.out.print("No");
					  }
  }
public static String findmodnumber(String number,int totalsum){
		if(number.length()==1){
			totalsum=Integer.parseInt(number)+totalsum;
			if(totalsum%3==0){
				return "Yes";
			}
			else{
				return "No";
			}
		}
return findmodnumber(number.substring(number.length()/2),totalsum);
	}

}
