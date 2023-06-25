

public class inherit {
    public static void main(String args[])
    {
          Triangle t1=new Triangle();
          t1.area();
    }
    
}
class Shape{
       public void area()
       {
         System.out.println("displays area");
       }
}
class Equilateraltriangle extends Shape{
      public void area(int l,int h)
      {
        System.out.println("(1/2*l*h)");
      }
}
class Triangle extends Equilateraltriangle{
       public void area()
       {
         System.out.println("(1/2)*b*h");
       }
}
