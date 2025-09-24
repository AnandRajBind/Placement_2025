
import java.util.Scanner;

class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num You value");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=  num; i++) {
            sum = sum + i;
            // print the  n number of series 
            System.out.println(i);
        }
        //print the  sum of n number  series 
        System.out.println(sum);
    }
}


