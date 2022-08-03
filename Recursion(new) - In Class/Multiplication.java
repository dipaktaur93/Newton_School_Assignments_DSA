static int  Multiply_by_recursion(int M, int N) 
    { 
  //Enter your code here
   if(N==0 || M==0){
    return 0;
  }

if(M==1)
{ return N; }
return N + Multiply_by_recursion(N,M-1);
    }
