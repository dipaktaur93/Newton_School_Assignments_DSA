import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    

public static void main(String []args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                        String str = sc.next();
                        int length = longestUniqueSubsttr(str);
                        System.out.println(length);
                }
        }
static int longestUniqueSubsttr(String s){
              
               HashMap<Character, Integer> seen = new HashMap<>();
               int maximum_length = 0;

              
               int start = 0;

               for(int end = 0; end < s.length(); end++) {
                       
                       if(seen.containsKey(s.charAt(end))){
                               
                               start = Math.max(start, seen.get(s.charAt(end)) + 1);
                       }

                       
                       seen.put(s.charAt(end), end);
                       maximum_length = Math.max(maximum_length, end-start + 1);
               }
               return maximum_length;
       }
}
