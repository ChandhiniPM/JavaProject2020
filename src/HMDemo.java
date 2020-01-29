
//Pass the Key and Value
import java.util.HashMap;
public class HMDemo {
    public static void main(String args[])
    {
        
        //<Key,Value>
        HashMap<String,String>hm=new HashMap<>();
        hm.put("name","Dhoni");
        hm.put("Address", "100,5thStreet");
        hm.put("city", "Chennai");
        hm.put("null","Bombay");
        hm.put("null", "Calcutta");
        hm.put("null", "null");
        hm.put("country", "null");
        hm.put("state", "null");
        System.out.println(hm);   
    }
    
}
