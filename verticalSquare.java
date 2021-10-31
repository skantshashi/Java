import java.util.Scanner;

public class verticalSquare {
    public static void main(String[] args){
        System.out.print("Enter the no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //upper half
        for(int i=1;i<=n;i++){
          //1st space part
          for(int j=1;j<=n-i;j++){
              System.out.print("  ");
          }
          //2nd part star 1 to ith no of column
          for(int j=1;j<=i;j++){
              System.out.print("* ");
          }
          //3rd part star i-1 no of star
          for(int j=0;j<+i-1;j++){
              System.out.print("* ");
          }
          System.out.println();
        }
        //lower half of vetical star
        for(int i=n-1;i>0;i--){
            //1st space part
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //2nd part star 1 to ith no of column
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //3rd part star i-1 no of star
            for(int j=0;j<+i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
          }

    }
    
}
