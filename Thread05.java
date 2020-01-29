
import java.io.PrintStream;


public class Thread05 extends Thread
{
    public void run()
    {
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("ID: "+Thread.currentThread().getId());
        System.out.println("Priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        Thread05 t1=new Thread05();
        t1.setPriority(MIN_PRIORITY);
        t1.setName("Thread_A");
        t1.start();
        System.out.println("is t1 alive?"+t1.isAlive());
        Thread05 t2=new Thread05();
        //t1.start();
        t2.setPriority(MAX_PRIORITY);
        t2.setName("Thread_B");
        
        System.out.println("is t2 Interrupted? "+t2.isInterrupted());
        System.out.println("is t2 Daemon? "+t2.isDaemon());
        t2.start();      
         System.out.println("is t2 Alive?"+t2.isAlive());
    }
}
