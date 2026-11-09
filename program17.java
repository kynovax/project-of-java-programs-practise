//Read n numbers into an array and print their sum and average.
import java.util.Scanner;
public class program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array -: ");
        int n= sc.nextInt();
        int sum=0;

        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter the element of array at "+i+" index-:" );
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of all elements of arrray is-: "+sum);
        System.out.println("average of element of array is-: "+(sum/n));
        sc.close();    
    }
    
}
