
import java.util.Scanner;

public class Factorial_recu {

// factorial using recursion 
    static int factorial(int n) {
        // if(n==0 || n==1) return 1;
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Sum of Series using recursion 
    static int SumOfSeries(int n) {
        // if(n==1) return 1;
        if (n <= 1) {
            return 1;
        }
        return n + SumOfSeries(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num Value ");
        int num = sc.nextInt();
        System.out.printf("The Factorial number of %d is : %d \n", num, factorial(num));
        System.out.printf("The Sum of Series %d is : %d \n", num, SumOfSeries(num));

    }
}
