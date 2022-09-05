import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        scan.close();
        
        if((n%2) == 0)
        {
            if(n<=5 && n>=2)
                System.out.println("Not Weird");
            else if(n<=20 && n>=6)
                System.out.println("Weird");              
            else if(n>=20)
                System.out.println("Not Weird");
        }
        else if ((n%2) == 1)
                System.out.println("Weird");
    }
}