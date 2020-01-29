//STRING INDEX OUT OF INDEX EXCEPTION
public class Exception03 {
    public static void main(String args[])
    {
        try{
        String name="Dhoni";
        System.out.println(name.substring(4, 10));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
