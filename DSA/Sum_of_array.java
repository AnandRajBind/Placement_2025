// 

import java.util.Scanner;

public class Sum_of_array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter the Array Element ");
       // This is dynamic array creation.
        // take user input and store in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            // sum using single loop 
            sum += arr[i];
        }
        System.out.println("Sum of all array element is: " + sum);
    }
}
