import java.util.*;
;public class Recursion2 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x=3,n=10;
        int c=power(x,n);
        System.out.println(c);
    }
}
