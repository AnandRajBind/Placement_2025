// rotate array element using extra array.
public class Rotate_element {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2; // number of positions to rotate right.Last 2 elements come to front.
        int n = arr.length;//total number of elements in the array
        int temp[] = new int[n];

        // Right rotation using Extra Array.
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + k) % n;
          //  int newIndex = (i - k + n) % n;// Left rotation formula:
            temp[newIndex] = arr[i];
        }

        //  Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
