/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author USER1
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Unary operator*/
        int i=10;
        System.out.println(i++);
        System.out.println(i);
        /*Incremental Operator*/
        int m=10;
        int n=5;
        System.out.println("The incremented value is "+(m+++(++n)));
        System.out.println("The value of m is "+(m+++(++m)));
        /*Ternary or Conditional Operator*/
        int a=10;
        int b=20;
        int max=(a>b)?a:b;
        System.out.println("The maximum number is "+max);

        
        
        
        
        
        
    }
    
}
