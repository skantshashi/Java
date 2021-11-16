import java.util.*;
public class Recursion1{
    public static int printFib(int a,int b, int n){
        if(n==0){
            return 0;
        }// Base condition
        int c=a+b;
        System.out.println(c);
        return printFib(b, c, n-1);// Recursive call
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        printFib(a,b,n-2);

    }
}