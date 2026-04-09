import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "Anand Raj Bind";
        // HashMap is used to store key-value pairs (character → frequency)
        HashMap<Character, Integer> map = new HashMap<>();
        // Step 1 frequency count

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // containsKey() checks whether the given key exists in the HashMap
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);// put() inserts a new key-value pair or updates the value if key already
                                             // exists
            } else {
                map.put(ch, 1);
            }
        }
        // System.out.println(ch);
        // Step 2 find first non repeating

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (map.get(ch) == 1) {// get() retrieves the value associated with the given key
                System.out.println(ch);
                break;
            }
        }
    }
}