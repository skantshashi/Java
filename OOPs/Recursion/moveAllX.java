import java.util.*;

public class moveAllX {
    public static int count=0;
    public static void moveAllX(String str,int idx,char element,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+=element;
            }
            System.out.print(newString);
            return;
        }
        char current=str.charAt(idx);
        if(current== element){
            count++;
            moveAllX(str,idx+1,element, newString);
        }
        else{
            newString+=current;
            moveAllX(str,idx+1,element, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str,0,'x',"");
    }
}
