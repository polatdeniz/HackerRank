import java.util.*;

public class IntToString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int input = scan.nextInt();
        scan.close();
        String convertedString = Integer.toString(input);

        if (input == Integer.parseInt(convertedString))
        {
            System.out.println("Good job");
        } 
        else 
        {
            System.out.println("Wrong answer");
        }
    }
}