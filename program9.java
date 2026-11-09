//Read two numbers and swap them using a third variable Print them before and afte
import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number-: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number-: ");
        int b = sc.nextInt();
         System.out.println("||before swapping||");
        System.out.println("First number-: " + a);
        System.out.println("Second number-: " + b);          
        int temp = a;
        a = b;
        b = temp;
        System.out.println("||After swapping||");
        System.out.println("First number-: " + a);
        System.out.println("Second number-: " + b);

        sc.close();
    }
}

    