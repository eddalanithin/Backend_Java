public class Palindrome {

        static int palindromenuCheck(int num){
            int rev=0;
            while(num!=0){
                int remainder=num%10;
                rev=rev*10+remainder;
                num=num/10;
            }
            return rev;
        }
        public static void main(String[] args){
            int num=-232;
            int palinfromnum=palindromenuCheck(num);
            System.out.print(palinfromnum==num?"Palindrome":" not Palindrome");

        }


}
