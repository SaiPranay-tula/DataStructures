

public class QUICKSORT {


    static void qsort(int[] arr,int left,int right)
    {
        if(left<right)
        {
        int pivot,i,j;
        pivot=left;
        i=left;
        j=right;
        while(i<j){
        while(arr[i]<=arr[pivot]&&i<right)
        i++;
        while(arr[j]>arr[pivot])
        j--;

        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[j];
    arr[j]=arr[pivot];
    arr[pivot]=temp;
    qsort(arr,left,j-1);
    qsort(arr,j+1,right);

        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,10,24,6,7};
        
        QUICKSORT.qsort(arr,0,arr.length-1);
        for(int a:arr)
        System.out.print(a+" ");
    }
    
}
