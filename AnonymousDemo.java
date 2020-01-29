
package Codecademy;
class C
{
    void show()
    {
        System.out.println("In C show");
    }
}
/*
class D extends C
 {
    void show()
    {
        System.out.println("In D show");
    }
}
*/
public class AnonymousDemo {
    public static void main(String args[])
    {
        /*
        D d=new D();
        The class D is only for one time use i.e to override the method in the parent class C
        so we can easily use the concept of Anonymous class. 
        */
        
        C c=new C()
                {
                  void show()
                  {
                    System.out.println("In D show");
                  }
                };
        c.show();
        
    }
    
}

