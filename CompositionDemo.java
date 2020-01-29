package Codecademy;

class Employee
{
    int id;
    String name;
    Employee()
    {
        id=23;
        this.name=name;
        System.out.println("In Parent Constructor");
    }
    public void disp()
    {
        System.out.println("In Parent Class");
        System.out.println("Employee Details: "+id+" "+name);
    }
    
}
class Manager1 extends Employee
{
    int salary;
    Manager1(int id,String name,int sal)
    {
        this.id=id;
        this.name=name;
        salary=sal;
        System.out.println("In Child Constructor");
        
    }
    void display()
    {
        System.out.println("");
        System.out.println("In Child Class");
        System.out.println("ID:"+id+"  Name:"+name+"  Salary:"+salary);
          /*
            Compositon: In one class creating object of another class and calling the method of that class is called composition
          */
          AsstManager obj=new AsstManager();
          obj.show();
    }
}
class AsstManager
{
    public void show()
    {   
        System.out.println("");
        System.out.println("In Asst Manager show");
    }
}

public class CompositionDemo 
{
    public static void main(String args[])
    {
        Manager1 obj1=new Manager1(100,"Dhoni",12000);
        
        obj1.disp();
        obj1.display();
        
    }
    
}
