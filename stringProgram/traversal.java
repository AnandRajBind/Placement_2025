
import java.util.Scanner;

public class traversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String str = sc.nextLine();

        // String str = new String("Anand Raj Bind");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // System.out.println(str);
    }
}

