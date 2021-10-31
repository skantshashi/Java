import java.util.*;
 
public class linearSearchtwodarray{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the values of rows and cols : ");
       int rows = sc.nextInt();
       int cols = sc.nextInt();
 
       //int[][] numbers = new int[rows][cols];
       int numbers[][]= new int[rows][cols];
       System.out.print("Enter the elements of array : ");
       //input
       //rows controle 
       for(int i=0; i<rows; i++) {
           //columns controle 
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
 
       int x = sc.nextInt();
 
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
 
     
 
   }
}
