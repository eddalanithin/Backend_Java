import java.util.Scanner;
public class Reversestring {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         ReverseOfString(s);
    }
    static  void ReverseOfString(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){

            }else{
                t= t+c;
            }
        }
        System.out.print(t);
    }

}
