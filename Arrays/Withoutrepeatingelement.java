package Arrays;

import java.util.Scanner;

public class Withoutrepeatingelement {
    static void printSortedarrayWithoutRepeatingEle(int [] ar) {

        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] != ar[i + 1]) {
                System.out.print(ar[i]+ " ");
            }
        }
        System.out.print(ar[ar.length-1]+ " ");
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
        printSortedarrayWithoutRepeatingEle(ar);
    }
}
