import java.util.Scanner;

public class updateBit {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the the bit :");
        int operation = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
       int n = 5;
       int pos = 1;
      
       int bitMask = 1<<pos;
       if(operation == 1) {
           //set
           int newNumber = bitMask | n;
           System.out.println(newNumber);
       } else {
        //clear
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
       }
      
    }
 
}
