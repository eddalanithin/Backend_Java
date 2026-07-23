import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  num1 = ");
    double num1=sc.nextDouble();
    System.out.println("enter the  num2 = ");
   double num2=sc.nextDouble();
   System.out.println("enter the  operator (+,-,*,/) = ");
   char operator=sc.next().charAt(0);
   double res;
    switch (operator) {
        case '+':
            res=num1+num2;
            System.out.println("sum = "+res);
            break;
             case '-':
            res=num1-num2;
            System.out.println("sub = "+res);
            break;
             case '*':
            res=num1*num2;
            System.out.println("mul = "+res);
            break; case '/':
            res=num1/num2;
            System.out.println("div = "+res);
            break;
        default:
            break;
    }
    sc.close();
}
    
}