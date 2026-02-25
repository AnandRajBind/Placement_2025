
// Remove duplicates from the array using HashSet.
// Concept:
// 1. HashSet stores only unique values (no duplicates allowed).
// 2. Traverse the array and add each element to the HashSet.
// 3. If the element is already present, HashSet ignores it automatically.
// 4. After the loop, the HashSet contains only unique elements.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
// Note: HashSet does NOT maintain the original order of elements.


import java.util.HashSet;
public class remove_duplicate {

    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 30, 20, 40};

        // remove duplicate from the array by using hashSet.
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);


    // remove duplicate from the array by using hashSet.

    }
}
