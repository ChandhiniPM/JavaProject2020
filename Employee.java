
package Besant;
import java.io.FileWriter;
import java.util.Scanner;
public class Employee {
    
    int id;
    String name;
    float salary;
  
    void getEmployeeDetails()
    {
        char ans = 'y';
                while(ans!='n')
                {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id:");
        id = s.nextInt();
        
        System.out.print("Enter Name:");
        name = s.next();
        
        System.out.print("Enter Salary:");
        salary = s.nextFloat();
              
                    System.out.println("Another Record?");
                    ans = s.next().charAt(0);   
                }       
    }
    void storeEmployeeDetails()
    {
        try
        {
            FileWriter fw = new FileWriter("C:\\Users\\P.MARIAPPAN\\Desktop\\Employee.txt");
        fw.append(id+" "+name+" "+salary+"\n");
        //fw.append(id+" "+name+" "+salary +"\n");
        //fw.append(id+" "+name+" "+salary +"\n");
        
        //fw.write(name);
        
        fw.close();
        
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.getEmployeeDetails();
        e.storeEmployeeDetails();
    }
}
