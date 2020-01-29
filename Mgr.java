/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

class EmployeeA
{
    private int id;
    private String name;
    void display()
    {
        System.out.println("In Emp1");
    }
    class Emp2
    {
        void display2()
        {
            EmployeeA e=new EmployeeA();
            System.out.println("In Emp2 display");
            e.display();
        }
    }
}

public class Mgr {
    public static void main(String args[])
    {
        
        EmployeeA e1=new EmployeeA();
        EmployeeA.Emp2 e2 = e1.new Emp2();
        e2.display2(); 
        
    }
    
}
