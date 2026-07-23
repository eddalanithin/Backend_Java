class Demo{
    int a1;
    float f1;
    boolean b1; 
    /* ( this instant varible,inside method that has default literals set by the JVM,
         memory alloaction in heap segment)*/
}
public class LocalInstantvariables {
    public static void main(String[] args){
        /* 
        int a;
        float f;
        boolean b;
        System.out.println(a+"_"+f+"_"+b);
        ( this local varible,inside main method that should initialized,
         memory alloaction in stack segment)*/
       Demo d1=new Demo();
        System.out.println("Default value in heap segment Set by JVM = "+d1.a1);
        System.out.println("Default value in heap segment Set by JVM = "+d1.f1);
        System.out.println("Default value in heap segment Set by JVM = "+d1.b1);
         d1.a1=46;
         d1.f1=46.0f;
         d1.b1=true;
         System.out.println("initialized literals = "+d1.a1);
        System.out.println("initialized literals = "+d1.f1);
        System.out.println("initialized literals = "+d1.b1);
    }
}

