//Read a temperature in Celsius and convert it to Fahrenheit.
import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the temperature in celcius-: ");
        float temperatur=sc.nextFloat();
        float ferenheit=(temperatur*9/5)+32;
        System.out.println(" temperarture in ferenheit is-: "+ferenheit);    
         sc.close();    
    }
    
}
