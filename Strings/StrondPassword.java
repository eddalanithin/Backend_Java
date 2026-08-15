import java.util.Scanner;
public class StrondPassword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        strongPassword(s);
    }
    static void strongPassword(String s){
        int norCount=0;
        for(int i=0;i<s.length();i++){
           int c=s.charAt(i);

            if(c>=65 && c<=90){
                norCount++;
            }
            if(c>=97 &&c<=122){
                norCount++;
            }
            if(c>=48 && c<=97){
                norCount++;
            }
            if(c>=33 && c<=47 ||c>=58 && c<=64||c>=91 && c<=96 ||c>=123 && c<=126){
                norCount++;
      }
        }
        System.out.print(norCount);
    }
}
