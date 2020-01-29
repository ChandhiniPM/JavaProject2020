import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
public class SimpleDateDemo 
{
    public static void main(String args[])
    {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sf.format(d));
        System.out.println(d);
        
        
    }
    
    
}
