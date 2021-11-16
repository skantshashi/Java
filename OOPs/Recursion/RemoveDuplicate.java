import java.net.PortUnreachableException;
import java.util.*;

public class RemoveDuplicate {
    public static boolean map[]=new boolean[26];
    public static void RemoveDuplicate(String str, int idx ,String newString){
       if(idx==str.length()){
           System.out.println(newString);
           return;
       }
        char current=str.charAt(idx);
        if(map[current-'a']==true){
            RemoveDuplicate(str, idx+1, newString);
        }
        else{
            newString+=current;
            map[current-'a']=true;
            RemoveDuplicate(str, idx+1, newString);
            
        }
    }
    public static void main(String[] args) {
        String str="abbxxxcccdd";
        RemoveDuplicate(str,0, "");
    }
}
