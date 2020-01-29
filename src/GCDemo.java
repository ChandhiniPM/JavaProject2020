/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class GCDemo {
    public void finalize()
    {
        System.out.println("Garbage got collected");
    }
    
    public static void main(String args[])
    {
        GCDemo ob1 = new GCDemo();
        GCDemo ob2 = new GCDemo();
        
        ob2=ob1;
        
        //ob2=null;
        
        System.gc();
    }
    
    
}
