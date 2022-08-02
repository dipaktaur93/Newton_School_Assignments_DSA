import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    Donation();
    }
    public static void Donation(){
        Scanner sc = new Scanner(System.in);
        int numOfPeople = sc.nextInt();
        long[] perHeadDonation = new long[numOfPeople];
        long sum=0;
        for(int i = 0; i<numOfPeople;i++){
            perHeadDonation[i]=sc.nextInt();
            sum=sum+perHeadDonation[i];
        }
        System.out.print ("0 ");//for first donation
        for(int i = 1;i<perHeadDonation.length;i++){

            if(perHeadDonation[i]<perHeadDonation[i-1]){
                System.out.print (perHeadDonation[i-1]-perHeadDonation[i]+" ");
                sum=sum+(perHeadDonation[i-1]-perHeadDonation[i]);
                perHeadDonation[i]=perHeadDonation[i-1];
            }
            else{
             System.out.print("0 ");
            }
        }
        System.out.println("");
        System.out.print(sum)   ;
    }
}
//Dipak
