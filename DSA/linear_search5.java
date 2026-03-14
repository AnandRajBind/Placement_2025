
import java.util.Scanner;

// Linear search. Last Occurrence of Target. traverse right to left.
public class linear_search5 {
    
    public static int searching(int arr[], int target) {

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        int arr[] = {10, 20, 30, 50, 5105, 30, 045, 0510, 54,10};
        int result;
        result = searching(arr, target);
        if (result >= 0) {
            System.out.println("last occurence of  present element in the given array at the " + result + " index");
        } else {
            System.out.println("Elemment not present in given array");
        }
    }
}
