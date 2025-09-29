
public class Traversal {

    public static void main(String args[]) {
        int marks[] = {45, 55, 30, 95, 45, 55};

        // Array Traversal
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 35) {
                System.out.println("This student marks is less than 35 and roll number is:" + i);
            } else {
                System.out.println(" Marks is greater than thirty five " + marks[i]);
            }
        }
    }
}
