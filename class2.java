class Pen {
        String Penname;
        String type;
        public void writesomething(){
            System.out.println("write something");
            System.out.println(this.Penname+" "+this.type);
        }
}
public class class2{
       public static void main(String args[])
       {
        Pen p1=new Pen();
        p1.Penname="wink";
        p1.type="ball-point";
        p1.writesomething();
        Pen p2=new Pen();
        p1.Penname="uranium";
        p1.type="gel";
        p1.writesomething();

       }
}


