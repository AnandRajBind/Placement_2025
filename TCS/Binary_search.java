
import java.util.Scanner;
// binary search worked on only sorted array 
public class Binary_search {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int low = 0, mid;
        int high = arr.length - 1;
        System.out.println("Enter the target Element");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == arr[mid]) {
                System.out.println("Target Element index is: " + mid + "and position is "+ (mid+1));
                return; 
             }
            else if (target < arr[mid]) {
                 high = mid - 1;
             } 
           else if (target > arr[mid]) {
                low = mid + 1;
            }
        }
        System.out.println("Element Not Found");
    }
}

