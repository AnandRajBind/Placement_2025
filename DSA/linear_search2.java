//  linear search using without boolean flag. 

import java.util.Scanner;

class linear_search2 {

    public static int searching(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index of element 
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        int result = searching(arr, target);

        if (result != -1) {
            System.out.println("Element present in given array. index is: "+result);
        } else {
            System.out.println("Element not present in given array");
        }
    }
}
