import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        checkArmstrong(num);
    }
    public  static void checkArmstrong(int num) {
        int count = 0;
        int orignalNum = num;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int sum = 0;
        num=orignalNum;
        while (num != 0) {
            int rem = num % 10;
            int res = Multiple(count, rem);
            sum = sum + res;
            num = num / 10;
        }
        if(orignalNum==sum){
            System.out.print("Armstrong num");
        }else{
            System.out.print(" not Armstrong num");
        }
    }

    public static int Multiple(int count,int rem) {
        int multiple = 1;
        for (int i = 1; i <= count; i++) {
            multiple = multiple * rem;
        }
        return multiple;
      }
}

