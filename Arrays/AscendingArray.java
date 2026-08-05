import java.util.Scanner;
public class AscendingArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] ar=new int[n1];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        ArrayInAscending(ar);
    }
    public static void ArrayInAscending(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
