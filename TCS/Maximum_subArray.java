// Tumhe continuous (lagataar) elements ka aisa group dhoondhna hai jiska sum sabse zyada ho.Beech me gap nahi hona chahiye.
// Example: allowed[4, -1, 2, 1]
// not allowed, [4, 2, 1]    (kyunki -1 skip kiya)
// Aisa period find karo jisme total profit sabse zyada ho.
// it is possible two ways first is Brute force algorithm( Sab subarrays check → Too slow ) second is Kadane algorithm (her element per decision lene ho ki Pehle wale sum ko continue karein Ya naya subarray yahin se start karein).

public class Maximum_subArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, -95, 50, 60, 10, -19};
        // Index 0 already used in initialization.
        //Agar i = 0 se start karoge to first element double count ho jayega.
        int currentSum = arr[0], maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);

        }
        System.out.println(maxSum);
    }
}
