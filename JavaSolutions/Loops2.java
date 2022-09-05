import java.util.*;

public class Loops2
{
    public static void main(String [] argh)
    {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        
        for(int i = 0;i < count; i++){
            
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();            
            int sum = a;
            
            for (int j = 0; j<n ; j++)
            {
                sum = sum + ((int)Math.pow(2, j)*b);
                System.out.print(sum + " ");                                
            }
            System.out.println();
        }
        scan.close();       
    }
}