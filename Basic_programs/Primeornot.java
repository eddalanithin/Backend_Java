public class Primeornot {
    public static void main (String[] args){
        int n=2;
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is prime num");
        }else{
            System.out.println(n+" is not prime number");
        }
        
    }
}
