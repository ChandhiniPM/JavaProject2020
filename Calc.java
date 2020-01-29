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
public class Calc {
   static int add(int a,int b)
    {
        return a+b;
    }
   static int sub(int x,int y)
    {
        return x-y;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("--------");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Exit");
        System.out.println("---------");
        System.out.print("Enter your Choice: ");
        int choice=s.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.print("Enter First number: ");
        int num1=s.nextInt();
        System.out.print("Enter Second number: ");
        int num2=s.nextInt();
                int result=add(num1,num2);
                System.out.println("Result is"+result);
                break;
            case 2:
                System.out.print("Enter First number: ");
         num1=s.nextInt();
        System.out.println("Enter Second number: ");
        num2=s.nextInt();
                result=sub(num1,num2);
                System.out.println("Result is "+result);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option!");
        }
               
        }
            
            
    }
