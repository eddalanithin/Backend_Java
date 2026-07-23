import java.util.Scanner;
public class Disivibleornot {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
/*if(num%8==0){
    System.out.println("yes");
}else{
    System.out.println("no");
}
sc.close();
*/
//      USING TENARY OPERATOR
        System.out.println(num%8==0?"yes":"no");
}
}
