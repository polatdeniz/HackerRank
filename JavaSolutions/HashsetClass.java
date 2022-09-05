import java.util.*;

public class HashsetClass
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        HashSet <String> hset = new HashSet<>();
        int count = scan.nextInt();
        scan.nextLine(); // The purpose of this code is to prevent the bug that occurs when taking a String after taking an integer.
        
        for (int i = 0; i < count; i++)
        {
            hset.add(scan.nextLine());
            System.out.println(hset.size());
        }
        scan.close();
    }
}