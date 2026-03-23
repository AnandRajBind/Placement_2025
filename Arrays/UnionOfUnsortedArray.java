
import java.util.HashSet;

// Best approach → HashSet
public class UnionOfUnsortedArray {
    public static void main(String[] args) {
        int arr1[] = { 5, 1, 5, 1, 3, 4, 3, 4, 2 };
        int arr2[] = { 06, 3, 13, 14, 2 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i] );
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i] );
        }
        System.out.println("Union of array is "+set);
    }
}
