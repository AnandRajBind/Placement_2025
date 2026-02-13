// count occurence logic.Goal: Target kitni baar aaya hai?

import java.util.Scanner;

public class linear_search3 {

    public static int searching(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                // return i; // return index of element 
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60,60, 40,50,50, 70};
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int result = searching(arr, target);
        if(result >= 1){
          System.out.println("There are following types of element occur in the given array "+result);
        }
        else{
   System.out.println("Element not present in the given array ");
        }
    }
}
