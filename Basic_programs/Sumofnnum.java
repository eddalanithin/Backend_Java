import java.util.Scanner;
public class Sumofnnum {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num = ");
    int num=sc.nextInt();
    int sumofn=num*(num+1)/2;
System.out.println("sum of n numbers = "+sumofn);
sc.close();
}
    
}
