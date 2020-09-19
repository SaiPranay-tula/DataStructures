//import java.lang.Math;
import java.util.*;


class AL {

    public static void main(String[] args) {
        
        
        List<Long> arr=new ArrayList<Long>();
        arr.add(0,1l);
        arr.add(1,2l);
        arr.add(2,2l);
        arr.add(3,3l);

        List<Long> res=new ArrayList<>();
        int n=arr.size();
        long[] a=new long[n];
        a[0]=arr.get(0);
        for(int i=1;i<n;i++)
        {
            a[i]=a[i-1]+arr.get(i);
        }
        for( long j:a)
        System.out.print(j+"  ");
        System.out.println();

        res.add(arr.get(0)*0);
        for(int i=1;i<n;i++)
        {
            long count=(arr.get(i)*i)-a[i-1];
            res.add(count);
        }
        
        System.out.println(res);
    }
    
}
