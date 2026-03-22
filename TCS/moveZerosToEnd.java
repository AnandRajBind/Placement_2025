
public class moveZerosToEnd {

    public static void main(String[] args) {
        int arr[] = {0, 10, 20, 3, 0, 0, 5, 15};
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for (int i = slow; i <arr.length; i++) {
                 arr[i]=0;
         }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
