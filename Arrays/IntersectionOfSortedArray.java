public class IntersectionOfSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 15, 20, 30, 30, 40, 40, 50 };
        int arr2[] = { 10, 25, 30, 30, 30, 40, 35, 40, 45, 50 };

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0, k = 0;
        int result[] = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (k == 0 || result[k - 1] != arr2[j])
                    result[k++] = arr1[i];
                i++;
                j++;
            }
        }
        System.out.println();
        for (i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
