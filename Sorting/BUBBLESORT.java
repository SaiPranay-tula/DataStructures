
public class BUBBLESORT {
    
    static void bubblesort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={2,4,3,10,24,6,7};
        
        BUBBLESORT.bubblesort(arr);
        for(int a:arr)
        System.out.print(a+" ");
        }
}
