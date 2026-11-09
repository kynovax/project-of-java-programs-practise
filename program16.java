//.Read 5 numbers into an array and print them in the same order and in reverse order.
import java.util.Scanner;
public class program16 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("enter the element of array at "+i+" index-: ");
            arr[i]=sc.nextInt();
            
        }
          System.out.println("elements of array in same order are-: "); 
          for(int i=0;i<5;i++){              
                System.out.print(arr[i]+"  ");                     
        }
         System.out.println(" ");      
        System.out.println("elements of array in reverse order are-: ");    
          for(int i=arr.length-1;i>=0;i--){            
                System.out.print(arr[i]+" ");           
        }
        sc.close();
    }
    
}
