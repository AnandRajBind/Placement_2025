
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int nums = sc.nextInt();

// Using for Loop
// for(int i=0; i<nums; i++){
//     for(int j=0;j<=i; j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }


// Using while Loop
int i =0;

while(i<nums){
int j=0;
while(j<i){
    System.out.print("* ");
    j++;
}
System.out.println();
i++;
}
}
}
