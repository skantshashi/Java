import java.util.*;

public class Recursion3 {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return pow(x,n/2)*pow(x, n/2);
        }
        // if n is odd
        else{
            return pow(x,n/2)*pow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(pow(x,n));
    }
}
