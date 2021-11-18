import java.util.*;
public class temp {
    public static int fibo(int n){
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int j=2;j<n;j++){

            arr[j]=arr[j-1]+arr[j-2];
            System.out.print(arr[j]+" ");
        }
        return arr[n-1];
    }
   // public static void sum=0;
    public static void main(String  args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         System.out.println(fibo(n));
    }
}
