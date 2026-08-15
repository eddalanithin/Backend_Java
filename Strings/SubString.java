import java.util.Scanner;

public class SubString {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int size=sc.nextInt();
            printSubstring(s,size);
        }
        public static void printSubstring(String s,int size){

            for(int i=0;i<s.length()-size;i++){
                for(int j=i;j<i+size;j++){
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }


}
