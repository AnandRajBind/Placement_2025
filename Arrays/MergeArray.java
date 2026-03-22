// merge array into single arry (same order after merge ) does not matter array sorted or unsorted . 

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 16, 17, 18, 19, 20 };

        int result[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result[k] = arr2[i];
            k++;
        }
        for (int current : result) {
            System.out.print(current + " ");
        }
    }
}
