public class InsertionSort {
    public static void main(String[] args) {
        int a[]={9,8,6,4,5,2};
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int current=a[i];
            while(j>=0 && current>a[j]){
                current=a[j];
                j--;
            }
            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
