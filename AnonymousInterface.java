
package Codecademy;
interface abc
{
    void show(); 
}
/*
class Demo1 implements abc
{
    public void show()
    {
        System.out.println("In Demo1 show...!");
    }
}
*/

public class AnonymousInterface {
    public static void main(String args[])
    {
        /*Demo1 obj=new Demo1();
        
        -->The only purpose of the class Demo1 is to implement abc i.e to define the abstract method void show()
        then we can go use anonymous interface concept where you are creating object for an interface 
        which is not possible in any other way*/
        
        abc obj=new abc()  
        {
             public void show()
            {
                System.out.println("In Demo1 show...!");
            }
            
        };
        obj.show();
                
    }
    
}
