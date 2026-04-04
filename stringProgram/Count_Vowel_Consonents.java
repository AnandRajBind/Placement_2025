
import java.util.Scanner;

public class Count_Vowel_Consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            // char ch[] =str.toCharArray();//

            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println(Character.isLetter(ch));
        }
        System.out.println("Vowels is: " + vowels + " Consonets is: " + consonants);
        sc.close();
    }
}
