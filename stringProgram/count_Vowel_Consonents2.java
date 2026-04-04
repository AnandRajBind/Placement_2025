
//count the vowels and consonents using indexOf() method.

import java.util.Scanner;

public class count_Vowel_Consonents2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        String VowelsStr = "aeiou";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (VowelsStr.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels is: " + vowels + "Consonents is : " + consonants);
    }
}
