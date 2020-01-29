/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

/**
 *
 * @author USER1
 */
abstract public class Prog {
   abstract void disp();
}
class Manager extends Prog
{
    void disp()
    {
        System.out.println("disp2 method");
    }

public static void main(String[] args)
{
Manager m=new Manager();
}
}