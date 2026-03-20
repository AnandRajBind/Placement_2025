// Write a program to reverse the array  using  Two pointer Approach.

import java.util.Scanner;

public class Reverse_using_Two_pointer {
    //  print using method 
    public static void print(int arr[]) {
        System.out.println("Reverse Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//  swap using method 
    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
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
        while (start < end) {
            // int temp = arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;
            swap(arr, start, end); // swap method call 
            start++;
            end--;
        }
        print(arr); // print method method call   

        // System.out.println("Reverse Array is: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
    }
}
