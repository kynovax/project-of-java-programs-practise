//Read the radius of a circle (double) and print its area and circumference.
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        System.out.println("*********third program***********");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of circle-: ");
        double radius=sc.nextDouble();
        System.out.printf("area of circle is-: %.2f\n",(radius*radius)*3.14);
        System.out.println("circumference of circle is-: "+(2*3.14*radius));
         sc.close();
    }
    
}
