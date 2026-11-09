//Read a string and print its length, uppercase form, and lowercase form.
import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string-: ");
        String s = sc.nextLine();
        System.out.println("Length of string-: " + s.length());
        System.out.println("Uppercase-: " + s.toUpperCase());
        System.out.println("Lowercase-: " + s.toLowerCase());
        sc.close();
    }
}
