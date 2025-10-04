
public class PassingArrayToMethods {

    // public static void change(int x) {
    //     x = 7;
    //     System.out.println(x);
    // }
    public static void change(int arr[]) {
        arr[1] = 70;
    }

//  call by value example. can not change original value 
    public static void swapValue(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
    }
//  call by reference example.can be change original value 

    public static void swap(int c[], int d[]) {
        int temp = c[0];
        c[0] = d[0];
        d[0] = temp;
    }
    public static void swapRef(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        // *****************************passing int value as a parameter*****************
        /*int x = 5;
         System.out.println(x);
         change(x); */
        // call by value. value not change in the method.it is pass the copy the data.
        // System.out.println(x);
        // it is possible 
        /*x = 7;
        ystem.out.println(x);*/
// **************************************passing array as a parameter ******************************************
        int[] arr = {12, 23, 25, 45};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);// change the  original value 

        // swap number using function(it can t be swap). call by value 
        System.out.println("Call by value");
        int c = 5;
        int d = 15;
        System.out.println(c + " " + d);
        swapValue(c, d);
        System.out.println(c + " " + d);

        // swap number using function. call by reference
        System.out.println("Call by reference ");
        int a[] = {10};
        int b[] = {20};
        System.out.println(a[0] + " " + b[0]);
        swap(a, b);
        System.out.println(a[0] + " " + b[0]);

        System.out.println("Call by reference using single array element ");
        int array[] = {25, 50};
        System.out.println(array[0] + " " + array[1]);
        swapRef(array);
        System.out.println(array[0] + " " + array[1]);
    }
}
