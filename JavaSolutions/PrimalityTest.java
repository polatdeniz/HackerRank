import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      BigInteger n = scan.nextBigInteger();
      scan.close();
      System.out.println( n.isProbablePrime(1000) ? "prime" : "not prime" );
   }
}