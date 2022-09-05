import java.util.Scanner;

public class ExceptionTryCatch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        try
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch (Exception e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        scan.close();
    }
}