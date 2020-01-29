import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
public class DateDemo {
    public static void main(String args[])
    {
        Date d=new Date();
        System.out.println("Today's Date:"+" "+d);
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        LocalDate ld3;
        //ld3.plusYears(1);
        
    }
    
}
