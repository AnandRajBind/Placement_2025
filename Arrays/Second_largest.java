// Find the second largest element in the given Array.

public class Second_largest {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 8, 6, 7, 85};
        int max = Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
      
    }
}
