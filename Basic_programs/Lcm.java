
import java.util.Scanner;
public class Lcm {
    static void lcma(int num1,int num2,int end){
        for(int i=1;i<=end;i++){
            if(i%num1==0 && i%num2==0){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args){
        int num1=2;
        int num2=5;
        int end=25;
        lcma(num1,num2, end);
    }
}

