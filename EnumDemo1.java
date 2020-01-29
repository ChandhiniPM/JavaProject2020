

import java.util.Scanner;
public class EnumDemo1 {
    enum days{sunday,monday,tuesday,wednesday,thursday,friday,saturday}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        //String day=days.valueOf(s.next()).toString();
        //for(days d:days.values())
        //{ 
        //day =days.values().toString();*/
          String day=s.next();
//days d=days.friday;
        try{
            switch(days.valueOf(day))
            {
                 case monday:
                     System.out.println("Its working day!");break;
                case tuesday:
                    System.out.println("Its working day!");break;
                case wednesday:
                    System.out.println("Its working day!");break;
                case thursday:
                    System.out.println("Its working day!");break;
                case friday:
                    System.out.println("Thank God its Friday!");break;
                case saturday:
                    System.out.println("Hurray!! Its weekend");break;
                case sunday:
                    System.out.println("Yay! Its sunday");break;
                default:
                
            System.out.println("Invalid option");
        }
            }
            catch(Exception e)
                    {
                    System.out.println(e);
                    }
            }
            
        }
        
    