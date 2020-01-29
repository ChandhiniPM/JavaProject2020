import java.util.TreeMap;
public class TMDemo {
    public static void main(String args[])
    {
       TreeMap<String,String>tm=new TreeMap<>();
        tm.put("name", "Dhoni");
        tm.put("Address", "104,X street");
        tm.put("city", "Chennai");
        tm.put("null", "Chennai");
        tm.put("null", "bombay");
        
        System.out.println(tm); 
    
   TreeMap<Integer,Float> tmap=new TreeMap<>();
    tmap.put(100,45.5f);
    tmap.put(200,50.5f);
    tmap.put(500, 20.5f);
    System.out.println(tmap);
    
        
}
}

