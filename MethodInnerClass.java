//Method Local Inner class
package Codecademy;


public class MethodInnerClass {
    private int id=1;
    private String name="Jerry";
    void display()
    {
        class Manager   //The scope of this class Manager is within this method only. Therefore we cannot create object of Manager in public static void main(String args[])
        {
           void display2()
            {
                System.out.println(id+" "+name);
            }
        }
        //can create object only within this method display() in which it is defined.
        Manager m=new Manager();
        m.display2();
     
    }
//     Manager m=new Manager();
//      m.display2();
    public static void main(String args[])
    {
        MethodInnerClass m1=new MethodInnerClass();
        m1.display();
/*   The scope of this class Manager is within this method only. 
       Therefore we cannot create object of Manager inside main()*/

//       MethodInnerClass.Manager e=new MethodInnerClass.Manager();
//       MethodInnerClass.e.display2();
    }
    
}
