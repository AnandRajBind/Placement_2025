// palindrome string using two pointer 
public class Palindrome_String_using_Two_Pointer {
    public static void main(String[] args) {
        String str = new String("abc");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println(str + " is not a  palindroem number");
                return;
            }
        }
        System.out.println(str + " is  palindrome string");
    }
}
