//Read the total number of days and convert it into years, weeks, and remaining days.
import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        System.out.print("Enter the total number of days-: ");
        int totalDays = sc.nextInt();
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;
        System.out.println("Years-: " + years);
        System.out.println("Weeks-: " + weeks);
        System.out.println("Remaining days-: " + days);

        sc.close();
    }


    
}
