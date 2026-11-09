//Read two strings and print whether they are equal, ignoring case.
 import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string-: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string-: ");
        String str2 = sc.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
        sc.close();
    }
}

    

