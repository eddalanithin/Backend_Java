import java.util.Scanner;
public class Characters {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        countDifferentCharacter(s);
    }
    public static void countDifferentCharacter(String s){
        int vowelsCount=0;
        int consonantCount=0;
        int specialCount=0;
        int numberCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'||ch>='A'&& ch<='Z'){
                if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'&&
                        ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U'){
                    consonantCount++;
                }else{
                    vowelsCount++;
                }
            } else if (ch>=47 &&ch<=58) {
                numberCount++;
            }else {
                specialCount++;
            }
        }
        System.out.println("vowelsCount:"+vowelsCount);
        System.out.println("consonantCount:"+consonantCount);
        System.out.println("specialCount:"+specialCount);
        System.out.println("numberCount:"+numberCount);
    }
}
