package Arrays;
import java.util.Scanner;

public class Summaxmin {
    static void maxMINsum(int [] ar){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        System.out.println("min : "+(sum-max));
        System.out.println("max : "+(sum-min));
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        maxMINsum(ar);
    }
}
