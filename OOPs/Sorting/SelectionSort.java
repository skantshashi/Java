public class SelectionSort {
    public static void main(String[] args) {
        int a[]={9,8,0,5,6,3,2};
        // Selection sort means one itteration one swap
        for(int i=0;i<a.length-1;i++){//length minus one because last element will automatically sorted
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
