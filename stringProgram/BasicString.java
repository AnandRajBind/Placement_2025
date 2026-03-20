
public class BasicString {

    public static void main(String[] args) {

        // string declaration and initlization method 1
        String str = "Anand Raj Bind";
        System.out.println("Your  string is : " + str);

        // string declaration and initlization method 2
        String str2 = new String("Anurag Bind");
        System.out.println("Your  string is : " + str2);

        // string declaration and initlization method 3
        char ch[] = {'A', 'n', 'a', 'n', 'd'};
        String str3 = new String(ch);
        System.out.println("Your  string is : " + str3);

        // char a[]={'z','v','c'};   
        // System.out.println(a);
    }
}
