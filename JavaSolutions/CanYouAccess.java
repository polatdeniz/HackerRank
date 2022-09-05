import java.util.Scanner;

public class CanYouAccess // You have to change the name for HackerRank. (CanYouAccess --> Solution)
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        Inner inner = new Inner();
        Object o = inner.new Private();

        int num = scan.nextInt();
        scan.close();
        
        Inner.Private innerPrivate = (Inner.Private) o;
        System.out.println(num + " is " + innerPrivate.powerof2(num));
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created"); 
    }

    static class Inner
    {
        private class Private
        {
            private String powerof2(int num)
            {
                if((num&num-1)==0)
                    return "power of 2";
                else
                    return "not a power of 2";
            }
        }
    }
}