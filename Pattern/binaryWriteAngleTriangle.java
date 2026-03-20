import java.util.*;

public class binaryWriteAngleTriangle {

    public static void triangle(int num) {
        int start = 1;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many line print triangle");
        int num = sc.nextInt();
        triangle(5);
    }
}
