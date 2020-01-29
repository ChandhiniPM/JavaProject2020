/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

/**
 *
 * @author USER1
 */
public class FinalizeDemo {
    //@Override
   public final  void finalize()
                {
                    
                    System.out.println("Garbage collected!");
                }
}
    class A extends FinalizeDemo
    {
        void finalize(int a)
        {
            System.out.println("GC called: "+a);
        }
    
    public static void main(String args[])
    {
        A s1=new A();
        s1.finalize();
        s1.finalize(3);
        //s1=null;
        System.gc();
        
    }
    
}
