package Arrays;

import java.util.Scanner;

public class Onedimenoddindex {
    static void printOddIndex(int num, Scanner sc){
        int i;
        int[] ar= new int[num];
        for(i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(i=0;i<ar.length;i++){
            if(i%2!=0){
                System.out.print(ar[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printOddIndex(num, sc);
    }
}
