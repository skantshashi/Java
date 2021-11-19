public class BubbleSort {
    public static void main(String[] args) {
        int A[]={7,8,1,3,2,8,7,9,0,2};
        //bubble sort 
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1-i;j++){//-i because last index was sorted
              if(A[j]>A[j+1]){
                  int temp;
                  temp=A[j];
                  A[j]=A[j+1];
                  A[j+1]=temp;
              }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
