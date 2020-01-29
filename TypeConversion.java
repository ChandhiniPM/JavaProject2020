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
public class TypeConversion {
    public static void main(String arr[])
    {
    int a=1092893745;
    byte b=(byte)a;
    System.out.println(b);
    double c=100.45692857398773;
    float d=(float)c;
    double c4=100.04;
    float f1=(float)c4;
        System.out.println(f1);
        
        //float f=100.09;
        //double n=f;
    char ch=064770;
    //char cha='face';
    char c1=0xbeef;
    char c2='\uface';
        System.out.println("Char value: "+ch);
        System.out.println(d);
    
        System.out.println(a%256);
    }
}
