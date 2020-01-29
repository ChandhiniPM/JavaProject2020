import java.util.Scanner;
public class UserDefException01 {
    int age;
    void validate() throws ArithmeticException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age:");
        age=s.nextInt();
        if(age<18)
        {
            throw new ArithmeticException("You must be atleast 18 years to vote!");
        }
        System.out.println("Success!You are eligible to vote.");
    }
        public static void main(String args[])
        {
        try
        {
            UserDefException01 e=new UserDefException01();
            e.validate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        //finally()
                //{
                   // System.exit(0);
                //}
    }
}


