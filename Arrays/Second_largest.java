// Find the second largest element in the given Array.

public class Second_largest {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 8, 6, 8, 7, 15 };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // Traverse each Array Element
        System.out.println("Your Array Element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // find largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf(" \n Largest Element of Array is: %d \n", max);
        // find the Second largest Element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second Largest Element of Array is: " + secondMax);
    }
}
