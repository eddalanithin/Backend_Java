import java.util.Scanner;
public class Checklastdigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%10==5){
            System.out.println("num is true as 5");
        }else{
            System.out.println("num is False because it doesnot end with given conditon 5");
        }
        sc.close();
        /* for last two digit condition is(num%100=43), 
          for last three digit condition is(num%1000=543),
          ... similarly  soon based on digits */
    }

}
