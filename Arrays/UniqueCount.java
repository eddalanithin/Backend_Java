package Arrays;

import java.util.Scanner;

public class UniqueCount {
    static void printUniqueCount(int [] ar) {
        int uniqueCount=0;
        int count = 1;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != ar[i + 1]) {
                if (count == 1) {
                   uniqueCount++;
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count == 1) {
            uniqueCount++;
        }
        System.out.println(uniqueCount);
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
        printUniqueCount(ar);
    }
}
