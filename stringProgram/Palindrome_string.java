
// palindrome string check using boolean variable 
public class Palindrome_string {
    public static void main(String[] args) {
        String str = new String("abc");
        boolean isPalindroem = true;

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindroem = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindroem) {
            System.out.println(str + " is  palindrome string");
        } else {
            System.out.println(str + " is not palindrome string");
        }
    }
}
