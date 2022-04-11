static void NewtonSchool(int n)
{
for(int i=1;i<=n;i++)
{
 if(i%3==0 && i%5==0)
 {
     System.out.print("NewtonSchool ");
     }
 else if(i%5==0){
     System.out.print("School ");
     }
 else if(i%3==0)
 {
     System.out.print("Newton ");
     }
 else{System.out.print(i+" ");
 }
}
}
