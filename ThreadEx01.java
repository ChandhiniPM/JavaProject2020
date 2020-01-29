class Thread001 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Hi");
        }

    }
}
class Thread002 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Hello");
        }
    }
}

public class ThreadEx01 
{
    public static void main(String args[]) 
    {
        Thread001 obj1 = new Thread001();
        Thread002 obj2 = new Thread002();

        obj1.start();
        try 
        {
            Thread001.sleep(1000);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        obj2.start();
        // obj1.join();
        System.out.println("Bye..");
    }
}