import java.util.Scanner;
public class PosNegnum {
    public static void main (String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num>0){
    System.out.println(num+" postive num");
}else if(num<0){
System.out.println(num+" negative num");
}
else{
    System.out.println("zero");
}
sc.close();
    }

    
} 