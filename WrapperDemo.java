package Codecademy;

public class WrapperDemo 
{
    public static void main(String args[])
    {
        int i=10;
        //Integer ii=new Integer(i); //Wrapping or Boxing
        //int k=ii.intValue();//Unwrapping or unboxing
        //System.out.println(k);
        Integer value=i; //autoboxing
        int k=value;  //autoUnboxing
        System.out.println(k);
        
    }
}
