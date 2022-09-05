import java.util.*;

public class StdinStdout1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        scan.close();
    }
}