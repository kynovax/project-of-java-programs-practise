//Read the price and quantity of an item and print the total bill using printf with 2 decimal places.
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("******fifth program******");
        System.out.print("enter the price of product in Rs. -: ");
        float price=sc.nextFloat();
        System.out.print("enter the quantity of product in kg or numbers-: ");
        float quantity=sc.nextFloat();
        System.out.printf("your total bill is-: %.2f\n",(price*quantity));
         sc.close();   
    }    
}
