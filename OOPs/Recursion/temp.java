import java.util.*;
public class temp {
   // public static void sum=0;
    public static int palinDrom(int n){
        int sum=0,r;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=191;
        int temp=n;
        int b=palinDrom(n);
        if(b==temp){
            System.err.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
