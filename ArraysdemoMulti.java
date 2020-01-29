//JAGGED ARRAY-->The number of columns are not fixed.
public class ArraysdemoMulti {
    public static void main(String args[])
    {
        int a[][]={
                    {2,3,4},       //1st Array
                    {7,8,9,1},     //2nd Array
                    {4,5}          //3rd Array
                  };
        for(int i=0;i<a.length;i++) //a.length will fetch the number of rows/no. of arrays,here it is 3 arrays
        {
            for(int j=0;j<a[i].length;j++) //a[i].length will fetch the number of columns depending on the i value.   
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }    
    }
}
