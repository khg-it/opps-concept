class Home{
    String address;
    String ownername;
    public void getinfo()
    {
        System.out.println(address);
        System.out.println(ownername);
    }
    Home(Home h2)
    {
           this.address=h2.address;
           this.ownername=h2.ownername;
    }
    Home()
    {

    }
}
public class Copy{
    public static void main(String[]args)
    {
        Home h1=new Home();
        h1.address="tulsi bagh dayal bagh agra";
        h1.ownername="Shri bhagwan Saraswat";
        Home h2=new Home(h1);
        h2.getinfo();
    }

}