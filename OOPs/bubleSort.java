import java.util.*;

public class bubleSort {

    public static void bubblesort(int arr[],int n){
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n-1-i;j++){
                 if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                     flag=1;
                 }
            }
            if(flag==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elemenet of array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr,size);
        System.out.print("Bubble sorted array :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
