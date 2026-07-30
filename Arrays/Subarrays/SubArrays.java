import java.util.Scanner;
public class SubArrays {
    public static  void main(String[] args){
     Scanner sc = new Scanner( System.in);
     int n1=sc.nextInt();
     int[] ar= new int[n1];
     for(int i=0;i<ar.length;i++){
         ar[i]= sc.nextInt();
     }
     int k= sc.nextInt();
     SubArraysWithSumk(ar,k);
    }
    static void SubArraysWithSumk(int[] ar,int k){
      for(int size=1;size<ar.length-1;size++){
          for(int i=0;i<=ar.length-size;i++){
              int sum=0;
              for(int j=i;j<i+size;j++) {
                sum=sum+ar[j];
              }
              if(sum==k){
                  for(int j=i;j<i+size;j++) {
                      System.out.print(ar[j]+" ");
                  }
                  System.out.println();
              }
          }
      }
    }
}
