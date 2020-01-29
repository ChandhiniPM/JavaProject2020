/* LAMBDA EXPRESSION WITH FUNCTIONAL INTERFACE*/
package Codecademy;
interface functional
{
    void show();
}
/*
class Implementor implements functional
{
   public void show()   //---> this abstract method is always public. try with different access modifier
    {
        System.out.println("This implements functional interface");
    }
}
*/
public class LamdaExpression 
{
    public static void main(String args[])
    {
        //Implementor obj=new Implementor();
        
        /* LAMBDA EXPRESSION 
             Lambda Expression works with only functional interface(interface that has only one method)*/
        functional obj=()->System.out.println("This implements functional interface");
        obj.show();
    }
    
}
