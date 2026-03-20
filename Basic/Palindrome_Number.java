
import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num value");
        int num = sc.nextInt();
        int rev = 0, rem = 0, original , sum=0;
        original = num;

        // for revrse of digit 
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            // for sum of  Digit
            sum=sum+rem;
        }
        // Check palindrome or not 
        if (original == rev) {
            System.out.printf("%d  is palindrome number \n", rev);
        } else {
            System.out.printf("%d is not palindrome number \n", rev);
        }
        // print sum of digit 
         System.out.printf(" your digit is : %d and sum of digit is: %d \n", original, sum);

    }
}
