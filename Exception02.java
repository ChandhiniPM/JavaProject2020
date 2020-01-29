//ARRAY INDEX OUT OF INDEX EXCEPTION
public class Exception02 {
    public static void main(String args[])
    {
        try
        {
        int a[] = new int[4];
        a[10]=7;   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
