import java.util.Scanner;

public class StringsIntroduction 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) <= 0)
            System.out.println("No");
        else 
            System.out.println("Yes");
            
        A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(A + " " + B);
    }
}