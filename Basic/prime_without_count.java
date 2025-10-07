
import java.util.Scanner;

public class prime_without_count {

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num Value");
        int num = sc.nextInt();
        if (prime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is a Not Prime Number.");
        }
    }
}
