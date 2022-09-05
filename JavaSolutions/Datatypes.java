import java.util.*;

public class Datatypes
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for(int i = 0; i < count ;i++)
        {
            try
            {
                long num = scan.nextLong();

                System.out.println(num + " can be fitted in:");

                if((num >= (-Math.pow(2, 7))) && (num <= (Math.pow(2, 7) - 1)))
                    System.out.println("* byte");
                if((num >= (-Math.pow(2, 15))) && (num <= (Math.pow(2, 15) - 1)))
                    System.out.println("* short");
                if((num >= (-Math.pow(2, 31))) && (num <= (Math.pow(2, 31) - 1)))
                    System.out.println("* int");
                if((num >= (-Math.pow(2, 63))) && (num <= (Math.pow(2, 63) - 1)))
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}