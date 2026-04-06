public class reverse_Words_Two_Pointer {
    public static void main(String[] args) {

        String str = new String("Anand Raj Bind");

        char charArray[] = str.toCharArray(); // convert String to character Array.
        int start = 0, end = charArray.length - 1;
        // step one reversed whole string.
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(charArray);

        // step 2 reverse each words.

        int wordStart = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ' || i == charArray.length - 1) {
                int wordEnd;

                if (charArray[i] == ' ') {
                    wordEnd = i - 1;
                } else {
                    wordEnd = i;
                }

                while (wordStart < wordEnd) {
                    char temp = charArray[wordStart];
                    charArray[wordStart] = charArray[wordEnd];
                    charArray[wordEnd] = temp;

                    wordStart++;
                    wordEnd--;
                }
                wordStart = i + 1;
            }
        }
        System.out.println(charArray);
    }
}
