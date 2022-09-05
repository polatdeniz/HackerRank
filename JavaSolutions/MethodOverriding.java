public class MethodOverriding
{
    public static void main(String[] args)
    {
        Sports sp = new Sports();
        Soccer so = new Soccer();
        
        System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
        System.out.println(so.getName());
        so.getNumberOfTeamMembers();
    }
}

class Sports
{
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
    
    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in " + getName());
    }
}
