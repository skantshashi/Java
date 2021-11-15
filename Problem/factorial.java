import java.util.*;

public class factorial{
    public static int facto(int n){
        if(n==1 || n==0 || n<0){
            return 1;
        }
        else return n*facto(n-1);

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no : ");
        int a=sc.nextInt();
        int b=facto(a);
        System.out.print("factorial is : "+b);
    }
}