// Find the second largest element in an array

public class Sec_Largest_Element {

    public static void main(String[] args) {

        int arr[] = {10, 20, 5, 30, 25};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int current : arr) {
            if (current > first) {
                second = first;
                first = current;
            } else if (current < first && current > second) {
                second = current;
            }
        }
        System.out.println(second);
    }
}
