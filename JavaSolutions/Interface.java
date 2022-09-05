import java.util.*;

interface AdvancedArithmetic 
{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        if (n <= 1)
        { 
            return n; 
        }
        else
        {
            int x = n + 1;
            
            for (int i = 2; i < n; i++)
            {
                if ((n % i) == 0)
                {
                    x = x + i;
                }
            }
            
            return x;
        }
    }
}

public class Interface
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        MyCalculator m = new MyCalculator();
        System.out.print("I implemented: " + interfaceNames(m));
        System.out.println(m.divisor_sum(scan.nextInt()));
        scan.close();
    }

    static String interfaceNames(Object o)
    {
        Class[] theInterfaces = o.getClass().getInterfaces();
        return (theInterfaces[0].getName());
    }
}