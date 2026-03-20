
import java.util.Scanner;

// Write a program to reverse the array   using   extra array.
public class Reverse_Using_Extra_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many element you want to enter in the array");
        int n = sc.nextInt();

        int arr[]=new int[n];
        int rev[] = new int[n]; // empty array same size of original array.
        int start = 0;
        int end = n - 1;
        
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // main logic
        while (start < n) {
            rev[start] = arr[end];
            start++;
            end--;
        }
        // main logic using for loop
        // for (int i = 0; i < n; i++) {
        //     rev[i] = arr[n - 1 - i]; // last element se copy
        // }

        
        System.out.println("Reverse Array");
        for (int i = 0; i < rev.length; i++) {
            System.out.println(rev[i]);
        }
    }
}
