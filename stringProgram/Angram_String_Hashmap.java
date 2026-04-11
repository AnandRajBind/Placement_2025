
import java.util.HashMap;

public class Angram_String_Hashmap {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Angram");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1 → store frequency of str1
        for (char ch : str1.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Step 2 → decrese the frequency of str2 using str1.
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not Angram");
            }
            map.put(ch, map.get(ch) - 1);
        }
        
        // Step 3 → check all values
        for (int value : map.values()) {
            if (value != 0) {
                System.out.println("Not Angram");
            }
        }
        System.out.println("Angram");
    }
}
