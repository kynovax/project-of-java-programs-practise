//Read a string and print it in reverse using a loop.
import java.util.Scanner;
public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string-: ");
        String s=sc.nextLine() ;
         for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        sc.close();

     
       }
    
}
