//FINDING THE LARGEST AMONG GIVEN NUMBERS

import java.util.Scanner;

public class LargestNum {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        int n;
        System.out.println("Enter the number of elements to find the largest:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

            if (a[i] > max) {
                max = a[i];
                //System.out.println(a[i]);
            }
        }
        System.out.println("The largest number is" + " ");
        System.out.println(max);

    }
}
