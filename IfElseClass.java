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
public class IfElseClass {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("EVEN OR ODD");
        System.out.println("-----------");
        System.out.print("Enter the number: ");
        int i=s.nextInt();
        if(i%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
                
    }
    
}
