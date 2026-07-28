package Arrays;

import java.util.Scanner;

public class Repeatednum {
    static int repeatedNuminARRAY(int[] ar,int num){
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("enter num:");
        int num=sc.nextInt();
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int res=repeatedNuminARRAY(ar,num);
        System.out.print(res);

    }
}
