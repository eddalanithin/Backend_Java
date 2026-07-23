public class Eveninnum {

    static  void  checkHowmanyeveninnum(int num){
       while(num!=0){
         int last=num%10;
         if(last%2==0){
        System.out.print(last+" ");
         }
         num=num/10;
        }
    }
    public static  void main(String[] args){
        int num=708498;
        checkHowmanyeveninnum(num);

    }
}
