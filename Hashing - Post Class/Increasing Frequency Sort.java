import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] str1 = str.split(" ");
        int[] arr = new int[n];
         HashMap<Integer,Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        arr = frequencySort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
	}
    static Map<Integer,Integer>map;
    public static int[] frequencySort(int[] nums)
    {
        map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,1+map.get(i));
            }else{
                map.put(i,1);
            }
        }
        Integer[]arr=new Integer[nums.length];
        int k=0;
        for(int i:nums){
            arr[k++]=i;
            
        }
        Arrays.sort(arr,new Comp());
        k=0;
        for(int i:arr){
            nums[k++]=i;
        }
        return nums;
    }
}
class Comp implements Comparator<Integer>{
    Map<Integer,Integer>map=Main.map;
    public int compare(Integer a,Integer b){
        if(map.get(a)>map.get(b))return 1;
        else if(map.get(b)>map.get(a))return -1;
        else{
            if(a>b)return -1;
            else if(a<b)return 1;
            return 0;
        }
    }
}
