
import java.util.Scanner;

class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num You value");
        int num = sc.nextInt();
        int sum = 0;
        //print the  sum of n number  series 
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            // print the  n number of series 
            System.out.print(" " + i);
        }
        System.out.printf(" The sum of series  %d  is: %d \n", num, sum);
        // factorial number 
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.print(" " + fact);
        }
        System.out.printf(" The factorial of %d  is: %d \n", num, fact);
    }
}
