import java.util.Scanner;
public class Lcmin {
   static void firstFivelcm(int num1,int num2,int end) {
    int count=0;
    for(int i=1;count<end;i++){
        if(i%num1==0 &&i%num2==0){
            System.out.println(i);
        }
        count++;
    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st : ");
    int num1=sc.nextInt();
    System.out.println("enter 2nd : ");
    int num2=sc.nextInt();
     System.out.println("enter end : ");
    int end=sc.nextInt();
    firstFivelcm(num1, num2, end);

   }
}

