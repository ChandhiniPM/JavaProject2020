/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
 class BankClass {
     
    private int AccNo;
    private int BalanceAmt;
    BankClass(
    )
    {
        AccNo=1001;
        BalanceAmt=10000;
    }
    void display()
    {
        System.out.println(AccNo);
        System.out.println(BalanceAmt);
    }
}
class TempClass
{
    public static void main(String args[])
    {
        Bank b=new Bank();
       //System.out.println(b.Balance);
        b.display();
    }
}

