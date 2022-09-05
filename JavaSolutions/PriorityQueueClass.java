import java.util.*;

class Student
{
    private final int id;
    private final double cgpa;
    private final String name;

    public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCGPA()
    {
        return this.cgpa;
    }
}

class Priorities
{
    private final PriorityQueue<Student> priorityStudent;

    public List <Student> getStudents(List <String> events)
    {
        for (String event : events)
        {
            if (event.equals("SERVED"))
            {
                priorityStudent.poll();
            } 
            else
            {
                String[] words = event.split("\\s");
                Student st = new Student(Integer.parseInt(words[3]), words[1], Double.parseDouble(words[2]));
                this.priorityStudent.add(st);
            }
        }

        List<Student> list = new ArrayList<>();

        while(!this.priorityStudent.isEmpty())
        {
            list.add(this.priorityStudent.poll());
        }

        return list;
    }

    public Priorities()
    {
        this.priorityStudent = new PriorityQueue<>
        ( (s1, s2)  ->  {   if(s1.getCGPA() - s2.getCGPA() == 0)
                            {
                                if(s1.getName().compareTo(s2.getName()) == 0)
                                {
                                    return Integer.compare(s1.getID(), s2.getID());
                                }
                                else
                                {
                                    return s1.getName().compareTo(s2.getName());
                                }
                            }
                            else 
                            {
                                return Double.compare(s2.getCGPA(), s1.getCGPA());
                            }
                        }
        );
    }
}

public class PriorityQueueClass
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args)
    {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List <String> events = new ArrayList <>();

        while ((totalEvents--) != 0)
        {
            String event = scan.nextLine();
            events.add(event);
        }

        List <Student> students = priorities.getStudents(events);

        if (students.isEmpty())
        {
            System.out.println("EMPTY");
        } 
        else 
        {
            for (Student st: students) 
            {
                System.out.println(st.getName());
            }
        }
    }
}