/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Besant;

public class Temp1 {
    public static void main(String args[])
    {
        int count=0;
        String name="Besant Technologies";
        char[] name1=name.toCharArray();
        for(int i=0;i<name1.length;i++)
        {
            if((name1[i])=='e')
            {
                count++;
            }
        }
        System.out.println("Number of occurences of 'e':"+count);
    }
}

