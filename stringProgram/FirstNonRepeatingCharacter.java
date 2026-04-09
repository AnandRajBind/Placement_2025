import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "Anand Raj Bind";

        HashMap<Character, Integer> map = new HashMap<>();
        // Step 1 frequency count

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        // System.out.println(ch);
        // Step 2 find first non repeating

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}