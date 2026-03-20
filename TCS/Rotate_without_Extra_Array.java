
public class Rotate_without_Extra_Array {
    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;// number of position to swap
        int n = arr.length;
        k = k % n; // We use k % n to handle cases where rotations exceed array size and to prevent
                   // index out-of-bounds errors.

        // Right rotation
        // reverse(arr, 0, n - 1); // reverse whole array
        // reverse(arr, 0, k - 1); // reverse first k element
        // reverse(arr, k, n - 1);// reverse remaining element

        // left rotation
        reverse(arr, 0, k - 1); // rotate k element
        reverse(arr, k, n - 1);// rotate remaining element
        reverse(arr, 0, n - 1); // rotate whole array

        // print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
