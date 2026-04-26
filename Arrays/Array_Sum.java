
import java.util.Scanner;

public class Array_Sum {

    public static void main(String[] args) {
        // Calculate the sum of all elements in the given array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array Element");
        int sum = 0;
        // Input Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Sum of all array element
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }

        System.out.println(sum);
    }
}
