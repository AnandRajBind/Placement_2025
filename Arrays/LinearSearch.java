
// Find/Search  the target element in the given array.

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n]; //Array Decleration

        // input Array Element
        System.out.println("Enter the Array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//    target element
        System.out.println("Enter the Target Element");
        int Target = sc.nextInt();
        boolean found = false;
//  Search The given Target Element
        for (int i = 0; i < n; i++) {
            if (arr[i] == Target) {
                found=true;
                 break;
            }
        }
        if (found) {
            System.out.printf(" %d Element present in the given array \n" , Target);
         } else {
            System.out.printf(" %d Element is not present in the given array \n" , Target);
        }
    }
}
