//find the maximum value out of all the element in the array.

public class Max_Value {

    public static void main(String[] args) {
        // int arr[] = {10, 56, 84, 55, 84, 5};
        int arr[] = {10,-1,-10, -56, -84,10, -55, -84, -5};

        // int max = 0;
        // int max=Integer.MIN_VALUE;
        int max =arr[0]; // initlize any array element. it is working positive and negative value. both cases.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("Max Value of array element is "+max);
    }
}
