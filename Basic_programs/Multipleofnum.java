import java.util.Scanner;

public class Multipleofnum {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if( num%100==53){
        System.out.println("Divisible");
    }else{
        System.out.println("not divisible");
    }
    sc.close();
}
}
