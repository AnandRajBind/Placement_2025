public class reverseString {
    public static void main(String[] args) {
        String str = new String("Anand");
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reversedString = ch + reversedString;
        }
        System.out.println(reversedString);
    }
}
