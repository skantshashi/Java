import java.util.Scanner;

public class FunctionCall {
    public static int multiPly(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static int sumoftwono(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no :");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int mul =multiPly(a,b);
        System.out.println("multiplication is :"+mul);
        int sum= sumoftwono(a,b);
        System.out.println("sum of two no is :"+sum);
        return;
    }
}
