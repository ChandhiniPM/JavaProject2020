import java.util.Scanner;
public class Exception01 
{
public static void main(String args[])
{
    try{
    int x,y=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter First number: ");
    x=s.nextInt();
    System.out.println("Enter Second number: ");
    y=s.nextInt();
    System.out.println(x/y);
    //System.out.println("Success");
    
}
    catch(Exception e)
    {
        System.out.println(e);
    }
    System.out.println("Success");
}
}
