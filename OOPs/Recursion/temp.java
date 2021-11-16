import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string : ");
        String str=sc.nextLine();
        int len=str.length()-1;
        System.out.print(" rev string :");
        while(len>=0){
            System.out.print(str.charAt(len));
            len--;
        }
    }
}
