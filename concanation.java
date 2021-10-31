import java.util.Scanner;
import java.util.StringJoiner;

public class concanation {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        String firstname=a.next();
        String lastname=a.next();
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
    }
    
}
