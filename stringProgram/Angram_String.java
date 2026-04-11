
// Check the string are angram or not by using the sorting method. if both strings character and frequency are same then Angram string other wise not.
import java.util.Arrays;

public class Angram_String {
    public static void main(String[] args) {
        String str1 = new String("silent");
        String str2 = new String("listen");
        String str3 = "silent";

        // System.out.println(str1==str2);// false
        // System.out.println(str1==str3);// false
        // System.out.println(str1.equals(str3));// true

        if (str1.length() != str2.length()) {
            System.out.println("Not Angram");
            return;
        }

        char charArray1[] = str1.toCharArray();
        char charArray2[] = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Angram String");
        } else {
            System.out.println(" Not Angram");
        }
    }
}
