import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        
        for (int i = 1; i < 11; i++)
        {
            System.out.println(x + " x " + i + " = " + (x*i));
        }
    }    
}