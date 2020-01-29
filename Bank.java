/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
 
public class Bank {

    private int AcNo;
    private int Balance;
    Bank()
    {
        AcNo=1001;
        Balance=10000;
    }
    void display()
    {
        System.out.println(AcNo);
        System.out.println(Balance);
    }
}
class Temp
{
    public static void main(String args[])
    {
        Bank b=new Bank();
       //System.out.println(b.Balance);
        b.display();
    }
}
    