//SINGLE DIMENSIONAL ARRAY

public class Arraysdemo {

    public static void main(String args[]) {
        int a[] = {2, 4, 5, 6};//one way of declaration
        int b[] = new int[3];
        b[0] = 3;
        b[1] = 4;
        b[2] = 7;
        System.out.println("Array values of a[]");
        for (int i = 0; i < 4; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Array values of b[]");
        for (int j = 0; j < 3; j++) {
            System.out.print(b[j] + " ");

        }
    }

}
