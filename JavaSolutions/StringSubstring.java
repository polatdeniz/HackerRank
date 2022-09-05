import java.util.*;

public class StringSubstring 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        
        System.out.println(S.substring(start,end));
    }
}