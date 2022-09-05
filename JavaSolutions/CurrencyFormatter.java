import java.util.*;
import java.text.*;

public class CurrencyFormatter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double money = scan.nextDouble();
        scan.close();

        // Java 8 should be used for this challenge. !!!
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(money));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(money));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(money));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money));
    }
}