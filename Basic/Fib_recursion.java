// fibonacci series using recursion 
import java.util.Scanner;

public class Fib_recursion {

    static int fibonacci(int n) {
        // Base Condition
        if (n == 0) return 0;
        if (n == 1) return 1;
        // if(n<=1) return 1;
         else   return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The num Value ");
        int num = sc.nextInt();
        int res = fibonacci(num);
        // nth term of fibonacci series 
        System.out.println("The fibonacci Series of " + num + " is: " + res + "");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i)+" ");
        }
     }
}

