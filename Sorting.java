package Besant;

import java.util.Scanner;

public class Sorting {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        char ch='y';
        
         while(ch!='n')
        {
        System.out.print("Enter the number of elements to sort:");
        int num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the elements: ");
        for (int n = 0; n < num; n++) {
            a[n] = s.nextInt();
        }
        System.out.println("Enter your choice:Ascending or Descending(0/1):");
        int choice = s.nextInt();
        switch (choice) {
            case 0:
                for (int i = 0; i < num; i++) {
                    for (int j = i + 1; j < num; j++) {
                        if (a[i] > a[j]) {
                            int temp;
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                System.out.println("Sorting in Ascending order:");

                for (int i = 0; i < num; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println(" ");
                break;
            case 1:
                for (int i = 0; i < num; i++) {
                    for (int j = i + 1; j < num; j++) {
                        if (a[i] < a[j]) {
                            int temp;
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                System.out.println("Sorting in Descending order:");

                for (int i = 0; i < num; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println(" ");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        System.out.println("Do you want to continue (y/n)?");
        char cho=s.next().charAt(0);
        
    }
         
}
}
