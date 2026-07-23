import java.util.Scanner;
public class Fabbinaci {
    static int fabbinaciSeries(int num,int upto){
        if(num==0){
            return 0;
        }
        int a=0,b=1;
        for(int i=2;i<upto;i++){
            int temp=a+b;
            a=b;
            b=temp;
            
        }
        return b;
    }
    public static  void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
            int num=sc.nextInt();
        System.out.println("enter upto : ");
        int upto= sc.nextInt();
        int fabbNum = fabbinaciSeries(num,upto);
        }
    }


