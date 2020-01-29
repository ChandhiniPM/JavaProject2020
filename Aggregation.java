package Codecademy;
class Bank
{
    int accno;
    String name;
    Bank(int accno,String name)
    {
        this.accno=accno;
        this.name=name;
    }
    
}

class Manager2 
{
    String managername;
    Bank b;
    
    Manager2(String m,Bank b)
    {
        managername=m;
        this.b=b;
    }
    void displayDetails()
    {
        System.out.println(b.accno);
        System.out.println(b.name);
        System.out.println(managername);
    }
}
public class Aggregation 
{
    public static void main(String args[])
    {
        Bank b1=new Bank(1001,"Virat");
        Manager2 m=new Manager2("Dhoni",b1);
        m.displayDetails();
    }
}
