import java.util.Scanner;

public class UserDefinedException 
{
    static float balance=1000;
    static void withdraw() throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount=s.nextInt();
        if(amount>balance)
        {
            throw new ArithmeticException("Insufficient Fund");   
        }
        balance=balance-amount;
        System.out.println("Your available balance is"+balance);
    }
    public static void main(String args[])
    {
        try
        {
            withdraw();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}