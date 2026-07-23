class Car {
    String name;
    byte millege;
    float cost;
    
}
public class Passbyreference {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="KIA";
        c1.millege=19;
        c1.cost=9.55f;
        System.out.println(c1.name  );
         System.out.println( c1.millege  );
          System.out.println( c1.cost );
        Car c2;
        c2=c1;
        System.out.println(c2.name  );
         System.out.println( c2.millege  );
          System.out.println( c2.cost );
    }
    
}
