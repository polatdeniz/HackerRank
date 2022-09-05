import java.util.*;

public class ArrayListClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int count = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < count; i++)
        {
            list.add(new ArrayList<Integer>());
            int a = scan.nextInt();
            
            for(int j = 0; j < a; j++)
            {
                list.get(i).add(scan.nextInt());
            }
        }
        
        int q = scan.nextInt();
        
        for(int i = 0; i < q; i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if(x > list.size())
            {
                System.out.println("ERROR!");
                continue;
            }
            
            if(y > list.get(x - 1).size())
            {
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(list.get(x - 1).get(y - 1));
        }
        scan.close();
    }
}