// reverse String using recursion 

public class reverse_string_using_recurson {

    public static void reverse(char arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String str = new String("abcd");
        char arr[] = str.toCharArray();
        reverse(arr, 0, arr.length - 1);
        System.out.println(str);
        System.out.println(arr);
    }
}
