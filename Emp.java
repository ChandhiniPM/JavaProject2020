/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class Emp {
    int id;
    String name;
    Emp(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        Emp e1=new Emp(100,"Dhoni");
        Emp e2=new Emp(200,"Virat");
        e1.display();
        e2.display();
    }
}
