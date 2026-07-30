import java.util.Scanner;
public class Printsubarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] ar=new int[n1];
        for(int i=0;i<ar.length;i++){
           ar[i]=sc.nextInt();
        }
        int size=sc.nextInt();
        printAllSubarrayforsize(ar,size);
    }
    static  void printAllSubarrayforsize(int[] ar,int size){
        for(int i=0;i<=ar.length-size;i++){
            for(int j=i;j<i+size;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}
