import java.util.Scanner;


public class Rotate {

    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
       return  gcd(b%a,a);

    }
    public void rotate(int[] arr,int ar)
    {
        int num=gcd(arr.length,ar);
        int temp,j,d;
        for(int i=0;i<num;i++)
        {
            j=i;
            temp=arr[i];
            d=(j+ar)%arr.length;
            while(i!=d){
                arr[j]=arr[d];
                j=d;
                d=(j+ar)%arr.length;
            }
            arr[j]=temp;


        }

    }

    public void reverse(int arr[],int s,int l)
    {
        int start=s,last=l;
        for(int i=start;i<=last;i++)
        {
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last--;

        }

        
    }

    public void rotate1(int[] arr,int d)
    {
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int x: arr)
        System.out.print(x);

    }

    public static void main(String[] args) {

        System.out.println("enter number of integers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter number of rotations");
        int ar=sc.nextInt();
        //new Rotate().rotate(arr, ar);
        //for( int x:arr)
        //System.out.print(x);
        sc.close();
    
    
        new Rotate().rotate1(arr,ar);



    




        

    }
    
}