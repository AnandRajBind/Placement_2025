
import java.util.Scanner;

// count the number of elements in given array greater than a given number x.
public class Count_greater {

    public static void main(String[] args) {
        System.out.println("Enter the value of X");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = {1, 8, 2, 9, 4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.printf("\n %d Element is greater than given array element\n",count );
    }
}
