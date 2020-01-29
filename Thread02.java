
public class Thread02 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
   
        }
        //System.out.println(" ");
    }
    public static void main(String args[])
    {
        Thread02 t1=new Thread02();
        Thread02 t2=new Thread02();
        t1.start();
        t2.start();
    }
}
