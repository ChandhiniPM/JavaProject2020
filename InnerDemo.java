/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

class Outer //can have a member variable,member method,and member class(inner class)
{
    static int a; // can have static variable,static method and static class
    public static void show()
    {
        System.out.println("In Show");
    }
    
    static class Inner
    {
        int a=20;
        public void show()
        {
            System.out.println("In Inner class show and value of a:"+a);
        }
        
    }
}


public class InnerDemo 
{
    public static void main(String[] args)
    {
        Outer obj=new Outer();
        Outer.Inner obj1 =new Outer.Inner();
        obj1.show();
        obj.show();
    }
    
}
