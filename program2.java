//Read the length and breadth of a rectangle and print its area and perimeter
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***********second program**************");
        System.out.print("enter the length of rectangle-: ");
        float length=sc.nextFloat();
        System.out.print("enter the breadth of rectangle-: ");
        float breadth=sc.nextFloat();
        System.out.printf("area of rectangle-: %.2f\n",(length*breadth));
        System.out.println("perimeter of rectangle is-: "+(2*(length+breadth)));
         sc.close();
    }
    
}
