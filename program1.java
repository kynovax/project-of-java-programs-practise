//Read two integers and print their sum, difference, product, and quotient.
import java.util.Scanner;
public class program1{
    public static void main(String[]args){
        System.out.println("**********first program***********");
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value of x-: ");
        int x=sc.nextInt();
        System.out.print("enter ther value of y-: ");
        int y=sc.nextInt();
        System.out.println("sum of x and y is-: "+(x+y));
        System.out.println("difference of x and y is-: "+(x-y));
        System.out.println("product of x and y is-: "+(x*y));
        System.out.println("quotient of x /y is-: "+(x/y));  
        sc.close();
     }
}