
package Besant;
import java.util.*;

public class CollectionDemo {
    public static void main(String args[])
    {
        List<Integer> values=new ArrayList<>();
        values.add(8);
        values.add(3);
        values.add(2);
        values.add(1,5);
        //values.add("Chandhini");
        //values.add(8.7);
        //values.add(7.88f);
        for(Object i:values)
        {
            System.out.println(i);
        }
    }
}
