
public class MergeRemoveDuplicatesOfArray {
    public static void main(String[] args) {
        int arr1[] = { 3, 4, 10, 16, 17, 18, 19, 20, 20 };
        int arr2[] = { 1, 1, 2, 3, 4, 5, 10, 18, 19, 20 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        int result[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0, slow = 0;
        while (i < n1 && j < n2) {
            // ascending order
            if (arr1[i] < arr2[j]) { // arr1[i] >= arr2[j] desecending array print karne ke liye use this condition.
                result[k++] = arr1[i];
                i++;
            } else {
                result[k++] = arr2[j];
                j++;
            }
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
        // remove duplicate
        for (int fast = 1; fast < result.length; fast++) {
            if (result[slow] != result[fast]) {
                slow++;
                result[slow] = result[fast];
            }
        }
        for (i = 0; i <= slow; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

