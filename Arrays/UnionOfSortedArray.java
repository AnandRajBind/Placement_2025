// Dono arrays ke ALL UNIQUE elements.  Two Pointers approach is the best for sorted array.(Array must be sorted).(Merge + Remove Duplicates of the sorted array).
public class UnionOfSortedArray {

    public static void main(String[] args) {
        int arr1[] = { 10, 15, 15, 20, 30, 60, 80, 90, 90 };
        int arr2[] = { 10, 15, 20, 20, 30, 45, 50, 80, 90 };
        int n1 = arr1.length;
        int n2 = arr2.length;

        int result[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                // add only if unique
                if (k == 0 || result[k - 1] != arr1[i])
                    result[k++] = arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || result[k - 1] != arr2[j])
                    result[k++] = arr2[j];
                j++;
                // equal
            } else if(arr1[i]==arr2[j]){
                if (k == 0 || result[k - 1] != arr1[i])
                    result[k++] = arr1[i];
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (k == 0 || result[k - 1] != arr1[i])
                result[k++] = arr1[i];
            i++;
        }
        while (j < n2) {
            if (k == 0 || result[k - 1] != arr2[j])
                result[k++] = arr2[j];
            j++;
        }
        for (i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
