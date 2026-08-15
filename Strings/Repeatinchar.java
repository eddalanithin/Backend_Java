
public class Repeatinchar {
    public static  void main(String[] args){

        String s="abaca";
        int num=10;
        int i=s.length();
        int j=0;

        while(i<=num){
            char c=s.charAt(j);
            s=s+c;
        }
        System.out.print(s);

    }
}
