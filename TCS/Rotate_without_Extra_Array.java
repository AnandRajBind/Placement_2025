
public class Rotate_without_Extra_Array {

    public static void swap(int arr[],int start, int end) {
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
}

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;// number of position to swap
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-1);
    }
}
