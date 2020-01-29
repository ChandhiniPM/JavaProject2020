import java.util.*;
class Bank
{
    int acno;
    Bank(int an)
    {
        acno=an;
    }
}
class TSDemo2
{
   public static void main(String args[]) 
   {
       Bank b1 = new Bank(100);
       Bank b2 = new Bank(200);
       TreeSet<Bank> ts = new TreeSet<Bank>();
       ts.add(b1);
       ts.add(b2);
       System.out.println(ts);
   }
}