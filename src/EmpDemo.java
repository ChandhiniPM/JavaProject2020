import java.util.*;
class Al1Demo
{
    int id;
    String name;
    float salary;
    Al1Demo(int i,String n,float s)
    {
        id=i;
        name=n;
        salary=s;
    }
}
    public class EmpDemo
    {
        public static void main(String args[])
        {
            Al1Demo e1=new Al1Demo(100,"Dhoni",100000);
            Al1Demo e2=new Al1Demo(200,"Virat",95000);
            LinkedList<Integer> l=new LinkedList<>();
            l.add(100);
            l.add(200);
            ArrayList<String> all=new ArrayList<>();
            all.add("Dhoni");
            all.add("Virat");
            System.out.println(l);
            System.out.println(all);
            ArrayList<Al1Demo>alobj=new ArrayList<>();
            alobj.add(e1);
            alobj.add(e2);
            for(Al1Demo e:alobj)
            {
                System.out.println(e.id+" "+e.name+" "+e.salary);
            }
        }
    }
