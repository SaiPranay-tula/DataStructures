
import java.util.Scanner;

public class INSERTION_SORT {

    static void insertions_sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        INSERTION_SORT.insertions_sort(arr);
        for(int a:arr)
        System.out.print(a);


        


    }
    
}
