/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
public class College {
    String CollegeName;
    College(String CollegeName)
    {
        this.CollegeName=CollegeName; /*this keyword is used when class variable 
        and instance variable is same in current class*/
    }
void show()
{
    System.out.println(CollegeName);
}
public static void main(String args[])
{
    College c=new College("SRM");
    c.show();
}
}

