import java.util.Scanner;
public class SortedArrayCommonElements {
    public  static  void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int[] ar2=new int[size2];
        for(int i=0;i<ar2.length;i++){
            ar2[i]=sc.nextInt();
        }
        RepeatingOddElements(ar,ar2);

    }
    public static void RepeatingOddElements(int[] ar,int[] ar2){
        boolean found=false;
        int i=0;
        int j=0;
        while(i<ar.length && j<ar2.length){
            if(ar[i]<ar2[j]){
                  i++;
            }else if(ar[i]==ar2[j]){
                if(ar[i]%2!=0) {
                    System.out.print(ar[i] + " ");
                    found=true;
                }
                j++;i++;
            }else{
                j++;
            }
        }
        if(found==false){
            System.out.print(" No common odd elements found ");
        }
    }
}
