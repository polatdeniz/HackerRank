public class Generic 
{
    public static void main(String[] args) 
    {
        PrintArray<Integer> intPrinter = new PrintArray<>();
        PrintArray<String> stringPrinter = new PrintArray<>();   

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        intPrinter.print(intArray);
        stringPrinter.print(stringArray);
    }
}

class PrintArray <T>
{
    public void print(T [] array)
    {
        for (T a : array)
        {
            System.out.println(a);
        }
    }
}