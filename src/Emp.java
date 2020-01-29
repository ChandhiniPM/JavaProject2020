import java.util.*;
class Employee
{
    int id;
    String name;
    float salary;
Employee(int i,String n,float s)
{
id=i;
name=n;
salary=s;
}
}
public class Emp
{
    public static void main(String args[])
    {
        Employee e1=new Employee(100,"Dhoni",100000);
        Employee e2=new Employee(200,"Virat",95000);
        HashSet<Employee> hs=new HashSet<>();
        hs.add(e1);
        hs.add(e2);
        for(Employee e:hs)
        {
        System.out.println(e.id+" "+e.name+" "+e.salary);
    }
    }
}
