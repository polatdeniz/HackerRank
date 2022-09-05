public class Inheritance2 
{
    public static void main(String[] args)
    {
        Adder adder = new Adder();
            
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(40,2) + " " + adder.add(10,3) + " " + adder.add(20,0));
    }
}
    
class Arithmetic
{
    public int add(int a, int b)
    {
        return (a+b);
    }
}
    
class Adder extends Arithmetic
{
    public int callForAdd(int a, int b)
    {
        return add(a,b);
    }
}