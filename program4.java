//Read a name (String) and an age (int) and print: Hello Ravi, you are 18 years old.
import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("**********fourth program*********");
        System.out.print("enter your name-: ");
        String name=sc.next();
        System.out.print("enter your age -: ");
        int age=sc.nextInt();
        System.out.println("Hello "+name+" you are "+age+" years old");
         sc.close();
    }
    
}
