// Merge Two sorted array into single sorted array using extra array.
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = { 16, 17, 18, 19,20, 20 };
        int arr2[] = { 1, 2, 3, 4, 5,10,20 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        int result[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            // ascending order
            if (arr1[i] < arr2[j]) { // arr1[i] >= arr2[j] desecending array print karne ke liye use this condition.
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        for (i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        // System.out.println(num);
    }
}
