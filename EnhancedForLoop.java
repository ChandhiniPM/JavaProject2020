/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class EnhancedForLoop 
{
    public static void main(String args[]) 
    {
        int a[] = new int[4];
        a[0] = 10;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        System.out.println("SINGLE DIMENSIONAL ARRAY");
        for (int k : a) //Each value of "a" will be allocated to "k" and print during each iteration  
        {
            System.out.print(k + " ");
        }
        System.out.println("");
        System.out.println("MULTI DIMENSIONAL ARRAY");
        int d[][] = {{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9, 5, 2}};
        for (int m[] : d) 
        {
            for (int l : m) 
            {
                System.out.print(l + " ");
            }
            System.out.println("");
        }
    }
}
