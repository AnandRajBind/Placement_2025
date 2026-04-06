public class Reverse_words {
    public static void main(String[] args) {
        String str = new String("I Love you ");

        String words[] = str.split(" ");// Convert Strings to words

        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
