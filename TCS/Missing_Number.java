
// Actual Sum = Array ka sum
// Expected Sum	= 1..N ka sum
// Difference = Missing number
public class Missing_Number {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int n = arr.length + 1;  // one number missing hai so use the +1.
        
        int actualSum =0, expectedSum , missing;
        // calculate actualSum
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        // Expected sum formula =  n*(n+1)/2
        // calculate expectedSum
        expectedSum = n * (n + 1) / 2;
        missing = expectedSum - actualSum;
        System.out.println("Missing Number = " + missing);
    }
}
