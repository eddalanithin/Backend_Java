package Arrays;

import java.util.Scanner;

public class SortedarrayOccurence {
    static void printSortedarrayOccurence(int [] ar) {
        int count = 1;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] == ar[i + 1]) {
                count++;
            } else {
                System.out.println(ar[i] + "- " + count);
                count=1;
            }
        }
            System.out.println(ar[ar.length-1]+"- " + count);
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of an array :");
            int size = sc.nextInt();
            System.out.println("enter array elements :");
            int[] ar = new int[size];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            printSortedarrayOccurence(ar);
        }
}
