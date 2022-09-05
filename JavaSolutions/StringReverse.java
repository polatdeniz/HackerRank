import java.util.Scanner;

public class StringReverse
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        
        if(word.compareTo(reverseWord(word)) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static String reverseWord(String word)
    {
        String reverseWord = "";
        for(int i = word.length()-1; i >= 0; i-- )
            reverseWord = reverseWord + word.charAt(i);
            
        return reverseWord;
    }
}