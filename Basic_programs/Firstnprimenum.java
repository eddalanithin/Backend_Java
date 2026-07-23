public class Firstnprimenum {

        static boolean checkPrime(int num){
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                 return false;
                }
            }
                return true;
        }
        static void printPrime(int n){
            int count=0;
            for(int i=2;count<n;i++){
                if(checkPrime(i)){
                    System.out.println(i);
                    count++;
                }
            }
        }
        public static void main(String[] args) {
            int n=5;
            printPrime(n);
        }

}
