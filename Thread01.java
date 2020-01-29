/*MULTITHREADING:///////./../....................../////////////////////./
Its mainly used for multiple task.For game development.
Thread: It is a unit of Process. Single process can be broken into sub units called Threads. 
It saves lot of time.
*/
public class Thread01 extends Thread
{
    public void run()
    {
        System.out.println("Thread is started and running..");
    }
    public static void main(String args[])
    {
        Thread01 t=new Thread01();
        t.start();
    }
}
