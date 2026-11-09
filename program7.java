//Read the marks of 3 subjects and print the total and the average.
import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks in sub1 out of 100 -: ");
        float sub1=sc.nextFloat();
        System.out.print("enter marks in sub2 out of 100 -: ");
        float sub2=sc.nextFloat();
        System.out.print("enter marks in sub3 out of 100 -: ");
        float sub3=sc.nextFloat();
        float total=(sub1+sub2+sub3);
        float average=(total/3);
        System.out.println("total marks out of 300 is-: "+total);
        System.out.println("average of marks was-: "+average);
         sc.close();
    }       
}
