
public class SELECTIONSORT {


    static void selectionsort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int ind=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[ind]>arr[j])
                ind=j;

                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
            }


        }
    }


    public static void main(String[] args) {
        
        int arr[]={2,4,3,10,24,6,7};
        
        SELECTIONSORT.selectionsort(arr);
        for(int a:arr)
        System.out.print(a+" ");
        }
    }
    

