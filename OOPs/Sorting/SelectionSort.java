public class SelectionSort {
    public static void main(String[] args) {
        int a[]={9,8,0,5,6,3,2};
        // Selection sort 
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp;
            temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
