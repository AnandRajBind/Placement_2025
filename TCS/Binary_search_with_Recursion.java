
import java.util.Scanner;

public class Binary_search_with_Recursion {

    public static int binarySearch(int arr[], int target, int low, int high) {

        // Base Case 
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        else if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return  binarySearch(arr, target, low, mid - 1);
        } else if (target > arr[mid]) {
            return  binarySearch(arr, target, mid + 1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(" Enter Target Element");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result =  binarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Target element Index is " + result + " position is " + (result + 1));
        } else {
            System.out.println("Element Not found");
        }
    }
}
