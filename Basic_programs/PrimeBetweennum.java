import java.util.Scanner;

public class PrimeBetweennum {
        static boolean checkPrime(int num){
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                 return false;
                }
            }
                return true;
        }
        static void printPrime(int n1,int n2){
            for(int i=n1;i<=n2;i++){
                if(checkPrime(i)){
                    System.out.println(i);
                }
            }
        }
        public static void main(String[] args) {
            int n1=1;
            int n2=10;
            printPrime(n1, n2);
        }
}