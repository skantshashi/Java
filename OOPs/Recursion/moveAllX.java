import java.util.*;

public class moveAllX {
    public static void moveAllX(String str, int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.print(newString);
            return;
        }
        char current=str.charAt(idx);
        if(current=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=current;
            moveAllX(str, idx+1, count,newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str,0,0,"");
    }
}
