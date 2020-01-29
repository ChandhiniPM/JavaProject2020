
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
import java.util.Scanner;
public class ExcepDemo {
    public static void main(String args[])
    {
        try{
        Scanner s=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter first number:");
        s1=s.next();
        System.out.println("Enter second number:");
        s2=s.next();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        System.out.println(n1+n2);
        int n=10;
        String s3=String.valueOf(n);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
