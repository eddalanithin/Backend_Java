public class Sumofdigit {
    public static void main(String[] args){
    int num=87;
    int sum=0;
    if(num>0){
       while(num>0){
        int result=num%10;
        sum+=result;
        num=num/10;
       }
       System.out.println(sum);
    }else{
        System.out.print("num is invalid");
    }
    
 }
}