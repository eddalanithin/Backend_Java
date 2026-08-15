import java.util.Scanner;
public class Subsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=sc.nextLine();
        System.out.print(checkSubsequence( s,k));
    }
    public static String checkSubsequence(String s,String k){
        int i=0;
        int j=0;
        while(i<s.length()&&j<k.length()){
            if(s.charAt(i)==k.charAt(j)){
                i++;
                j++;
            }
            else{
               i++;
            }
        }
        return k.length()==j ? "Yes":"No";

    }

}
