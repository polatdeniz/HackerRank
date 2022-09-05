import java.util.*;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt())
        {
            int a = scan .nextInt();
            int b = scan .nextInt();
            int answer;

            try
            {
                if(a < 0 || b < 0)
                {
                    throw new Exception ("n or p should not be negative.");
                }
                else if(a == 0 && b == 0)
                {
                    throw new Exception("n and p should not be zero.");
                }
                else
                {
                    answer =  ((int)Math.pow(a,b));
                }
                    System.out.println(answer);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        scan.close();
    }
}