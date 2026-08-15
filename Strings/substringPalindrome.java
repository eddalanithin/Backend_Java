import java.util.Scanner;

public class substringPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        PrintAllsubstringPalindrome(s);
    }
    static  void PrintAllsubstringPalindrome(String s){

       for(int size=1;size<=s.length();size++){
            for(int i=0;i<=s.length()-size;i++){
                String t="";
                for(int j=i;j<i+size;j++){
                   t=t+s.charAt(j);
                }
                if(isPalindrome(t)){
                    System.out.println(t);
                }
            }
        }

    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
