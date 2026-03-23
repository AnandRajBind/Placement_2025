// hashSet is the best for unsorted array intersection.
import java.util.HashSet;

// Dono arrays ke COMMON elements
public class IntersectionOfUn_SortedArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 50, 60, 20, 10, 30, 40, 50, 60 };
        int arr2[] = { 15, 20, 1, 20, 30, 90, 62 };
        HashSet<Integer> set = new HashSet<>();

        // Store arr1 elements in set(Only usnique vaue is store in hashset)
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println("Intersection element is: ");
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                // Step Remove to avoid duplicates
                set.remove(arr2[i]);
            }
        }
    }
}
