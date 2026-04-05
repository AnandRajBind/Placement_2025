public class remove_Space_from_String {
    public static void main(String[] args) {
        String str = "I Love You 123";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
