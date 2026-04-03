 

public class StringBuff {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Anand Raj ");

        // string buffer insert append method
        sb.append("Bind");
        System.out.println(sb);

        // string buffer insert method
        sb.insert(6, " Anurag ");
        System.out.println(sb);

        // string buffer capacity  method
        sb.capacity();
        System.out.println(sb.capacity());

        // string buffer reverse method
        sb.reverse();
        System.out.println(sb);

        // StringBuffer st = new StringBuffer("Anand Raj");
        // st.insert(9, "Bind");
        // System.out.printf(" %s \n", st);

        // st.reverse();
        // System.out.format("%s \n", st);

        // st.capacity();
        // System.out.println(st.capacity());
    }
}
