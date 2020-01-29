/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER1
 */
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Date;
public class DateClass {
    public static void main(String args[])
    {
        Date d=new Date();
        System.out.println(d);
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.plusDays(1));
         LocalDate ld3=LocalDate.now();
         ld3=(ld3.minusYears(3));
        System.out.println(ld3.isLeapYear());
        LocalTime t=LocalTime.now();
        System.out.println(t);
        System.out.println(t.plusHours(4));
        
        
    }
}
