/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class Thread04 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Thread03 t1=new Thread03();
        Thread03 t2=new Thread03();
        t1.start();
      //  t2.start();
        try
        {
            t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
    
}
