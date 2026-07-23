import java.util.Scanner;
public class Divmulsubsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        sc.close();
    }
}
