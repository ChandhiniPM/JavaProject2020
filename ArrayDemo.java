/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class ArrayDemo 
{
    public static void main(String args[])
    {
        //SINGLE DIMENSIONAL ARRAY
        int arr[]={3,4,5,7};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //MULTI DIMENSIONAL ARRAY
       int arrays[][]={{4,7,3},{5,6,8}};
       for(int i=0;i<2;i++)
       {
           System.out.println(" ");
           for(int j=0;j<3;j++)
           {
               System.out.print(arrays[i][j]);
               
           }
           System.out.print(" ");
       }
       
        
    }
}

