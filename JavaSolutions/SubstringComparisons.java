import java.util.Scanner;

public class SubstringComparisons
{
    public static String getSmallestAndLargest(String s, int k)
    {
        java.util.List <String> sArray = new java.util.ArrayList <>();

        for(int i = 0; i < (s.length()-k+1); i++)
            sArray.add(s.substring(i,i+k)); 
                  
        java.util.Collections.sort(sArray);
        String smallest = sArray.get(0);
        String largest = sArray.get(sArray.size()-1);
         
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}