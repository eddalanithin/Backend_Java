public class Countdigits {

    static int  countDigitsinnum(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int num=-99038;
      int digitsinNum= countDigitsinnum(num);
        System.out.print(digitsinNum);
    }
}
