/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
/*output
1
12
123
1234
12345
*/
public class PatternPrint1 {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println();
    
        }
            
       }
    }


