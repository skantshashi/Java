import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
             System.out.print("key found at "+i);
            }
        }
    }
}   
