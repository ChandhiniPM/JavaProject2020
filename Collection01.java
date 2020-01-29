package Besant;
import java.util.*;
class EmpRecords
{
    int eid;
    String name;
    double salary;
    
    EmpRecords()
    {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Employee id:");
    eid=s.nextInt();
    System.out.print("Enter name:");
    name=s.next();
    System.out.print("Enter Salary:");
    salary=s.nextDouble();
    }
    /*
    
    
public void getEmpDetails()
{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Employee id:");
    eid=s.nextInt();
    System.out.print("Enter name:");
    name=s.next();
    System.out.print("Enter Salary:");
    salary=s.nextDouble();
}
   
    
    
public void showEmpDetails()
{
    System.out.println("EMPLOYEE DETAILS");
    System.out.println("================");
    System.out.println(eid+" "+name+" "+salary);
}
*/
    
}

public class Collection01 {
    public static void main(String args[])
    {
        EmpRecords e1 = new EmpRecords();
        EmpRecords e2 = new EmpRecords();
        ArrayList<EmpRecords> arr=new ArrayList<>();
        
        arr.add(e1);
        arr.add(e2);
        
        for(EmpRecords er:arr)
        {
            System.out.println(er.eid+" "+er.name+" "+er.salary);
        }
        
        //arr.add(
        /*for(               
        {
            
        }*/
        
    }
}
