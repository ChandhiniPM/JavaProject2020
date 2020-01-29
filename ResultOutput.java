/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Besant;

/**
 *
 * @author USER1
 */
public class ResultOutput {
   int[] array={1,2,3};
   
}
class Pc 
{
    ResultOutput r;
}
class program
{
    public static void main(String[] args)
    {
       ResultOutput c=new ResultOutput();
       Pc p=new Pc();
       Pc p1=p;
       p1=null;
       p=null;
    }
}
