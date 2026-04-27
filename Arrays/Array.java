
public class Array {
    public static void main(String[] args) {

        // **********************Method 1****************************
        int arr[] = {10, 20, 30, 44, 50};// declare and initlization array

        System.out.println(arr[3]);// Access array element
        System.out.println(arr[2]);
        arr[2] = 15;// change 2 index value 
        System.out.println(arr[2]);
        System.out.println("Array length is:"+arr.length);


        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        // **********************Method 2****************************
        int arr2[] = new int[5];// declare array size of 5 
        arr2[2] = 145; // initlization
        System.out.println(arr2[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
