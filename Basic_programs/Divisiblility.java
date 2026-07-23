 import java.util.*;
public class Divisiblility {
    static void divisibleOfNum(int num ){
        System.out.println(num%5==0?"divisble":"not divisible");
    }
    public static void main(String[] args){
        int num=100;
        divisibleOfNum(num);
    }
}
