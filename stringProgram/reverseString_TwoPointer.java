
public class reverseString_TwoPointer {

    public static void swap(char arr[], int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(char arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = new String("abcd");
        char arr[] = str.toCharArray(); // convert String to character because string are immutable
        reverse(arr, 0, arr.length - 1);
        System.out.println(str);
        System.out.println(arr); // character arry directly print hota because java assume internally
                                 // string/text.
    }
}
