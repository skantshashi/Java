import java.util.*;
// reverse string using recursion 
public class ReverseAstring {
    public static void revStr(String str, int indx){
        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        revStr(str, indx-1);
    }
    public static void main(String[] args) {
        String str="abcd jfas jdlka";
        revStr(str,str.length()-1);
    }
}
