// Linear search using boolean flag.

import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 40, 30, 40, 50, 60, 70};
        System.out.println("Enter the target Element");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element present in given array ");
        } else {
            System.out.println("Element not present in given array ");
        }
    }
}
