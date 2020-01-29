class Temp 
{
   synchronized void table(int n) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n * i);
        }
    }
}
class TD1 extends Thread
{ 
    Temp t1;
    TD1(Temp t1) 
    {
        this.t1 = t1;
    }
    public void run() 
    {
        t1.table(5);
    }
}
class TD2 extends Thread
{
    Temp t2;
    TD2(Temp t2) 
    {
        this.t2 = t2;
    }
    public void run()
    {
        t2.table(2);
    }
}
public class ThreadSync 
{
    public static void main(String args[])    {
    Temp t=new Temp();
    TD1 td1=new TD1(t);
    TD2 td2=new TD2(t);
    td1.start();
    td2.start();
}
}
