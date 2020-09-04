package Sorting;
import java.util.Scanner;

class BinarySearch{
    public int BinSr(final int[] arr,final int value)
    {
        int low=0,high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==value)
            return mid;
            else if(arr[mid]<value)
            low=mid+1;
            else 
            high=mid-1;
        }
      return -1;
    }
    public static void main(final String[] args) {
                final BinarySearch obj=new BinarySearch();
                final Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Num of elements");
                final int n=sc.nextInt();
                final int arr[]=new int[n];
                System.out.println("Enter the Elements");
                for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
                System.out.println("Enter the value to be searched");
                final int value=sc.nextInt();
                System.out.println(obj.BinSr(arr, value));
                sc.close();

    }
        
    }
