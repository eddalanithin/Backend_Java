public class Daythree {
    public static void main(String[] args) {
        int a=97;
        int b=100;
         // int c=5;
         // int d=350;
        // System.out.println((char)a);
     /*  if(a>=0){
        System.out.println(a);
      }else{
        System.out.println(a*(-1));
      } 
               (OR)
           USING TENARY OPERATOR
        System.out.println(a>=0?a:-(a)); */
      //  System.out.println(a>b>c>d?a::b::c::d);
    
      /*  biggest among 4 variables
     
     if(a>b && a>c&& a>d){
        System.out.println(a);
      }else if(b>a && b>c &&b>d){
 System.out.println(b);
      }else if(c>a && c>b &&c>d){
         System.out.println(c);
      }else{
         System.out.println(d);
      } */
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a+" "+b);
    }

}
