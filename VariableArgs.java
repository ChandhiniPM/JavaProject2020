public class VariableArgs 
{
    int add(int ... n)
    {
        int sum=0;
        for(int k:n)
        {
        sum=sum+k;
        }
        return sum;
    }
    public static void main(String args[])
    {
        VariableArgs obj=new VariableArgs();
        int result=obj.add(2,4,5,6,23,67,88,75);
        System.out.println("Result is "+result);
        
    }
    
}
