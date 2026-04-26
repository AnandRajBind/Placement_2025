
// Roatet the given array "arr" by k steps, where k is non-negative.

public class Rotate_Array {

    //  print using method 
    public static void print(int arr[]) {
        System.out.println("Reverse Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int start = 2; // rotate/swap array 2 to 5 indexes tak.
        int end = 5;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        print(arr); // print method method call   
    }
}
