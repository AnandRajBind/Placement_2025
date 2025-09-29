
import java.util.Scanner;

public class Input_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // input
        System.out.println("Enter the Array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
// output
        System.out.println("Your array element is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // element ka double (multiple) print.
        System.out.println("\n Double of your array element is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * 2 + " ");
        }
    }
}
