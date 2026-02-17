
import java.util.Scanner;
// Linear search. Last Occurrence of Target. traverse  left to right .
public class linear_search6 {

    public static int searching(int arr[], int target) {

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        int arr[] = {10, 20, 30, 50, 5105, 30, 045, 0510, 54, 10};
        int result;
        result = searching(arr, target);
        if (result >= 0) {
            System.out.println("last occurence of  present element in the given array at the " + result + " index");
        } else {
            System.out.println("Elemment not present in given array");
        }
    }
}
