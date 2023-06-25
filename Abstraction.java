
abstract class Animal{
    abstract void walk();
    public void eats(){
           System.out.println("eats grass");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");

    }
}
class Chicken extends Animal{
    public void walk()
    {
        System.out.println("walks on 2 legs");
    }
}




public class Abstraction {
    public static void main(String []args)
    {
        Horse horse=new Horse();
        horse.walk();

        horse.eats();
    }
    
}
