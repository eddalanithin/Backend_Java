import java.util.Scanner;
public class Currancyconversion {
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    float dollarvalue=89.4f;
    System.out.println("enter value");
    int dollars=sc.nextInt();
    double indianrupee=dollars*dollarvalue;
    System.out.printf("%.4f",indianrupee);
    }
    
}
