enum Directions{East,West,North,South}

public class EnumDemo
{
    public static void main(String[] args)
    {
        System.out.println(Directions.East);
        for(Directions d:Directions.values())
        {
            System.out.println(d);
        }  
    }
}
