
public class Min_Array_Element {

    public static void main(String[] args) {
        int arr[] = {3,10, 20, 30, 10, 20, 5,1};
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println(" Min value of the Array  Element is " + Min);
    }
}
