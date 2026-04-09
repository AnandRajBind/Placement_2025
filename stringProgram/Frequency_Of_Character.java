import java.util.HashMap;

public class Frequency_Of_Character {
    public static void main(String[] args) {
        String str = new String("Anand Raj Bind");
        char charArray[] = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char current : charArray) {
            if (current != ' ') {
                if (map.containsKey(current)) {
                    map.put(current, map.get(current) + 1);// getOrDefault() returns the value of the key if present otherwise returns the default value
                } else {
                    map.put(current, 1);
                }
            }
        }
        // keySet() returns all the keys present in the HashMap
        for (Character key : map.keySet())
            System.out.println(key + "->" + map.get(key));
    }
}
