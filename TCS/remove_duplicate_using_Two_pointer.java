// Remove Duplicates (must be Sorted Array) . 

public class remove_duplicate_using_Two_pointer {

    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 20, 30, 40, 50, 50, 50};
        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i]);
        }
    }
}
