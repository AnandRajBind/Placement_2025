
import java.util.HashSet;

// Best approach → HashSet
public class UnionOfUnSortedArray {
    public static void main(String[] args) {
        int arr1[] = {95,32, 1, 5,10,15,20,40 };
        int arr2[] = {10,30, 1,5,10,25,30,85,10 };

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
