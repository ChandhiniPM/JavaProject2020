
import java.util.Scanner;
import java.io.*;
class Employee01
{
    int empid;
    String name;
    int salary;
    void getEmp(int eid,String n,int salary)
    {
        empid=eid;
        name=n;
        this.salary=salary;
    }
    
    void setEmp()
    {
        System.out.println(empid+" "+name+" "+salary);
    }
}

public class FileHandlingDemo
{
    public static void main(String args[])
    {
        
        try{
        //FileOutputStream fs=new FileOutputStream("C:\\Users\\P.MARIAPPAN\\Desktop\\Sample.txt");
        FileWriter fw=new FileWriter("C:\\Users\\P.MARIAPPAN\\Desktop\\Sample.txt");
        Employee01 e=new Employee01();
        e.getEmp(100, "Jawahar", 5500);
        e.setEmp();
        e.getEmp(101, "Kareena", 4300);
        e.setEmp();
        //fs.close();
        fw.write(e.empid);
        fw.write(e.name);
        fw.write(e.salary);
       // fw.close();
        
                
        //fs.write(b);
        
        
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        finally
        {
           //// FileWriter fw=new FileWriter()
            //fw.close();
        }
        
    }
}
