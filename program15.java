//Read a first name and a last name and print the full name and its initials, for example Ravi Kumar → R.K

import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();                
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Initials: " +firstName.charAt(0) + "." +lastName.charAt(0));                       
        sc.close();
    }
}




