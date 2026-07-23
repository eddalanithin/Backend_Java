import java.util.Scanner;
public class Leavelasttwodigits {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
       System.out.println(num/10);
        /* to leave last two digit condition is(num/100=43), 
          for leave three digit condition is(num%1000=543),
          ... similarly  soon based on digits */
    

}

}
