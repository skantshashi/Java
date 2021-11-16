import java.util.*;

public class Recursion4 {
    public static int first=-1;
    public static int last=-1;
    public static void findOcurrence(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current= str.charAt(idx);
        if(current==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOcurrence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str="abaacdacfaah";
        findOcurrence(str,0,'a');
    }
}
