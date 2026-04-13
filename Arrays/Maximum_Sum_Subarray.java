// Maximum Sum Subarray of Size K(Sliding window ).also used to fixed sliding window.
public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int maxSum;
        int windoSum = 0;
        // calculate first window sum.
        for (int i = 0; i < k; i++) {
            windoSum = windoSum + arr[i];
        }

        maxSum = windoSum;
        //  slide the  window.
        for (int i = k; i < arr.length; i++) {
            windoSum = windoSum - arr[i - k] + arr[i]; // sliding window formula
            maxSum = Math.max(windoSum,maxSum);
        }
        System.out.println("Maximum sum of sub array: " + maxSum);
    }
}
