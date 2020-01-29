/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class SetterGetter {

    private int AcNo;
    
    private int Balance;

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }


    public int getAcNo() {
        return AcNo;
    }

    public void setAcNo(int AcNo) {
        this.AcNo = AcNo;
    }
public static void main(String args[])
{
        SetterGetter s=new SetterGetter();
        s.setAcNo(1002);
        s.setBalance(10005);
        System.out.println(s.getAcNo());
        System.out.println(s.getBalance());
}   
}
