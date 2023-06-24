/**
 * oppsclass
 */
class Student{
          String name;
          int age;
          int marks;
          public void displayinfo()
          {
            System.out.println(name+" "+age+" "+marks);
          }
}
public class class1 {

    public static void main(String[]args)
    {
           Student s1=new Student();
           s1.name="radhika";
           s1.age=20;
           s1.marks=56;
           s1.displayinfo();
    }
}