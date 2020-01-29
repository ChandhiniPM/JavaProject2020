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
 class B {
   

  static int count = 100;
  public void increment()
  {
     count++;
  }
  public static void main(String []args)
  {
     B b1 = new B();
     b1.increment();
     B b2 = new B();
     System.out.println(b2.count);   // line 13
  }
    
}
