
import java.util.Scanner;

public class Reverse_Triangle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num = sc.nextInt();

        
        // Using for Loop


        // for (int i = num; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Using while Loop

        int i = num;

        while(i>0)
        {
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

