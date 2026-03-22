
public class MoveZeroToFirst {

    public static void main(String[] args) {
        int arr[] = {0, 10, 20, 3, 0, 0, 5, 15};
        int slow = arr.length-1;
        for (int fast = arr.length-1; fast >= 0; fast--) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow--;
            }
        }
        for (int i = 0; i <=slow; i++) {
                 arr[i]=0;
         }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
