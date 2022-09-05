import java.util.*;

public class AbstractClass
{
    public static void main(String[] args)
    {
        MyBook m = new MyBook();
        Scanner scan = new Scanner(System.in);
        m.setTitle(scan.nextLine());
        scan.close();
    }
}
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle(){return title;}
}
class MyBook extends Book
{
     public void setTitle(String s)
     {
        System.out.println("The title is: " + s);
     }
}
