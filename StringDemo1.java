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
public class StringDemo1 {
  
  
	public static void main(String[] args) {
      
    String line = "chandhini";     
    //Index Numbers: c=0 h=1 a=2 n=3 d=4 h=5 i=6 n=7 i=8
    String line2="Hello";
    String line3="hello";
    System.out.println("Substring: "+line.substring(2,5)); //First Index is inclusive LastIndex is exclusive
            System.out.println("Replace: "+line.replace("h", "o"));
            System.out.println("To UpperCase: "+line.toUpperCase());
            System.out.println("CharAt: "+line.charAt(5));
            System.out.println("IndexOf: "+line.indexOf("i"));
            System.out.println("Length: "+line.length());
            System.out.println("Concat: "+line.concat("P M"));
            System.out.println("Equals: "+line2.equals(line3));
            System.out.println("EqualsIgnoreCase: "+line2.equalsIgnoreCase(line3));
            
    
  }
  
}
