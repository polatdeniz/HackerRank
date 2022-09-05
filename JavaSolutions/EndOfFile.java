import java.util.*;

public class EndOfFile 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int counter = 1;

        while(scan.hasNext())
        {
            System.out.println((counter++) + " " +scan.nextLine());
        }
        scan.close();
    }
}