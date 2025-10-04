
import java.util.Scanner;
// Write a program to reverse the array  using recursion.

public class Reverse_using_recursion {

    public static void reverseRecursion(int arr[], int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseRecursion(arr, i + 1, j - 1);
    }

    //  print using method 
    public static void print(int arr[]) {
        System.out.println("Reverse Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element you want to enter in the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int start = 0;
        int end = n - 1;

        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseRecursion(arr, start, end); // call recusion method 
        print(arr);

    }
}
