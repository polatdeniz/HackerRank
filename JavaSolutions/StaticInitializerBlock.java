import java.util.*;

public class StaticInitializerBlock
{
    static int B, H;
    
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
    }
    
    public static void main(String[] args) 
    {
        if((B <= 0) || (H <= 0))
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.println(B*H);
        }
    }
}