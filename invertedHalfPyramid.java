public class invertedHalfPyramid {
       public static void main(String[] args){
           int n=5;
           int count=1;
           for(int i=n;i>0;i--){
               
               for(int j=i;j>0;j--){
                  System.out.print(count+" ");
               }
               count++;
               System.out.println();
           }
       }    
}
