import java.util.Scanner;

public class OutputFormatting
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int [] intArray = new int [3];
        String [] stringArray = new String [3];

        for (int i = 0; i < 3; i++)
        {
            stringArray [i] = scan.next();
            intArray [i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("%-15s%03d%n", stringArray[i], intArray [i]);
        }
        System.out.println("================================");
    }
}