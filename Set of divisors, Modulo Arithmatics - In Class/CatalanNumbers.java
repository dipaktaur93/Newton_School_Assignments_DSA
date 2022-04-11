// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
             long m=1000000007;
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		long arr[]=new long[n+1];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n+1;i++){
			for(int j=0;j<i;j++){
				arr[i]=(((arr[j]%m)*(arr[i-j-1]%m))%(m) +arr[i]%(m))%m;
			}
		}
		System.out.println(arr[n]);
		
	}
}
}
