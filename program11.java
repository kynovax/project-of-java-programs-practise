//Read a string and print its first character, last character, and the character at position 3.
import java.util.Scanner;
public class program11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string-: ");
        String s = sc.nextLine();
        System.out.println("First character-: " + s.charAt(0));
        System.out.println("Last character-: " + s.charAt(s.length() - 1));
         System.out.println("Character at position 3-: " + s.charAt(2));
        sc.close();
    }
    
}
