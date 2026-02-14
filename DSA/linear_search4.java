// Static Array Approach (Two Pass Method)
// return All Indices Logic. Goal: Target jitni baar aaye, un sabka index return karo.

import java.util.Scanner;

public class linear_search4 {

    public static int[] searching(int arr[], int target) {
        int count = 0;
        // First Pass → Count occurrences
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        // Create result array
        int list[] = new int[count];
        int index = 0;
        // Second Pass → Store indices
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // return i; // return index of element 
                list[index] = i;
                index++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 60, 40, 50, 50, 70};
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int result[] = searching(arr, target);

        if (result.length > 0) {
            System.out.println("Element found at indices:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("Element not present in the given array.");
        }
    }
}
